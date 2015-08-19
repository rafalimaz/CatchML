package br.ufc.great.jcaehv.context;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContextExpression {

	private Operator operator;

	private ContextExpression leftSide;

	private ContextExpression rightSide;

	public ContextExpression() {
	}

	public ContextExpression(Operator operator, ContextExpression leftSide) {
		this(operator, leftSide, null);
	}

	public ContextExpression(Operator operator, ContextExpression leftSide, ContextExpression rightSide) {
		this.operator = operator;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	public ContextExpression getLeftSide() {
		return leftSide;
	}

	public ContextExpression getRightSide() {
		return rightSide;
	}

	public Operator getOperator() {
		return operator;
	}

	public Set<ContextProposition> getPropositionSet() {
		Set<ContextProposition> propositions = null;
		Set<ContextProposition> leftPropositions = leftSide.getPropositionSet();
		Set<ContextProposition> rightPropositions = rightSide.getPropositionSet();

		if (leftPropositions != null || rightPropositions != null) {
			propositions = new LinkedHashSet<ContextProposition>();
			if (leftPropositions != null) {
				propositions.addAll(leftPropositions);
			}

			if (rightPropositions != null) {
				propositions.addAll(rightPropositions);
			}

		}
		return propositions;
	}

	public String toString() {
		switch (this.operator) {
		case AND:
			return "(" + leftSide.toString() + " & " + rightSide.toString() + ")";
		case OR:
			return "(" + leftSide.toString() + " | " + rightSide.toString() + ") ";
		case NOT:
			return "( ! " + leftSide.toString() + ")";
		default:
			return "Invalid Operator!";
		}
	}

	public static ContextExpression and(ContextExpression left, ContextExpression right) {
		return new ContextExpression(Operator.AND, left, right);
	}

	public static ContextExpression and(ContextExpression... operands) {
		ContextExpression conjunction = null;
		if (operands.length >= 2) {
			conjunction = and(operands[0], operands[1]);

			if (operands.length > 2) {
				for (int i = 2; i < operands.length; i++) {
					conjunction = and(conjunction, operands[i]);
				}
			}
		}
		return conjunction;
	}

	public static ContextExpression nand(ContextExpression left, ContextExpression right) {
		return not(and(left, right));
	}

	public static ContextExpression or(ContextExpression left, ContextExpression right) {

		return new ContextExpression(Operator.OR, left, right);
	}

	public static ContextExpression or(ContextExpression... operands) {
		ContextExpression disjunction = null;
		if (operands.length >= 2) {
			disjunction = or(operands[0], operands[1]);

			if (operands.length > 2) {
				for (int i = 2; i < operands.length; i++) {
					disjunction = or(disjunction, operands[i]);
				}
			}
		}
		return disjunction;
	}

	public static ContextExpression nor(ContextExpression left, ContextExpression right) {
		return not(or(left, right));
	}

	public static ContextExpression not(ContextExpression formula) {
		return new ContextExpression(Operator.NOT, formula);
	}

	public static ContextExpression ifThen(ContextExpression left, ContextExpression right) {
		return or(not(left), right);
	}

	public static ContextExpression iff(ContextExpression left, ContextExpression right) {
		return or(and(not(left), not(right)), and(left, right));
	}

	public static ContextExpression xor(ContextExpression left, ContextExpression right) {
		return or(and(left, not(right)), and(not(left), right));
	}

	public static ContextExpression xor(ContextExpression... operands) {
		ContextExpression formula = null;
		ContextExpression disjunction = null;

		for (int truthOperand = 0; truthOperand < operands.length; truthOperand++) {
			formula = operands[truthOperand];

			for (int operand = 0; operand < operands.length; operand++) {
				if (truthOperand != operand) {
					formula = and(formula, not(operands[operand]));
				}
			}

			if (disjunction != null) {
				disjunction = or(disjunction, formula);
			} else {
				disjunction = formula;
			}
		}
		return disjunction;
	}
}