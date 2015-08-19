package br.ufc.great.jcaehv.checker.mcie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.checker.KripkeStructureModel;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;

public class Kripke2MCiEModel {

	private static final String PATH = "./res/CKS2MCiE/";

	public void convert(KripkeStructureModel kripkeModel) {
		StringBuffer buffer = new StringBuffer();
		Iterator<String> symbols = null;
		buffer.append("(");
		ContextState initial = kripkeModel.creatFakeInitialState();
		ContextPropositionAssignment assignment = initial.getAssignment();
		symbols = assignment.getSymbols().iterator();
		while (symbols.hasNext()) {
			buffer.append("!" + symbols.next());
			if (symbols.hasNext()) {
				buffer.append(" & ");
			}
		}
		buffer.append("\n,\n(");

		ContextState state = null;
		Iterator<ContextState> states = kripkeModel.getReachableStates().iterator();
		while (states.hasNext()) {
			state = states.next();
			buffer.append(this.convert(kripkeModel, state));

			if (states.hasNext()) {
				buffer.append(" |\n");
			}
		}
		buffer.append(")\n,\n");
		buffer.append("{true}");
		buffer.append("\n)");

		try {
			File dir = new File(PATH);
			dir.mkdir();
			FileWriter file = new FileWriter(PATH + kripkeModel.getName() + ".cks");
			PrintWriter out = new PrintWriter(file);
			out.println(buffer.toString());
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String convert(KripkeStructureModel kripkeModel, ContextState state) {
		StringBuffer buffer = new StringBuffer();
		Iterator<String> symbolsIt = null;
		ContextPropositionAssignment assignment = state.getAssignment();
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
			int[] nextStatesId = state.getNextStatesId();
			Set<ContextState> nextStates = new LinkedHashSet<ContextState>();
			for (int nextStateId : nextStatesId) {
				nextStates.add(kripkeModel.getState(nextStateId));
			}

			Iterator<ContextState> nextStatesIt = nextStates.iterator();

			while (nextStatesIt.hasNext()) {
				ContextState next = nextStatesIt.next();
				buffer.append("(" + currentState + " & ");
				ContextPropositionAssignment nextAssignment = next.getAssignment();
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

				if (nextStatesIt.hasNext()) {
					buffer.append(" |\n");
				}
			}
		}
		return buffer.toString();
	}
}
