package br.ufc.great.jcaehv.checker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.model.property.Property;

public class KripkeModelTXTReport {

	private String path;

	public KripkeModelTXTReport() {
		this.path = "./Benchmark/";
	}

	public KripkeModelTXTReport(String path) {
		this.path = path;
	}
	
	public StringBuffer generateReport(long time, KripkeStructureModel kripke, Set<Property> properties){
		StringBuffer buffer = new StringBuffer();
		buffer.append("\t\t\tThe JCAEHV Report \n\n");
		buffer.append("+ System name: ");
		buffer.append(kripke.getName());
		buffer.append("\n+ State number: ");
		buffer.append(kripke.getStateNumber());
		buffer.append("\n+ Initial state number: ");
		buffer.append(kripke.getInitialStateNumber());
		buffer.append("\n+ Reachable state number: ");
		buffer.append(kripke.getReachableStateNumber());
		buffer.append("\n+ Unreachable state number: ");
		buffer.append(kripke.getUnreachableStateNumber());
		buffer.append("\n+ Exceptional state number: ");
		buffer.append(kripke.getExceptionalStateNumber());
		buffer.append("\n+ Duration Time: ");
		buffer.append(time);
		buffer.append("ms");

		if (kripke.getReachableStateNumber() > 0) {
			buffer.append("\n\n+ Reachable States");
			for (ContextState state : kripke.getReachableStates()) {
				buffer.append("\n ");
				if (state.isInitial()) {
					buffer.append(">");
				}
				if (state.isExceptional()) {
					buffer.append("*");
				}
				buffer.append(state.getStringId());
				buffer.append(state.getLabel());

				buffer.append("->");
				int[] nextStatesId = state.getNextStatesId();
				for (int nextStateId : nextStatesId) {
					ContextState next = kripke.getState(nextStateId);
					buffer.append(next.getStringId());
					buffer.append(" ");
				}
			}
		}

		if (properties != null && !properties.isEmpty()) {
			buffer.append("\n\n Properties Verification \n\n");
			for (Property property : properties) {
				buffer.append(property.toString());
				buffer.append("\n");
			}
		}
		return buffer;
	}
	//TODO: changed report method
	
	public void report(long time, KripkeStructureModel kripke, Set<Property> properties) {
		try {
			StringBuffer buffer = generateReport(time, kripke, properties);
			File dir = new File(path);
			dir.mkdir();
			FileWriter file = new FileWriter(path + kripke.getName() + "Report.txt");
			PrintWriter out = new PrintWriter(file);
			out.println(buffer.toString());
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}