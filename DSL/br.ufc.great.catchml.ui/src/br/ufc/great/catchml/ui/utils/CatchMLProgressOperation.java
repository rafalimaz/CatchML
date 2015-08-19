package br.ufc.great.catchml.ui.utils;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

import br.ufc.great.catchml.converter.CatchMLToCAEHV;

public class CatchMLProgressOperation implements IRunnableWithProgress {
		private CatchMLToCAEHV caehModel;
		private StringBuffer buffer;
		private boolean done;
		private boolean error;
		private String cancelMessage;
		private String errorMessage;
		private String title;
		
		
		public CatchMLProgressOperation(CatchMLToCAEHV caehModel, String title, String cancelMessage, String errorMessage) {
			this.caehModel = caehModel;
			this.title = title;
			this.cancelMessage = cancelMessage;
			this.errorMessage = errorMessage;
		}
		
		public boolean execute(){			
			try {
				new ProgressMonitorDialog(null).run(true, true, this);
			} catch (InvocationTargetException e) {
				done = false;
				MessageDialog.openError(null, "Error", e.getMessage());
			} catch (InterruptedException e) {
				done = false;
				MessageDialog.openInformation(null, "Cancelled", e.getMessage());
			}
			
			return this.done;
		}

		@SuppressWarnings("deprecation")
		public void run(final IProgressMonitor monitor) throws InvocationTargetException,
				InterruptedException {
			monitor.beginTask(title, IProgressMonitor.UNKNOWN);
			done = false;
			error = false;
			
			Thread thread = new Thread(){
			    public void run(){
			      System.out.println("Running JCAEHV Model build...");
			      try{
				      buffer = caehModel.buildModel();
				      monitor.done();
				      done = true;
				      System.out.println("Finished JCAEHV Model build...");
			      }catch (Exception e){
			    	  error = true;
			      }
			    }
			};
			
			thread.start();
			
			while(!monitor.isCanceled() && !done && !error){}
			
			if (monitor.isCanceled()){
				thread.stop();
				done = false;
				throw new InterruptedException(
						cancelMessage);
			}
			
			if(error){
				done = false;
				throw new InterruptedException(errorMessage);
			}
		}

		public StringBuffer getBuffer() {
			return buffer;
		}
	}