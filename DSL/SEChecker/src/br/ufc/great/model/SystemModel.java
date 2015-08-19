package br.ufc.great.model;

import java.util.Set;

import br.ufc.great.caeh.CEModel;
import br.ufc.great.expression.ContextProposition;

public abstract class SystemModel {

	private String name;

	public SystemModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Set<ContextProposition> getPropositions();

	public abstract Set<ModelConstraint> getConstraints();
	
	public abstract Set<TransitionAbstraction> getTransitions();
	
	public abstract Set<CEModel> getContextualExceptions();	
}
