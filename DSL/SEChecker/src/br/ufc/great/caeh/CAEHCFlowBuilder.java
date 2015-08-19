package br.ufc.great.caeh;

import static br.ufc.great.expression.ContextPredicate.and;

import java.util.HashSet;
import java.util.Set;

import br.ufc.great.cks.CKSModel;
import br.ufc.great.cks.ContextState;
import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Assignment;

public class CAEHCFlowBuilder {

	private CKSModel ecks;

	public CAEHCFlowBuilder() {
		this.ecks = new CKSModel();
	}

	public CKSModel caeh(CKSModel cks, Set<CEModel> exceptions)
			throws CKSBuildException {
		if (cks == null) {
			throw new CKSBuildException("The CKS is NULL.");
		}

		if (!(exceptions != null && exceptions.size() > 0)) {
			String message = (exceptions == null) ? "NULL." : "empty.";
			throw new CKSBuildException("The CES set is " + message);
		}

		this.ecks.setName(cks.getName() + "CAEH");
		if (cks.getStateNumber() > 0) {
			this.ecks.setStates(cks.getStates());
			this.addCELabels(exceptions);
		} else {
			throw new CKSBuildException(
					"No context state was found in the CKS: " + cks.getName());
		}

		this.ecks.setConstraints(cks.getConstraints());

		try {
			this.buildStateTransitonsFromECS(exceptions);
			this.buildStateTransitonsFromHCS(exceptions);
			this.bulidResumeCFlow(exceptions);
		} catch (EvaluationException ee) {
			throw new CKSBuildException(ee);
		}
		this.ecks.removeUnreachableStates();
		this.ecks.doStateTextLabeling();
		return this.ecks;
	}

	private void buildStateTransitonsFromECS(Set<CEModel> exceptions)
			throws EvaluationException {
		ContextState raiseState = null;
		boolean isRaised = false;
		Set<ContextState> raisedStates = new HashSet<ContextState>();
		for (ContextState state : this.ecks.getStates()) {
			raiseState = state.clone();
			for (CEModel exception : exceptions) {
				if (raiseState.check(exception.getECS())) {
					Assignment assignment = raiseState.getAssignment();
					assignment.assign(exception.getRaiseSymbol(), true);
					raisedStates.add(raiseState);
					isRaised = true;
				}
			}

			if (isRaised) {
				raiseState.removeAllNextStates();
				raiseState.removeAllPreviousStates();
				raiseState.addPreviousState(state);
				raiseState.setRaised(true);

				for (ContextState next : state.getNextStates()) {
					next.removePreviousState(state);
				}

				state.removeAllNextStates();
				state.addNextState(raiseState);
				isRaised = false;
			}
		}
		for (ContextState state : raisedStates) {
			this.ecks.addState(state);
		}
	}

	private void buildStateTransitonsFromHCS(Set<CEModel> exceptions)
			throws EvaluationException {
		ContextState catchState = null;
		ContextPredicate conj = null;
		Set<ContextState> catchStates = new HashSet<ContextState>();
		for (ContextState state : this.ecks.getStates()) {
			if (state.isRaised()) {
				Assignment assignment = state.getAssignment();
				Set<String> symbols = new HashSet<String>();
				for (CEModel exception : exceptions) {
					if (assignment.getValuationOf(exception.getRaiseSymbol())) {
						if (conj != null) {
							conj = and(conj, exception.getHCS());
						} else {
							conj = exception.getHCS();
						}
						symbols.add(exception.getCatchSymbol());
					}
				}

				if (state.check(conj)) {
					catchState = state.clone();
					assignment = catchState.getAssignment();
					for (String symbol : symbols) {
						assignment.assign(symbol, true);
					}
					catchState.setCaught(true);
					catchStates.add(catchState);
					state.addNextState(catchState);
					catchState.addPreviousState(state);
				} else {
					state.addNextState(state);
					state.addPreviousState(state);
				}
			}
		}
		for (ContextState state : catchStates) {
			this.ecks.addState(state);
		}
	}

	private void bulidResumeCFlow(Set<CEModel> exceptions)
			throws EvaluationException {
		ContextPredicate conj = null;
		Set<ContextState> caughtStates = new HashSet<ContextState>();
		for (ContextState state : this.ecks.getStates()) {
			if (state.isCaught()) {
				caughtStates.add(state);
			}
		}

		for (ContextState state : caughtStates) {
			Assignment assignment = state.getAssignment();
			for (CEModel exception : exceptions) {
				if (assignment.getValuationOf(exception.getCatchSymbol())) {
					if (conj != null) {
						conj = and(conj, exception.getRCS());
					} else {
						conj = exception.getRCS();
					}
				}
			}

			Set<ContextState> safeStates = this.ecks.getStates(conj);
			if (safeStates != null && !safeStates.isEmpty()) {
				for (ContextState safeState : safeStates) {
					this.ecks.tryDoTransition(state, safeState);
				}
			}
		}
	}

	private void addCELabels(Set<CEModel> exceptions) {
		for (CEModel exception : exceptions) {
			for (ContextState state : this.ecks.getStates()) {
				Assignment assignment = state.getAssignment();
				assignment.assign(exception.getRaiseSymbol(), false);
				assignment.assign(exception.getCatchSymbol(), false);
			}
		}
	}
}