package br.ufc.great.jcaehv.abstraction;

import br.ufc.great.jcaehv.context.ContextExpression;

public class TransitionConstraint {

	private ContextExpression selection;

	private ContextExpression constraint;

	public TransitionConstraint(ContextExpression selection, ContextExpression constraint) {
		this.selection = selection;
		this.constraint = constraint;
	}

	public ContextExpression getSelection() {
		return selection;
	}

	public ContextExpression getConstraint() {
		return constraint;
	}

}