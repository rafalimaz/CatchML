package br.ufc.great.catchml.ui.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import br.ufc.great.catchml.ui.natures.CustomProjectSupport;

public class CatchMLProjectWizard extends Wizard implements INewWizard, IExecutableExtension{
	private WizardNewProjectCreationPage _pageOne;
	//private IStructuredSelection selection;
	//private IWorkbench workbench;
	private IConfigurationElement _configurationElement;
	
	public CatchMLProjectWizard() {
	    setWindowTitle("New CatchML Project");
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _pageOne = new WizardNewProjectCreationPage("CatchML Project Wizard");
	    _pageOne.setTitle("CatchML Project");
	    _pageOne.setDescription("Creates a new CatchML Project.");
	 
	    addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
	    String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	    } // else location == null
	 
	    CustomProjectSupport.createProject(name, location);
	    
	    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
	 
	    return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//this.workbench = workbench;
    	//this.selection = selection;		
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}
}
