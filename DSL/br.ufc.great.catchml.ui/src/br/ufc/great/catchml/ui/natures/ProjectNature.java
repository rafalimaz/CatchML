package br.ufc.great.catchml.ui.natures;
 
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
 
import org.eclipse.core.runtime.CoreException;
 
public class ProjectNature implements IProjectNature {
 
    public static final String NATURE_ID = "br.ufc.great.catchml.ui.natures.projectNature";

	@Override
	public void configure() throws CoreException {
				
	}

	@Override
	public void deconfigure() throws CoreException {
		
	}

	@Override
	public IProject getProject() {
		return null;
	}

	@Override
	public void setProject(IProject project) {
		
	} 
}