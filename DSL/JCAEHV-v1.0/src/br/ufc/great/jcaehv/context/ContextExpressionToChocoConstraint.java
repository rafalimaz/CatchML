package br.ufc.great.jcaehv.context;

import java.util.Collection;
import java.util.HashMap;

import choco.Choco;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

public class ContextExpressionToChocoConstraint {

	private static HashMap<String, IntegerVariable> chocoAlphabet;

	public ContextExpressionToChocoConstraint(Collection<ContextProposition> propositions) {
		chocoAlphabet = new HashMap<String, IntegerVariable>();
		for (ContextProposition proposition : propositions) {
			chocoAlphabet.put(proposition.getName(), Choco.makeBooleanVar(proposition.getName()));
		}
	}

	public Constraint toChocoConstraint(ContextExpression expression) {
		if (expression instanceof ContextProposition) {
			return Choco.eq(1, chocoAlphabet.get(((ContextProposition) expression).getName()));
		}
		switch (expression.getOperator()) {
		case AND:
			return Choco.and(toChocoConstraint(expression.getLeftSide()), toChocoConstraint(expression.getRightSide()));
		case OR:
			return Choco.or(toChocoConstraint(expression.getLeftSide()), toChocoConstraint(expression.getRightSide()));
		case NOT:
			return Choco.not(toChocoConstraint(expression.getLeftSide()));
		default:
			return null;
		}
	}

	public Collection<IntegerVariable> getChocoAlphabet() {
		return chocoAlphabet.values();
	}
}