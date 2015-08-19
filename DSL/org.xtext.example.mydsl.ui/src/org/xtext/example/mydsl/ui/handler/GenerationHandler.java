package org.xtext.example.mydsl.ui.handler;

import java.io.PrintStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.example.mydsl.converter.MyDslToCAEHV;
import org.xtext.example.mydsl.myDsl.SystemDeclaration;
import org.xtext.example.mydsl.ui.utils.MyDslConsoleUtils;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GenerationHandler extends AbstractHandler implements IHandler {
	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		final IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
				IFile.class);

		if (file != null) {
			if (activeEditor instanceof XtextEditor) {
				((XtextEditor) activeEditor).getDocument().readOnly(
						new IUnitOfWork<Boolean, XtextResource>() {
							public Boolean exec(XtextResource state)
									throws Exception {
								SystemDeclaration model = null;
								MyDslToCAEHV caehModel = null;
								TreeIterator<EObject> tree = state
										.getAllContents();
								while (tree.hasNext()) {
									EObject object = tree.next();
									if (object instanceof SystemDeclaration) {
										model = (SystemDeclaration) object;
										caehModel = new MyDslToCAEHV(model);
										break;
									}
								}

								IProject project = file.getProject();
								IFolder resGenFolder = project
										.getFolder("res");
								
								if (!resGenFolder.exists()) {
									try {
										resGenFolder.create(true, true,
												new NullProgressMonitor());										
									} catch (CoreException e) {
										return null;
									}
								}								
								
								IFolder jcaehvGenFolder = project.getFolder("res/jcaehv");
								
								if (!jcaehvGenFolder.exists()) {
									try {
										jcaehvGenFolder.create(true, true,
												new NullProgressMonitor());										
									} catch (CoreException e) {
										return null;
									}
								}
								
								final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider
										.get();
								fsa.setMonitor(new NullProgressMonitor());
								fsa.setProject(project);
								
								String path = jcaehvGenFolder.getFullPath().toString().substring(1).replace("\\", "/");
								String[] splittedPath = path.split("/");
								int index = path.indexOf(splittedPath[1]);
								String correctPath = path.substring(index);				
								
								fsa.setOutputPath(correctPath);								

								StringBuffer buffer = caehModel.buildModel();
								fsa.generateFile(model.getName() + ".txt", 
										buffer.subSequence(0, buffer.length()));
								
								MessageConsole console = MyDslConsoleUtils.getBeeLangConsole();
								console.activate();
								PrintStream stream = MyDslConsoleUtils.getConsoleOutputStream(console);
								stream.println(buffer.subSequence(0, buffer.length()));
								
								return Boolean.TRUE;
							}
						});

			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
