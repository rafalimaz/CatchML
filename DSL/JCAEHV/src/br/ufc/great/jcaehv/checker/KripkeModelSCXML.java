package br.ufc.great.jcaehv.checker;

import java.util.Set;

import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.model.property.Property;

public class KripkeModelSCXML {

	public StringBuffer generateFile(long time, KripkeStructureModel kripke, Set<Property> properties) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<scxml xmlns=\"http://www.w3.org/2005/07/scxml\" version=\"1.0\" ");
		buffer.append("initialstate=\"");		
		for (ContextState state : kripke.getInitialStates()) {
			buffer.append(state.getStringId());
			buffer.append("\">");
			break;
		}		
		
		if (kripke.getReachableStateNumber() > 0) {			
			for (ContextState state : kripke.getReachableStates()) {
				buffer.append("\n<state id=\"");
				buffer.append(state.isExceptional() ? "*" : "");
				buffer.append(state.getStringId() + "\" ");
				if (state.isInitial()) {
					buffer.append("initial=\"true\"");
				}				
				buffer.append(">");
				buffer.append("\n\t<onentry>");
				buffer.append("\n\t\t<log expr=\"" + state.getLabel() + "\"/>");
				buffer.append("\n\t</onentry>");
				
				int[] nextStatesId = state.getNextStatesId();
				for (int nextStateId : nextStatesId) {
					ContextState next = kripke.getState(nextStateId);
					buffer.append("\n\t<transition target=\"");	
					buffer.append(next.isExceptional() ? "*" : "");
					buffer.append(next.getStringId());
					buffer.append("\">");
					buffer.append("</transition>");				
				}
				buffer.append("\n</state>");
			}
		}
		
		buffer.append("\n</scxml>");

		
		return buffer;
	}
}

//TODO: Created