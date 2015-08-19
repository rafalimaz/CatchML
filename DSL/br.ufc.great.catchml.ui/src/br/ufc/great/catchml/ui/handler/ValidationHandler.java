package br.ufc.great.catchml.ui.handler;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import br.ufc.great.catchml.catchML.SystemDeclaration;
import br.ufc.great.catchml.converter.CatchMLToCAEHV;
import br.ufc.great.catchml.ui.utils.CatchMLProgressOperation;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ValidationHandler extends AbstractHandler implements IHandler {
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
								/*
								 * String platformString = state.getURI()
								 * .toPlatformString(true); IFile myFile =
								 * ResourcesPlugin.getWorkspace() .getRoot()
								 * .getFile(new Path(platformString));
								 */

								int depth = IResource.DEPTH_INFINITE;
								try {
									/*
									 * myFile.deleteMarkers(IMarker.PROBLEM,
									 * true, depth);
									 * myFile.deleteMarkers(IMarker.MESSAGE,
									 * true, depth);
									 */
									ResourcesPlugin
											.getWorkspace()
											.getRoot()
											.deleteMarkers(IMarker.PROBLEM,
													true, depth);
								} catch (CoreException e) {
									System.out.println("Exception "
											+ e.getMessage());
								}

								SystemDeclaration model = null;
								CatchMLToCAEHV caehModel = null;
								TreeIterator<EObject> tree = state
										.getAllContents();
								while (tree.hasNext()) {
									EObject object = tree.next();
									if (object instanceof SystemDeclaration) {
										model = (SystemDeclaration) object;
										caehModel = new CatchMLToCAEHV(model);
										break;
									}
								}

								IProject project = file.getProject();
								IFolder resGenFolder = project.getFolder("res");

								if (!resGenFolder.exists()) {
									try {
										resGenFolder.create(true, true,
												new NullProgressMonitor());
									} catch (CoreException e) {
										return null;
									}
								}

								IFolder jcaehvGenFolder = project
										.getFolder("res/jcaehv");

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

								String path = jcaehvGenFolder.getFullPath()
										.toString().substring(1)
										.replace("\\", "/");
								String[] splittedPath = path.split("/");
								int index = path.indexOf(splittedPath[1]);
								String correctPath = path.substring(index);

								fsa.setOutputPath(correctPath);

								CatchMLProgressOperation operation = new CatchMLProgressOperation(
										caehModel,
										"Building JCAEVH model",
										"Building JCAEHV model operation was cancelled",
										"Error building JCAEHV model");
								if (operation.execute()) {
									IHandlerService handlerService = (IHandlerService) activeEditor
											.getSite().getService(
													IHandlerService.class);
									handlerService
											.executeCommand(
													"br.ufc.great.catchml.CatchML.validate",
													null);

									IFile file = project.getFile(correctPath
											+ "/log.txt"); 
									StringBuffer sb = new StringBuffer();

									if (file.exists()) {
										InputStream in = file.getContents();
										InputStreamReader is = new InputStreamReader(
												in);

										BufferedReader br = new BufferedReader(
												is);
										String read = br.readLine();

										while (read != null) {
											sb.append(read + "\n");
											read = br.readLine();
										}
									}

									sb.append("\n" + model.getName() + ": "
											+ new Date().toString());
									sb.append("\n\n" + operation.getBuffer());
									fsa.generateFile("log.txt",
											sb.subSequence(0, sb.length()));
								}

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
