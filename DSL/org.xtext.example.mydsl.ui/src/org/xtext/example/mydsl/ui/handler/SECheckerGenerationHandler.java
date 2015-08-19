package org.xtext.example.mydsl.ui.handler;
/*package org.xtext.example.mydsl.ui.handler;

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
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.impl.ModelImpl;
import org.xtext.example.mydsl.ui.utils.SECheckerModel;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GenerationHandler extends AbstractHandler implements IHandler {
	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;
	
	@Inject
	private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		final IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
				IFile.class);

		if (file != null) {
			if (activeEditor instanceof XtextEditor) {
				((XtextEditor) activeEditor).getDocument().readOnly(
						new IUnitOfWork<Boolean, XtextResource>() {
							public Boolean exec(XtextResource state)
									throws Exception {

								Model model = null;
								SECheckerModel genericModel = null;
								TreeIterator<EObject> tree = state.getAllContents(); 
								while(tree.hasNext())
								{	
									EObject object = tree.next();
									if (object instanceof ModelImpl) {
										model = (Model) object;										
										genericModel = new SECheckerModel(model);
										break;
									}
								}
								
								IProject project = file.getProject();
								IFolder resGenFolder = project.getFolder("src-gen/CKS2XML");
								if (!resGenFolder.exists()) {
									try {
										resGenFolder.create(true, true,
												new NullProgressMonitor());
									} catch (CoreException e) {
										return null;
									}
								}
								final EclipseResourceFileSystemAccess fsa = fileAccessProvider.get();
								fsa.setOutputPath(resGenFolder.getFullPath().toString());
								
								StringBuffer[] buffer = genericModel.buildModel();
								fsa.generateFile(model.getName() + ".xml", 
										buffer[0].subSequence(0, buffer[0].length()));
								
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
}*/




