package br.ufc.great.jcaehv.checker.mcie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.checker.KripkeStructureModel;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.model.property.Property;
import de.upb.swt.mcie.formulas.Formula;
import de.upb.swt.mcie.mc.Transitionsystem;
import de.upb.swt.mcie.parser.ParseException;
import de.upb.swt.mcie.parser.Parser;
import de.upb.swt.mcie.robdds.Context;

public class CTLTransitionSystemMCiE {

	public Set<Property> check(KripkeStructureModel kripkeModel, Set<Property> properties) {
		Context context = new Context();
		Transitionsystem transitionSystem = null;
		Formula[] formulas = null;

		if (!kripkeModel.hasExceptionalState()) {
			return null;
		}

		try {
			StringReader stringReader = new StringReader(this.convert(kripkeModel));
			BufferedReader system = new BufferedReader(stringReader);
			transitionSystem = new Parser(system).parseTransitionsystem(context);
			system.close();
			transitionSystem.computeReachable();
		} catch (ParseException e) {
			System.out.println("ParseException in system: " + e.toString());
		} catch (IOException e) {
			System.out.println("Could not access file .");
		}

		try {
			StringBuffer buffer = new StringBuffer();
			Iterator<Property> it = properties.iterator();
			while (it.hasNext()) {
				buffer.append(it.next().getFormula());
				if (it.hasNext()) {
					buffer.append(";");
				}
			}
			StringReader stringReader = new StringReader(buffer.toString());
			BufferedReader checkingProperties = new BufferedReader(stringReader);
			formulas = (new Parser(checkingProperties)).parseFormulaList();
			checkingProperties.close();
		} catch (ParseException e) {
			System.out.println("ParseException in properties: " + e.toString());
		} catch (IOException e) {
			System.out.println("Could not access file .");
		}

		if (transitionSystem != null && formulas != null) {
			Object[] myprops = properties.toArray();
			for (int i = 0; i < formulas.length; i++) {
				if (transitionSystem.isValid(formulas[i].toROBDD(transitionSystem))) {
					((Property) myprops[i]).setAccepted(true);
				} else {
					((Property) myprops[i]).setAccepted(false);
				}
			}
			return properties;
		}
		return null;
	}

	public String convert(KripkeStructureModel kripkeModel) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("(");
		ContextState initial = kripkeModel.creatFakeInitialState();
		buffer.append(convertInitialState(initial));
		buffer.append("\n,\n(");
		buffer.append(this.convertTransitions(kripkeModel));
		buffer.append(")\n,\n");
		buffer.append("{true}");
		buffer.append("\n)");
		return buffer.toString();
	}

	private String convertInitialState(ContextState state) {
		ContextPropositionAssignment assignment = state.getAssignment();
		Iterator<String> symbols = assignment.getSymbols().iterator();
		StringBuffer buffer = new StringBuffer();
		while (symbols.hasNext()) {
			buffer.append("!" + symbols.next());
			if (symbols.hasNext()) {
				buffer.append(" & ");
			}
		}
		return buffer.toString();
	}

	public String convertTransitions(KripkeStructureModel kripkeModel) {
		StringBuffer buffer = new StringBuffer();
		ContextState state = null;
		Iterator<ContextState> states = kripkeModel.getReachableStates().iterator();
		while (states.hasNext()) {
			state = states.next();
			buffer.append(this.convertNextStateTransitions(state, kripkeModel));
			if (states.hasNext()) {
				buffer.append(" |\n");
			}
		}
		return buffer.toString();
	}

	private String convertNextStateTransitions(ContextState state, KripkeStructureModel kripkeModel) {
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
