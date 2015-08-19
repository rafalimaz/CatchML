package br.ufc.great.model;

import br.ufc.great.expression.ContextPredicate;

public class StateAbstraction {

	private String id;

	private boolean isInitial = false;

	private boolean isFinal;

	private ContextPredicate predicate;

	public StateAbstraction(String id, ContextPredicate predicate) {
		this.id = id;
		this.predicate = predicate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isInitial() {
		return isInitial;
	}

	public void setInitial(boolean value) {
		this.isInitial = value;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean value) {
		this.isFinal = value;
	}

	public ContextPredicate getPredicate() {
		return predicate;
	}

	public void setPredicate(ContextPredicate predicate) {
		this.predicate = predicate;
	}
}