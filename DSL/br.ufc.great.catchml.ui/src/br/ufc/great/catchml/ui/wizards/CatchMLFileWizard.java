package br.ufc.great.catchml.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

public class CatchMLFileWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	private IStructuredSelection selection;
	private CatchMLFileWizardPage newFileWizardPage;
	private IWorkbench workbench; 
	//private IConfigurationElement configElement;

    public CatchMLFileWizard() {
        setWindowTitle("New CatchML File");
    } 

    @Override    
    public void addPages() {
    	newFileWizardPage = new CatchMLFileWizardPage(selection);
    	addPage(newFileWizardPage);
    }
    
    @Override
    public boolean performFinish() {
    	boolean result = false;
    	IFile file = newFileWizardPage.createNewFile();
    	result = file != null;
    	 
        if (result) {
            try {
                IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
            } catch (PartInitException e) {
                e.printStackTrace();
            }
        } // else no file created...result == false
        
        return result;
    }


    public void init(IWorkbench workbench, IStructuredSelection selection) {
    	this.workbench = workbench;
    	this.selection = selection;
    }

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		//this.configElement = config;
	}
}