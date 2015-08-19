package br.ufc.great.examples.pis;

import static br.ufc.great.expression.ContextPredicate.and;
import static br.ufc.great.expression.ContextPredicate.ifOnlyIf;
import static br.ufc.great.expression.ContextPredicate.ifThen;
import static br.ufc.great.expression.ContextPredicate.not;
import static br.ufc.great.expression.ContextPredicate.or;
import static br.ufc.great.expression.ContextPredicate.xor;

import java.util.HashSet;
import java.util.Set;

import br.ufc.great.caeh.CEModel;
import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.ContextProposition;
import br.ufc.great.model.ModelConstraint;
import br.ufc.great.model.StateAbstraction;
import br.ufc.great.model.SystemModel;
import br.ufc.great.model.TransitionAbstraction;

public class PISModel extends SystemModel {

	private ContextProposition doctorAtWard;

	private ContextProposition nurseAtWard;

	private ContextProposition nurseCanAccessReports;

	private ContextProposition nurseIsAccessingReports;

	private ContextProposition doctorWasFound;

	private ContextProposition doctorProvidesGrant;

	public PISModel(String name) {
		super(name);
	}

	@Override
	public Set<ContextProposition> getPropositions() {
		Set<ContextProposition> propositions = new HashSet<ContextProposition>();
		doctorAtWard = new ContextProposition("doctorAtWard");
		propositions.add(doctorAtWard);

		nurseAtWard = new ContextProposition("nurseAtWard");
		propositions.add(nurseAtWard);

		nurseCanAccessReports = new ContextProposition("nurseCanAccessReports");
		propositions.add(nurseCanAccessReports);

		nurseIsAccessingReports = new ContextProposition(
				"nurseIsAccessingReports");
		propositions.add(nurseIsAccessingReports);

		doctorWasFound = new ContextProposition("doctorWasFound");
		propositions.add(doctorWasFound);

		doctorProvidesGrant = new ContextProposition("doctorProvidesGrant");
		propositions.add(doctorProvidesGrant);

		return propositions;
	}

	@Override
	public Set<ModelConstraint> getConstraints() {
		Set<ModelConstraint> constraints = new HashSet<ModelConstraint>();
		ContextPredicate bothAtWard = and(doctorAtWard, nurseAtWard);
		ContextPredicate onlyNurseAtWard = and(not(doctorAtWard),
				and(nurseAtWard, doctorProvidesGrant));
		ContextPredicate accessGrant = ifOnlyIf(
				or(bothAtWard, onlyNurseAtWard), nurseCanAccessReports);
		ModelConstraint constraint = new ModelConstraint(accessGrant);
		constraint.setName("Access Grant");
		constraints.add(constraint);

		ContextPredicate noGrantsNeeded = ifThen(doctorAtWard,
				not(doctorProvidesGrant));
		constraint = new ModelConstraint(noGrantsNeeded);
		constraint.setName("No Grants Needed");
		constraints.add(constraint);

		return constraints;
	}

	@Override
	public Set<TransitionAbstraction> getTransitions() {
		Set<TransitionAbstraction> transitions = new HashSet<TransitionAbstraction>();
		StateAbstraction s0 = new StateAbstraction("s0", and(nurseAtWard,
				nurseCanAccessReports));
		s0.setInitial(true);

		StateAbstraction s1 = new StateAbstraction("s1", and(nurseAtWard,
				nurseIsAccessingReports));

		TransitionAbstraction transition = new TransitionAbstraction(s0, s1);
		transitions.add(transition);

		transition = new TransitionAbstraction(s1, s0);
		transitions.add(transition);

		return transitions;
	}

	@Override
	public Set<CEModel> getContextualExceptions() {
		Set<CEModel> exceptions = new HashSet<CEModel>();
		CEModel exception = new CEModel();
		exception.setName("Access");
		exception.setECS(and(nurseIsAccessingReports,
				and(not(doctorAtWard), not(doctorProvidesGrant))));

		exception.setHCS(and(doctorWasFound, doctorWasFound));

		exception.setRCS(xor(doctorAtWard, doctorProvidesGrant));

		exceptions.add(exception);

		return exceptions;
	}
}
