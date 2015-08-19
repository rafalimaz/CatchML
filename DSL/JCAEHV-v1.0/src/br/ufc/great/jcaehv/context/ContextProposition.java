package br.ufc.great.jcaehv.context;


public class ContextProposition extends ContextExpression {

	private String name;

	public ContextProposition() {

	}

	public ContextProposition(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean getValuation(ContextPropositionAssignment assignment) throws EvaluationException {
		if (!assignment.hasSymbol(this.getName())) {
			throw new EvaluationException("The symbol \"" + this.toString() + "\" is not found in the assignment.");
		}
		return assignment.getValuationOf(this.getName());
	}
	
	public String toString() {
		return this.getName();
	}
}
