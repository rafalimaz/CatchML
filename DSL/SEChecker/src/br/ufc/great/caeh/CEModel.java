package br.ufc.great.caeh;

import br.ufc.great.expression.ContextPredicate;

public class CEModel {

	private String name;

	private ContextPredicate ecs;

	private ContextPredicate hcs;

	private ContextPredicate rcs;

	public CEModel() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaiseSymbol() {
		return "isRaised" + this.getName();
	}

	public String getCatchSymbol() {
		return "isCaught" + this.getName();
	}

	public ContextPredicate getECS() {
		return ecs;
	}

	public void setECS(ContextPredicate ecs) {
		this.ecs = ecs;
	}

	public ContextPredicate getHCS() {
		return hcs;
	}

	public void setHCS(ContextPredicate hcs) {
		this.hcs = hcs;
	}

	public ContextPredicate getRCS() {
		return rcs;
	}

	public void setRCS(ContextPredicate rcs) {
		this.rcs = rcs;
	}
}