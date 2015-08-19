package br.ufc.great.jcaehv.model;

import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextExpressionEvaluator;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.EvaluationException;

public class HandlingCase {

	private ContextExpression catchConstraint;

	private HandlingBehavior handlingBehavior;

	public HandlingCase(ContextExpression catchConstraint, HandlingBehavior handlingBehavior) {
		this.catchConstraint = catchConstraint;
		this.handlingBehavior = handlingBehavior;
	}

	public HandlingCase(ContextExpression catchConstraint) {
		this(catchConstraint, null);
	}

	public HandlingCase() {
	}

	public boolean canCatch(ContextPropositionAssignment assignment) throws EvaluationException {
		return ContextExpressionEvaluator.eval(assignment, this.catchConstraint);
	}

	public ContextExpression getCatchConstraint() {
		return catchConstraint;
	}

	public HandlingBehavior getHandlingBehavior() {
		return handlingBehavior;
	}

	public void setCatchConstraint(ContextExpression catchConstraint) {
		this.catchConstraint = catchConstraint;
	}

	public void setHandlingBehavior(HandlingBehavior handlingBehavior) {
		this.handlingBehavior = handlingBehavior;
	}

}
