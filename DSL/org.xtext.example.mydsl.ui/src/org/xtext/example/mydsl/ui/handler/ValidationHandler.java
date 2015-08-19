package org.xtext.example.mydsl.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

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
								
								String platformString = state.getURI()
										.toPlatformString(true);
								IFile myFile = ResourcesPlugin.getWorkspace()
										.getRoot()
										.getFile(new Path(platformString));
								
								int depth = IResource.DEPTH_INFINITE;
								try {
									myFile.deleteMarkers(IMarker.PROBLEM, true,
											depth);
								} catch (CoreException e) {
									System.out.println("Exception " + e.getMessage());
								}								
								
								IHandlerService handlerService = (IHandlerService) activeEditor.getSite().getService(IHandlerService.class);
								handlerService.executeCommand("org.xtext.example.mydsl.MyDsl.validate", null);

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
