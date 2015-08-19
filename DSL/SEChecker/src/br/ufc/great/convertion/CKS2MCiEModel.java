package br.ufc.great.convertion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import br.ufc.great.cks.CKSModel;
import br.ufc.great.cks.ContextState;
import br.ufc.great.model.Assignment;

public class CKS2MCiEModel implements CKSModelConverter {

	private static final String PATH = "./res/CKS2MCiE/";

	public void convert(CKSModel cks) {		
		StringBuffer buffer = getXML(cks);
		try {
			File dir = new File(PATH);
			dir.mkdir();
			FileWriter file = new FileWriter(PATH + cks.getName() + ".cks");
			PrintWriter out = new PrintWriter(file);
			out.println(buffer.toString());
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuffer getXML(CKSModel cks){
		StringBuffer buffer = new StringBuffer();
		Iterator<String> symbols = null;
		buffer.append("(");
		ContextState state = cks.getInitial();
		if (state != null) {
			Assignment assignment = state.getAssignment();
			symbols = assignment.getSymbols().iterator();
			while (symbols.hasNext()) {
				String symbol = symbols.next();
				if (assignment.getValuationOf(symbol)) {
					buffer.append(symbol);
				} else {
					buffer.append("!" + symbol);
				}
				if (symbols.hasNext()) {
					buffer.append(" & ");
				}
			}
		}

		buffer.append("\n,\n(");
		Iterator<ContextState> states = cks.getStates().iterator();
		while (states.hasNext()) {
			state = states.next();
			buffer.append(this.convert(state));

			if (states.hasNext()) {
				buffer.append(" |\n");
			}
		}
		buffer.append(")\n,\n");
		buffer.append("{true}");
		buffer.append("\n)");
		
		return buffer;
	}

	private String convert(ContextState state) {
		StringBuffer buffer = new StringBuffer();
		Iterator<String> symbolsIt = null;
		Assignment assignment = state.getAssignment();
		if (assignment.size() > 0) {
			symbolsIt = assignment.getSymbols().iterator();

			while (symbolsIt.hasNext()) {
				String symbol = symbolsIt.next();
				if (assignment.getValuationOf(symbol)) {
					buffer.append(symbol);
				} else {
					buffer.append("!" + symbol);
				}
				if (symbolsIt.hasNext()) {
					buffer.append(" & ");
				}
			}
			String currentState = buffer.toString();
			buffer = new StringBuffer();
			Iterator<ContextState> states = state.getNextStates().iterator();
			while (states.hasNext()) {
				ContextState next = states.next();
				buffer.append("(" + currentState + " & ");
				Assignment nextAssignment = next.getAssignment();
				symbolsIt = nextAssignment.getSymbols().iterator();
				while (symbolsIt.hasNext()) {
					String symbol = symbolsIt.next();
					if (nextAssignment.getValuationOf(symbol)) {
						buffer.append(symbol + "'");
					} else {
						buffer.append("!" + symbol + "'");
					}
					if (symbolsIt.hasNext()) {
						buffer.append(" & ");
					}
				}
				buffer.append(")");

				if (states.hasNext()) {
					buffer.append(" |\n");
				}
			}
		}
		return buffer.toString();
	}
}
