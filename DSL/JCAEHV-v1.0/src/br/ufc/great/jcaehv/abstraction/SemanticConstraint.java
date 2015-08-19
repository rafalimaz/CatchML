package br.ufc.great.jcaehv.abstraction;

import java.util.Set;

import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextProposition;

public class SemanticConstraint {

	private String name;

	private ContextExpression constraint;

	public SemanticConstraint(String name, ContextExpression constraint) {
		this.name = name;
		this.constraint = constraint;
	}

	public SemanticConstraint(ContextExpression constraint) {
		this(null, constraint);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContextExpression getConstraint() {
		return constraint;
	}

	public void setConstraint(ContextExpression constraint) {
		this.constraint = constraint;
	}

	public Set<ContextProposition> getPropositionSet() {
		return this.constraint.getPropositionSet();
	}

}
