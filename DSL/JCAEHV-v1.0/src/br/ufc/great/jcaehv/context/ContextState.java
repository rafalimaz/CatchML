package br.ufc.great.jcaehv.context;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import br.ufc.great.jcaehv.model.ContextualException;

public class ContextState {

	private int id;

	private boolean isInitial;

	private boolean isReachable;

	private ContextPropositionAssignment assignment;

	private BitSet nextStates;

	private Set<ContextualException> raisedExceptions;

	private Set<ContextualException> raisedAndCaugthExceptions;

	public ContextState() {
		this.isInitial = false;
		this.isReachable = false;
		this.nextStates = new BitSet();
		this.raisedExceptions = new HashSet<ContextualException>();
		this.raisedAndCaugthExceptions = new HashSet<ContextualException>();
	}

	public ContextState(ContextPropositionAssignment assignment) {
		this();
		this.assignment = assignment;
	}

	public int getId() {
		return id;
	}

	public String getStringId() {
		return "CS" + id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isInitial() {
		return isInitial;
	}

	public void setInitial(boolean isInitial) {
		this.isInitial = isInitial;
	}

	public boolean isReachable() {
		return isReachable;
	}

	public void setReachable(boolean isReachable) {
		this.isReachable = isReachable;
	}

	public Set<ContextualException> getRaisedExceptions() {
		return raisedExceptions;
	}

	public Set<ContextualException> getRaisedAndCaugthExceptions() {
		return raisedAndCaugthExceptions;
	}

	public void addRaisedException(ContextualException raisedException) {
		this.raisedExceptions.add(raisedException);
	}

	public void addRaisedAndCaugthException(ContextualException raisedCaugthException) {
		this.raisedAndCaugthExceptions.add(raisedCaugthException);
	}

	public boolean isExceptional() {
		return !this.raisedExceptions.isEmpty();
	}

	public ContextPropositionAssignment getAssignment() {
		return assignment;
	}

	public void setAssignment(ContextPropositionAssignment assignment) {
		this.assignment = assignment;
	}

	public String getLabel() {
		return this.assignment.getLabel();
	}

	public void addNextState(ContextState state) {
		this.nextStates.set(state.getId());
	}

	public void removeNextState(ContextState state) {
		if (this.nextStates.get(state.getId())) {
			this.nextStates.clear(state.getId());
		}
	}

	public void removeAllNextStates() {
		this.nextStates.clear();
	}

	public Set<ContextState> getNextStates(Map<Integer, ContextState> states) {
		Set<ContextState> nextContextStates = new LinkedHashSet<ContextState>();

		for (int stateIndex = this.nextStates.nextSetBit(0); stateIndex >= 0; stateIndex = this.nextStates.nextSetBit(stateIndex + 1)) {
			nextContextStates.add(states.get(stateIndex));
		}
		return nextContextStates;
	}

	public int getNumberNextStates() {
		int numerOfNextStates = 0;
		for (int stateIndex = this.nextStates.nextSetBit(0); stateIndex >= 0; stateIndex = this.nextStates.nextSetBit(stateIndex + 1)) {
			numerOfNextStates++;
		}
		return numerOfNextStates;
	}

	public int[] getNextStatesId() {
		int[] nextStatesId = new int[this.getNumberNextStates()];
		int index = 0;
		for (int stateId = this.nextStates.nextSetBit(0); stateId >= 0; stateId = this.nextStates.nextSetBit(stateId + 1)) {
			nextStatesId[index++] = stateId;
		}
		return nextStatesId;
	}

	public boolean hasNextStates() {
		return !this.nextStates.isEmpty();
	}

	public boolean isTerminal() {
		return this.nextStates.isEmpty();
	}

	public boolean sat(ContextExpression expression) throws EvaluationException {
		if (expression == null) {
			throw new EvaluationException("Invalid predicate!");
		}
		return ContextExpressionEvaluator.eval(this.getAssignment(), expression);
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