package br.ufc.great.expression;

import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Assignment;
import br.ufc.great.model.Environment;
import choco.Choco;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

public class ContextProposition extends ContextPredicate {

	private String name;

	public ContextProposition(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Constraint toChocoModel() {
		Environment converter = Environment.getInstance();
		return Choco.eq(1, converter.getChocoVar(this.getName()));
	}

	public IntegerVariable toChocoVar() {
		Environment converter = Environment.getInstance();
		return converter.getChocoVar(this.getName());
	}

	public boolean eval(Assignment assignment) throws EvaluationException {
		if (!assignment.hasSymbol(this.getName())) {
			throw new EvaluationException("The symbol \"" + this.toString()
					+ "\" is not found in the assignment.");
		}
		return assignment.getValuationOf(this.getName());
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof ContextProposition) {
			ContextProposition objCP = (ContextProposition) obj;
			result = this.name.equals(objCP.getName());
		}

		return result;
	}
}