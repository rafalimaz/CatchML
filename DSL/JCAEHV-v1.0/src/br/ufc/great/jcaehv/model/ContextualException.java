package br.ufc.great.jcaehv.model;

import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextExpressionEvaluator;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.EvaluationException;

public class ContextualException {

	private String name;

	private ContextExpression exceptionalContext;

	public ContextualException(String name, ContextExpression exceptionalContext) {
		this.name = name;
		this.exceptionalContext = exceptionalContext;
	}

	public String getName() {
		return name;
	}

	public boolean canBeRaised(ContextPropositionAssignment assignment) throws EvaluationException {
		return ContextExpressionEvaluator.eval(assignment, this.exceptionalContext);
	}


	public ContextExpression getExceptionalContext() {
		return exceptionalContext;
	}

	public String deadExceptionPropertie() {
		StringBuffer propertie = new StringBuffer();
		propertie.append("F(");
		propertie.append(this.exceptionalContext.toString());
		propertie.append(")");
		return propertie.toString();
	}

}