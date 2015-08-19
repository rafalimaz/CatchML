package br.ufc.great.catchml.ui.wizards;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class CatchMLFileWizardPage extends WizardNewFileCreationPage {

	public CatchMLFileWizardPage(IStructuredSelection selection) {
		 super("NewCatchMLFileWizardPage", selection);  
		 setTitle("CatchML File");
		 setDescription("Creates a new CatchML File.");
		 setFileExtension("cml");
	}

	@Override
	protected InputStream getInitialContents() { 
		return null; // ignore and create empty comments  
	}
}