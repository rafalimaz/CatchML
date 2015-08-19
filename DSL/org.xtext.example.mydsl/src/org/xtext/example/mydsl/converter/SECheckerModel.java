package org.xtext.example.mydsl.converter;
/*package org.xtext.example.mydsl.ui.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MultipleExpression;
import org.xtext.example.mydsl.myDsl.Operation;
import org.xtext.example.mydsl.myDsl.Proposition;
import org.xtext.example.mydsl.myDsl.State;
import org.xtext.example.mydsl.myDsl.Transition;

import br.ufc.great.caeh.CEModel;
import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.ContextProposition;
import br.ufc.great.model.ModelBuilder;
import br.ufc.great.model.ModelConstraint;
import br.ufc.great.model.StateAbstraction;
import br.ufc.great.model.SystemModel;
import br.ufc.great.model.TransitionAbstraction;

public class SECheckerModel extends SystemModel {
	private Set<ContextProposition> propositions;
	private Set<ModelConstraint> constraints;
	private Set<StateAbstraction> states;
	private Set<TransitionAbstraction> transitions;
	private StateAbstraction initial;

	public SECheckerModel(Model model) {
		super(model.getName());
		
		Proposition[] propArray = (Proposition[]) model
				.getPropositions()
				.toArray();
		setPropositions(propArray);

		Constraint[] consArray = (Constraint[]) model
				.getConstraints()
				.toArray();
 		setConstraints(consArray);

		State[] stateArray = (State[]) model
				.getStates().toArray();
		setStates(stateArray);

		Transition[] tranArray = (Transition[]) model
				.getTransitions()
				.toArray();
		setTransitions(tranArray);

		State initial = model.getInit();
		setInitial(initial);
	}

	@Override
	public Set<ContextProposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(Proposition... propositions) {
		this.propositions = new HashSet<ContextProposition>();
		for (int i = 0; i < propositions.length; i++) {
			this.propositions.add(new ContextProposition(propositions[i]
					.getName()));
		}
	}

	public ContextProposition getContextPropositionByName(String name) {
		for (ContextProposition proposition : propositions) {
			if (proposition.getName().equals(name)) {
				return proposition;
			}
		}
		return null;
	}

	@Override
	public Set<ModelConstraint> getConstraints() {
		return constraints;
	}

	public void setConstraints(Constraint... constraints) {
		this.constraints = new HashSet<ModelConstraint>();
			for (int i = 0; i < constraints.length; i++) {
			this.constraints.add(new ModelConstraint(constraints[i].getName(),
					getContextPredicate(constraints[i].getExpression())));
		}
	}
	
	private ContextPredicate getContextPredicate(LogicExpression expression) {		
		if(expression.getProp() != null){
			return getContextPropositionByName(expression.getProp().getName());
		}else if(expression.getMultiple() != null){
			return getContextPredicate(expression.getMultiple());
		}else if(expression.getUnary() != null){
			switch (expression.getOpUn()) {
			case NOT:
				 return ContextPredicate.not(getContextPredicate(expression.getUnary()));
			default:
				return null;
			}
		}else if(expression.getRight() != null && expression.getLeft() != null){
			switch (expression.getOpBin()) {
			case AND:
				return ContextPredicate.and(getContextPredicate(expression.getLeft()),
						getContextPredicate(expression.getRight()));
			case OR: 
				return ContextPredicate.or(getContextPredicate(expression.getLeft()),
					getContextPredicate(expression.getRight()));
			case IFF:
				return ContextPredicate.ifOnlyIf(getContextPredicate(expression.getLeft()),
					getContextPredicate(expression.getRight()));
			case IFTHEN:
				return ContextPredicate.ifThen(getContextPredicate(expression.getLeft()),
						getContextPredicate(expression.getRight()));
			case NAND:
				return ContextPredicate.nand(getContextPredicate(expression.getLeft()),
						getContextPredicate(expression.getRight()));
			case NOR:
				return ContextPredicate.nor(getContextPredicate(expression.getLeft()),
						getContextPredicate(expression.getRight()));
			case XOR:
				return ContextPredicate.xor(getContextPredicate(expression.getLeft()),
						getContextPredicate(expression.getRight()));
			default:
				return null;
			}
		}
		else
		{
			return null;
		}
	}
	
	private ContextPredicate getContextPredicate(MultipleExpression expression) {
		ArrayList<ContextProposition> list = 
				populatePropositionList((Operation)expression, new ArrayList<ContextProposition>());
		
		return ContextPredicate.dsjn(list.toArray(new ContextProposition[0]));
	}
	
	private ArrayList<ContextProposition> populatePropositionList(Operation operation, 
			ArrayList<ContextProposition> list){
		if(operation.getLeft() != null)
		{
			MultipleExpression multiple = operation.getLeft();
			list.add(getContextPropositionByName(multiple.getValue().getName()));
		}
		if(operation.getRight() instanceof Operation)
		{
			return populatePropositionList((Operation)operation.getRight(), list);
		}
		else if(operation.getRight() instanceof MultipleExpression)
		{
			MultipleExpression multiple = operation.getRight();
			list.add(getContextPropositionByName(multiple.getValue().getName()));
			return list;
		}
		else
		{
			return null;
		}
			
	}

	public ModelConstraint getModelConstraintByName(String name) {
		for (ModelConstraint constraint : constraints) {
			if (constraint.getName().equals(name)) {
				return constraint;
			}
		}
		return null;
	}

	@Override
	public Set<TransitionAbstraction> getTransitions() {
		return transitions;
	}

	public void setTransitions(Transition... transitions) {
		this.transitions = new HashSet<TransitionAbstraction>();
		for (int i = 0; i < transitions.length; i++) {
			StateAbstraction init = getStateAbstractionByName(transitions[i]
					.getInit().getName());
			StateAbstraction end = getStateAbstractionByName(transitions[i]
					.getEnd().getName());			
			TransitionAbstraction transition = new TransitionAbstraction(init,
					end);			
			this.transitions.add(transition);
		}
	}

	public Set<StateAbstraction> getStates() {
		return states;
	}

	public void setStates(State... states) {
		this.states = new HashSet<StateAbstraction>();
		for (int i = 0; i < states.length; i++) {
			this.states.add(new StateAbstraction(states[i].getName(),
					getContextPredicate(states[i].getExpression())));
		}
	}

	public StateAbstraction getStateAbstractionByName(String name) {
		for (StateAbstraction state : states) {
			if (state.getId().equals(name)) {
				return state;
			}
		}
		return null;
	}

	public StateAbstraction getInitial() {
		return initial;
	}

	public void setInitial(State state) {
		this.initial = getStateAbstractionByName(state.getName());
		this.initial.setInitial(true);
	}

	@Override
	public Set<CEModel> getContextualExceptions() {
		// TODO Auto-generated method stub
		return null;
	}

	public StringBuffer[] buildModel() {
		try {
			return ModelBuilder.getXML(this);
		} catch (CKSBuildException e) {
			e.printStackTrace();
		}
		return null;
	}
}*/