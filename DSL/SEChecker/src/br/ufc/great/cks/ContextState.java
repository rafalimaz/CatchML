package br.ufc.great.cks;

import java.util.HashSet;
import java.util.Set;

import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Assignment;

public class ContextState {

	private String id;

	private boolean isInitial;

	private boolean isCaught = false;

	private boolean isRaised = false;

	private Assignment assignment;

	private Set<ContextState> nextStates;

	private Set<ContextState> previousStates;

	public ContextState() {
		this.isInitial = false;
		this.nextStates = new HashSet<ContextState>();
		this.previousStates = new HashSet<ContextState>();
	}

	public ContextState(Assignment assignment) {
		this();
		this.assignment = assignment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isInitial() {
		return isInitial;
	}

	public void setInitial(boolean isInitial) {
		this.isInitial = isInitial;
	}

	public boolean isCaught() {
		return isCaught;
	}

	public void setCaught(boolean value) {
		this.isCaught = value;
	}

	public boolean isRaised() {
		return isRaised;
	}

	public void setRaised(boolean value) {
		this.isRaised = value;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public String getLabel() {
		return this.assignment.getLabel();
	}

	public void addNextState(ContextState state) {
		this.nextStates.add(state);
	}

	public void removeNextState(ContextState state) {
		if (this.nextStates.contains(state)) {
			this.nextStates.remove(state);
		}
	}

	public void removeAllNextStates() {
		this.nextStates.clear();
	}

	public Set<ContextState> getNextStates() {
		return this.nextStates;
	}

	public void setNextStates(Set<ContextState> nextStates) {
		this.nextStates = nextStates;
	}

	public void addPreviousState(ContextState state) {
		this.previousStates.add(state);
	}

	public void removePreviousState(ContextState state) {
		if (this.previousStates.contains(state)) {
			this.previousStates.remove(state);
		}
	}

	public void removeAllPreviousStates() {
		this.previousStates.clear();
	}

	public Set<ContextState> getPreviousStates() {
		return this.previousStates;
	}

	public void setPreviousStates(Set<ContextState> previousStates) {
		this.previousStates = previousStates;
	}

	public boolean check(ContextPredicate predicate) throws EvaluationException {
		if (predicate == null) {
			throw new EvaluationException("Invalid predicate!");
		}
		return predicate.eval(this.getAssignment());
	}

	public ContextState clone() {
		ContextState clonnedState = new ContextState();
		clonnedState.setId(this.getId());
		Assignment clonnedAssignment = new Assignment();
		for (String symbol : this.assignment.getSymbols()) {
			clonnedAssignment.assign(symbol,
					this.assignment.getValuationOf(symbol));
		}
		clonnedState.setAssignment(clonnedAssignment);
		return clonnedState;
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof ContextState) {
			ContextState state = ((ContextState) obj);
			if (this.getAssignment() != null && state.getAssignment() != null) {
				String label = state.getLabel();
				result = this.getLabel().equals(label);
			}
		}
		return result;
	}
}