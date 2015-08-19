package br.ufc.great.cks;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Assignment;
import br.ufc.great.model.ModelConstraint;

public class CKSModel {

	private String name;

	private Set<ContextState> states;

	private Set<ModelConstraint> constraints;

	public CKSModel() {
		this.states = new HashSet<ContextState>();
		this.constraints = new HashSet<ModelConstraint>();
	}

	public void doStateTextLabeling() {
		int label = 0;
		for (ContextState state : this.states) {
			state.setId("CS" + label++);
		}
	}

	public Set<ModelConstraint> getConstraints() {
		return constraints;
	}

	public void setConstraints(Set<ModelConstraint> constraints) {
		this.constraints = constraints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addState(ContextState state) {
		this.states.add(state);
	}

	public Set<ContextState> getStates() {
		return states;
	}

	public void setStates(Set<ContextState> states) {
		this.states = states;
	}

	public Set<ContextState> getInitials() {
		Set<ContextState> initials = new HashSet<ContextState>();
		for (ContextState state : this.states) {
			if (state.isInitial()) {
				initials.add(state);
			}
		}
		return initials;
	}

	public ContextState getInitial() {
		for (ContextState state : this.states) {
			if (state.isInitial()) {
				return state;
			}
		}
		return null;
	}

	public int getStateNumber() {
		return this.states.size();
	}

	public boolean hasUnreachableState() {
		return this.getUnreachable() == null ? false : true;
	}

	public boolean hasTerminalState() {
		return this.getTerminal() == null ? false : true;
	}

	public void remove(ContextState state) {
		Collection<ContextState> nexts = state.getNextStates();
		Collection<ContextState> prevs = state.getPreviousStates();
		state.removeAllNextStates();
		state.removeAllPreviousStates();

		for (ContextState next : nexts) {
			next.removePreviousState(state);
		}

		for (ContextState prev : prevs) {
			prev.removeNextState(state);
		}
		this.states.remove(state);
	}

	public void addLoopTransitionOnTerminals() {
		for (ContextState state : this.states) {
			if (this.isTerminal(state)) {
				state.addNextState(state);
				state.addPreviousState(state);
			}
		}
	}

	public void removeTerminalStates() {
		ContextState terminal = this.getTerminal();
		if (terminal != null) {
			this.remove(terminal);
			this.removeTerminalStates();
		}
	}

	private ContextState getTerminal() {
		for (ContextState state : this.states) {
			if (this.isTerminal(state)) {
				return state;
			}
		}
		return null;
	}

	private boolean isTerminal(ContextState state) {
		return state.getNextStates().isEmpty();
	}

	public void removeUnreachableStates() {
		ContextState unreachable = this.getUnreachable();
		if (unreachable != null) {
			this.remove(unreachable);
			this.removeUnreachableStates();
		}
	}

	private ContextState getUnreachable() {
		for (ContextState state : this.states) {
			if (this.isUnreachable(state)) {
				return state;
			}
		}
		return null;
	}

	private boolean isUnreachable(ContextState state) {
		return !state.isInitial() && state.getPreviousStates().isEmpty();
	}

	public Set<ContextState> getStates(ContextPredicate formula)
			throws EvaluationException {
		Set<ContextState> holdStates = new HashSet<ContextState>();
		for (ContextState state : this.states) {
			if (state.check(formula)) {
				holdStates.add(state);
			}
		}
		return holdStates;
	}

	public boolean tryDoTransition(ContextState from, ContextState to)
			throws EvaluationException {
		if (this.isValidTransition(from, to)) {
			from.addNextState(to);
			to.addPreviousState(from);
			return true;
		}
		return false;
	}

	private boolean isValidTransition(ContextState from, ContextState to)
			throws EvaluationException {
		if (this.constraints != null && this.constraints.size() > 0) {
			Assignment fromAsgn = from.getAssignment();
			Assignment toAsgn = to.getAssignment();
			Assignment joinAsgn = new Assignment();

			Set<String> fromSymbols = fromAsgn.getSymbols();
			for (String fromSymbol : fromSymbols) {
				joinAsgn.assign(fromSymbol + "_",
						fromAsgn.getValuationOf(fromSymbol));
			}

			Set<String> toSymbols = toAsgn.getSymbols();
			for (String toSymbol : toSymbols) {
				joinAsgn.assign("_" + toSymbol, toAsgn.getValuationOf(toSymbol));
			}

			Iterator<ModelConstraint> cstrIt = this.constraints.iterator();
			while (cstrIt.hasNext()) {
				ModelConstraint cons = cstrIt.next();
				if (!cons.isStateConstraint()) {
					if (!cons.getConstraint().eval(joinAsgn)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}