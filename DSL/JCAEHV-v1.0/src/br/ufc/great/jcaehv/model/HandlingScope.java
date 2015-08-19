package br.ufc.great.jcaehv.model;

import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextExpressionEvaluator;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.EvaluationException;

public class HandlingScope {

	private ContextualException exception;

	private Set<HandlingCase> cases;

	public HandlingScope(ContextualException exception) {
		this.exception = exception;
		this.cases = new LinkedHashSet<HandlingCase>();
	}

	public HandlingScope(ContextualException exception, Set<HandlingCase> cases) {
		this.exception = exception;
		this.cases = cases;
	}

	public boolean canBeRaised(ContextPropositionAssignment assignment) throws EvaluationException {
		return ContextExpressionEvaluator.eval(assignment, exception.getExceptionalContext());
	}

	public ContextualException getContextualException() {
		return exception;
	}

	public boolean isScopeOf(ContextualException exception) {
		return this.exception.getName().equals(exception.getName());
	}

	public boolean canBeCaught(ContextPropositionAssignment assignment) throws EvaluationException {
		for (HandlingCase hcase : cases) {
			if (hcase.canCatch(assignment)) {
				return true;
			}
		}
		return false;
	}

	public boolean canBeRaisedAndCaught(ContextPropositionAssignment assignment) throws EvaluationException {
		return canBeRaised(assignment) && canBeCaught(assignment);
	}

	public void addHandlingCase(HandlingCase handlingCase) {
		this.cases.add(handlingCase);
	}

	public HandlingBehavior getHandlingBehavior(ContextPropositionAssignment assignment) throws EvaluationException {
		if (canBeRaisedAndCaught(assignment)) {
			for (HandlingCase hcase : cases) {
				if (hcase.canCatch(assignment)) {
					return hcase.getHandlingBehavior();
				}
			}
		}
		return null;
	}

	public boolean hasHandlingCase() {
		return cases != null && !cases.isEmpty();
	}

	public Set<HandlingCase> getHandlingCases() {
		return cases;
	}
}