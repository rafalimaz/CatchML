package br.ufc.great.jcaehv.checker;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import br.ufc.great.jcaehv.context.Alphabet;
import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;

public class KripkeStructureModel {

	private String name;

	private Alphabet alphabet;

	private Map<Integer, ContextState> stateMap;

	public KripkeStructureModel(String name) {
		this.name = name;
		this.stateMap = new HashMap<Integer, ContextState>();

	}

	public Alphabet getAlphabet() {
		return this.alphabet;
	}

	public void setAlphabet(Alphabet alphabet) {
		this.alphabet = alphabet;
	}

	public String getName() {
		return this.name;
	}

	public void addState(ContextState state) {
		state.setId(this.stateMap.size());
		this.stateMap.put(state.getId(), state);
	}

	public void setInitialStates(ContextExpression expression) throws EvaluationException {
		if (!this.stateMap.isEmpty()) {
			for (ContextState state : this.stateMap.values()) {
				if (state.sat(expression)) {
					state.setInitial(true);
				}
			}
		}
	}

	public void addStateTransition(ContextState source, ContextState target) {
		if (this.stateMap.containsKey(source.getId()) && this.stateMap.containsKey(target.getId())) {
			source.addNextState(target);
		}
	}

	public void removeStateTransition(ContextState source, ContextState target) {
		if (this.stateMap.containsKey(source.getId()) && this.stateMap.containsKey(target.getId())) {
			source.removeNextState(target);
		}
	}

	public void addLoopTransition(ContextState state) {
		if (this.stateMap.containsKey(state.getId())) {
			state.addNextState(state);
		}
	}

	public void removeLoopTransition(ContextState state) {
		if (this.stateMap.containsKey(state.getId())) {
			state.removeNextState(state);
		}
	}

	public Collection<ContextState> getStates() {
		return stateMap.values();
	}

	public Set<ContextState> getInitialStates() {
		Set<ContextState> initials = new LinkedHashSet<ContextState>();
		for (ContextState state : this.stateMap.values()) {
			if (state.isInitial()) {
				initials.add(state);
			}
		}
		return initials;
	}

	public Set<ContextState> getReachableStates() {
		Set<ContextState> reachables = new LinkedHashSet<ContextState>();
		for (ContextState state : this.stateMap.values()) {
			if (state.isReachable()) {
				reachables.add(state);
			}
		}
		return reachables;
	}

	public Set<ContextState> getUnreachableStates() {
		Set<ContextState> unreachables = new LinkedHashSet<ContextState>();
		for (ContextState state : this.stateMap.values()) {
			if (!state.isReachable()) {
				unreachables.add(state);
			}
		}
		return unreachables;
	}

	public ContextState getState(int stateId) {
		return stateMap.get(stateId);
	}

	public int getStateNumber() {
		return stateMap.size();
	}

	public int getInitialStateNumber() {
		int count = 0;
		for (ContextState state : this.getStates()) {
			if (state.isInitial()) {
				count++;
			}
		}
		return count;
	}

	public int getReachableStateNumber() {
		int count = 0;
		for (ContextState state : this.getStates()) {
			if (state.isReachable()) {
				count++;
			}
		}
		return count;
	}

	public int getUnreachableStateNumber() {
		int count = 0;
		for (ContextState state : this.getStates()) {
			if (!state.isReachable()) {
				count++;
			}
		}
		return count;
	}

	public Set<ContextState> getExceptionalStates() {
		Set<ContextState> exceptionalStates = new LinkedHashSet<ContextState>();
		for (ContextState state : this.getStates()) {
			if (state.isExceptional()) {
				exceptionalStates.add(state);
			}
		}
		return exceptionalStates;
	}

	public int getExceptionalStateNumber() {
		int count = 0;
		for (ContextState state : this.getStates()) {
			if (state.isExceptional()) {
				count++;
			}
		}
		return count;
	}

	public boolean hasExceptionalState() {
		for (ContextState state : this.getStates()) {
			if (state.isExceptional()) {
				return true;
			}
		}
		return false;
	}

	public Set<ContextState> getHoldStates(ContextExpression expression) throws EvaluationException {
		Set<ContextState> holdStates = new LinkedHashSet<ContextState>();
		for (ContextState state : this.getStates()) {
			if (state.sat(expression)) {
				holdStates.add(state);
			}
		}
		return holdStates;
	}

	public ContextState creatFakeInitialState() {
		ContextPropositionAssignment assignment = new ContextPropositionAssignment();
		for (String symbol : this.alphabet.getSymbols()) {
			assignment.assign(symbol, false);
		}
		ContextState fake = new ContextState(assignment);
		fake.setInitial(true);
		fake.setReachable(true);
		for (ContextState state : this.getInitialStates()) {
			fake.addNextState(state);
			state.setInitial(false);
		}
		this.addState(fake);
		return fake;
	}
}