package br.ufc.great.model;

import br.ufc.great.expression.ContextPredicate;

public class ModelConstraint {

	private boolean isStateConstraint;

	private String name;

	private ContextPredicate constraint;

	public ModelConstraint(String name, ContextPredicate constraint) {
		this.name = name;
		this.constraint = constraint;
		this.isStateConstraint = true;
	}

	public ModelConstraint(ContextPredicate constraint) {
		this(null, constraint);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStateConstraint() {
		return isStateConstraint;
	}

	public void setStateConstraint(boolean value) {
		this.isStateConstraint = value;
	}

	public ContextPredicate getConstraint() {
		return constraint;
	}

	public void setConstraint(ContextPredicate constraint) {
		this.constraint = constraint;
	}
}
