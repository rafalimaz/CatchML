package br.ufc.great.expression;

import java.util.Set;

import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Assignment;
import choco.Choco;
import choco.kernel.model.constraints.Constraint;

public class ContextPredicate {

	private Operator operator;

	private ContextPredicate left;

	private ContextPredicate right;

	public ContextPredicate() {
	}

	public ContextPredicate(Operator operator, ContextPredicate left,
			ContextPredicate right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public ContextPredicate(Operator operator, ContextPredicate formula) {
		this(operator, null, formula);
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public ContextPredicate getLeft() {
		return left;
	}

	public void setLeft(ContextPredicate left) {
		this.left = left;
	}

	public ContextPredicate getRight() {
		return right;
	}

	public void setRight(ContextPredicate right) {
		this.right = right;
	}

	public boolean eval(Assignment assignment) throws EvaluationException {
		switch (this.operator) {
		case AND:
			return left.eval(assignment) && right.eval(assignment);
		case OR:
			return left.eval(assignment) || right.eval(assignment);
		case NOT:
			return !right.eval(assignment);
		default:
			throw new EvaluationException("Invalid operator: " + this.toString());
		}
	}

	public Constraint toChocoModel() {
		switch (this.operator) {
		case AND:			
			return Choco.and(left.toChocoModel(), right.toChocoModel());
		case OR:
			return Choco.or(left.toChocoModel(), right.toChocoModel());
		case NOT:
			return Choco.not(right.toChocoModel());
		default:
			return null;
		}
	}

	public String toString() {
		switch (this.operator) {
		case AND:
			return "(" + left.toString() + " and " + right.toString() + ")";
		case OR:
			return "(" + left.toString() + " or " + right.toString() + ") ";
		case NOT:
			return "( not " + right.toString() + ")";
		default:
			return "Invalid Operator!";
		}
	}

	public Set<String> getOperands() {
		return null;
	}

	public static ContextPredicate and(ContextPredicate left,
			ContextPredicate right) {
		return new ContextPredicate(Operator.AND, left, right);
	}

	public static ContextPredicate nand(ContextPredicate left,
			ContextPredicate right) {
		return not(and(left, right));
	}

	public static ContextPredicate or(ContextPredicate left,
			ContextPredicate right) {
		return new ContextPredicate(Operator.OR, left, right);
	}

	public static ContextPredicate nor(ContextPredicate left,
			ContextPredicate right) {
		return not(or(left, right));
	}

	public static ContextPredicate xor(ContextPredicate left,
			ContextPredicate right) {
		return or(and(left, not(right)), and(not(left), right));
	}

	public static ContextPredicate not(ContextPredicate formula) {
		return new ContextPredicate(Operator.NOT, formula);
	}

	public static ContextPredicate ifThen(ContextPredicate left,
			ContextPredicate right) {
		return or(not(left), right);
	}

	public static ContextPredicate ifOnlyIf(ContextPredicate left,
			ContextPredicate right) {
		return or(and(not(left), not(right)), and(left, right));
	}

	public static ContextPredicate dsjn(ContextProposition... operands) {
		ContextPredicate term = null;
		ContextPredicate formula = null;

		for (ContextProposition operand : operands) {
			for (ContextProposition inner : operands) {
				if (term != null) {
					if (operand.getName().equals(inner.getName())) {
						term = and(term, inner);
					} else {
						term = and(term, not(inner));
					}
				} else {
					if (operand.getName().equals(inner.getName())) {
						term = inner;
					} else {
						term = not(inner);
					}
				}
			}
			if (formula != null) {
				formula = or(formula, term);
			} else {
				formula = term;
			}
			term = null;
		}
		return formula;
	}
}