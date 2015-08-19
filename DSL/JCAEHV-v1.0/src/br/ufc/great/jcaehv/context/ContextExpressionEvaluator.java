package br.ufc.great.jcaehv.context;

public class ContextExpressionEvaluator {

	public static boolean eval(ContextPropositionAssignment assignment, ContextExpression expression) throws EvaluationException {
		if (expression instanceof ContextProposition) {
			return ((ContextProposition) expression).getValuation(assignment);
		}
		switch (expression.getOperator()) {
		case AND:
			return eval(assignment, expression.getLeftSide()) && eval(assignment, expression.getRightSide());
		case OR:
			return eval(assignment, expression.getLeftSide()) || eval(assignment, expression.getRightSide());
		case NOT:
			return !eval(assignment, expression.getLeftSide());
		default:
			throw new EvaluationException("Invalid operator: " + expression.toString());
		}
	}
}