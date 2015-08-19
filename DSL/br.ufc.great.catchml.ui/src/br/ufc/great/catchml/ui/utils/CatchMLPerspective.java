package br.ufc.great.catchml.ui.utils;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.jdt.ui.JavaUI;

public class CatchMLPerspective implements  org.eclipse.ui.IPerspectiveFactory{

	 private static final String WIZ_CATCHML_PROJECT = "br.ufc.great.catchml.ui.wizards.newcatchmlproject";
	 private static final String WIZ_CATCHML_FILE = "br.ufc.great.catchml.ui.wizards.newcatchmlfile";
	 private static final String WIZ_FILE = "org.eclipse.ui.wizards.new.file";
     private static final String WIZ_FOLDER = "org.eclipse.ui.wizards.new.folder";
			 
	@Override
	public void createInitialLayout(IPageLayout layout) {
		 defineActions(layout);
		 defineLayout(layout);		
	}

	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
		layout.addNewWizardShortcut(WIZ_CATCHML_FILE);
		layout.addNewWizardShortcut(WIZ_CATCHML_PROJECT);
		layout.addNewWizardShortcut(WIZ_FOLDER);
        layout.addNewWizardShortcut(WIZ_FILE);
        layout.addNewWizardShortcut("org.eclipse.ui.editors.wizards.UntitledTextFileWizard");
        
        // Add "show views".
        layout.addShowViewShortcut(JavaUI.ID_PACKAGES);
        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW );
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
        layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	}
	
	public void defineLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        
        IFolderLayout topLeft =
                layout.createFolder("topLeft", IPageLayout.LEFT, (float) 0.26, editorArea);
        topLeft.addView(JavaUI.ID_PACKAGES);
        
        
        IFolderLayout bot =
                layout.createFolder("bot", IPageLayout.BOTTOM, (float) 0.60, editorArea);
        bot.addView(IPageLayout.ID_PROBLEM_VIEW);
        bot.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bot.addView(IPageLayout.ID_TASK_LIST);
        bot.addView("org.eclipse.pde.runtime.LogView");
        
        IFolderLayout botLeft =
                layout.createFolder("botLeft", IPageLayout.BOTTOM, (float) 0.60, JavaUI.ID_PACKAGES);
        botLeft.addView(IPageLayout.ID_OUTLINE);
	}
}
