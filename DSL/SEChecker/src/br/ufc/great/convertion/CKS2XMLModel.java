package br.ufc.great.convertion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import br.ufc.great.cks.CKSModel;
import br.ufc.great.cks.ContextState;
import br.ufc.great.model.Assignment;
import br.ufc.great.model.ModelConstraint;

public class CKS2XMLModel implements CKSModelConverter {

	private String PATH = "./res/CKS2XML/";	
	
	public void convert(CKSModel cks) {
		StringBuffer buffer = getXML(cks);
		try {			
			File dir = new File(PATH);			
			dir.mkdir();		
			File file = new File(dir, cks.getName() + ".xml");
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter out = new PrintWriter(fileWriter);
			out.println(buffer.toString());
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public StringBuffer getXML(CKSModel cks){
		StringBuffer buffer = new StringBuffer();
		buffer.append("<cks system=\"" + cks.getName() + "\">\n");
		Set<ModelConstraint> cksCons = cks.getConstraints();

		if (cksCons != null && !cksCons.isEmpty()) {
			buffer.append("\t<constraints>\n");
			for (ModelConstraint constraint : cksCons) {
				if (constraint.isStateConstraint()) {
					buffer.append("\t\t<state-constraint exp=\"");
					buffer.append(constraint.getConstraint().toString());
					buffer.append("\" />\n");
				} else {
					buffer.append("\t\t<transition-constraint exp=\"");
					buffer.append(constraint.getConstraint().toString());
					buffer.append("\" />\n");
				}
			}
			buffer.append("\t</constraints>\n");
		}

		if (cks.getStateNumber() > 0) {
			for (ContextState state : cks.getStates()) {
				buffer.append("\t<state id=\"");
				buffer.append(state.getId());
				buffer.append("\" initial=\"");
				buffer.append(state.isInitial());
				if (state.isRaised()) {
					buffer.append("\" raised=\"");
					buffer.append(state.isRaised());
				}
				if (state.isCaught()) {
					buffer.append("\" caught=\"");
					buffer.append(state.isCaught());
				}
				buffer.append("\">\n");

				buffer.append("\t\t<label>\n");
				Assignment assignment = state.getAssignment();
				for (String symbol : assignment.getSymbols()) {
					buffer.append("\t\t\t<proposition name=\"");
					buffer.append(symbol + "\" ");
					buffer.append("value=\"");
					buffer.append(assignment.getValuationOf(symbol));
					buffer.append("\" />\n");
				}
				buffer.append("\t\t</label>\n");

				if (state.getPreviousStates() != null
						&& state.getPreviousStates().size() > 0) {
					buffer.append("\t\t<pre-states>\n");
					for (ContextState pre : state.getPreviousStates()) {
						buffer.append("\t\t\t<pre-state name=\"");
						buffer.append(pre.getId());
						buffer.append("\" />\n");
					}
					buffer.append("\t\t</pre-states>\n");
				}

				if (state.getNextStates() != null
						&& state.getNextStates().size() > 0) {
					buffer.append("\t\t<post-states>\n");
					for (ContextState next : state.getNextStates()) {
						buffer.append("\t\t\t<post-state name=\"");
						buffer.append(next.getId());
						buffer.append("\" />\n");
					}
					buffer.append("\t\t</post-states>\n");
				}
				buffer.append("\t</state>\n");
			}
		}
		buffer.append("</cks>");
		
		return buffer;
	}
}
