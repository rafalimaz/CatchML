package br.ufc.great.jcaehv.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.context.Alphabet;
import br.ufc.great.jcaehv.context.ContextProposition;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.concurrency.ExceptionResolutionStrategy;
import br.ufc.great.jcaehv.model.concurrency.HandleAll;

public class CAEHModel {

	private String name;

	private Set<ContextProposition> propositions;

	private Set<SemanticConstraint> semanticConstraints;

	private Set<TransitionConstraint> transitionConstraints;

	private ExceptionResolutionStrategy resolutionStrategy;

	private Set<HandlingScope> handlingScopes;

	private Map<String, String> properties;

	public CAEHModel(String name) {
		this.name = name;
		this.propositions = new LinkedHashSet<ContextProposition>();
		this.semanticConstraints = new LinkedHashSet<SemanticConstraint>();
		this.transitionConstraints = new LinkedHashSet<TransitionConstraint>();
		this.handlingScopes = new LinkedHashSet<HandlingScope>();
		this.properties = new LinkedHashMap<String, String>();
		this.resolutionStrategy = new HandleAll();
	}

	public String getName() {
		return name;
	}

	public void setExceptionResolutionStrategy(ExceptionResolutionStrategy strategy) {
		this.resolutionStrategy = strategy;
	}

	public Set<ContextualException> getContextualExceptions() {
		Set<ContextualException> exceptions = new LinkedHashSet<ContextualException>();
		for (HandlingScope hscope : handlingScopes) {
			exceptions.add(hscope.getContextualException());
		}
		return exceptions;
	}

	public Set<HandlingScope> getHandlingScopes() {
		return handlingScopes;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public Set<ContextProposition> getContextPropositions() {
		return propositions;
	}

	public void addContextProposition(ContextProposition proposition) {
		propositions.add(proposition);
	}

	public Set<SemanticConstraint> getSemanticConstraints() {
		return semanticConstraints;
	}

	public void addSemanticConstraint(SemanticConstraint constraint) {
		semanticConstraints.add(constraint);
	}

	public void addHandlingScope(HandlingScope scope) {
		handlingScopes.add(scope);
	}

	public void addPropertie(String label, String formula) {
		this.properties.put(label, formula);
	}

	public boolean hasSemanticConstraints() {
		return !semanticConstraints.isEmpty();
	}

	public Set<TransitionConstraint> getTransitionConstraints() {
		return transitionConstraints;
	}

	public void addTransitionConstraint(TransitionConstraint constraint) {
		transitionConstraints.add(constraint);
	}

	public Alphabet getAlphabet() {
		Alphabet alphabet = new Alphabet();
		for (ContextProposition proposition : this.propositions) {
			alphabet.addSymbol(proposition.getName());
		}
		return alphabet;
	}

	public void fillSateWithRaisedAndCaugthExceptions(ContextState state) throws EvaluationException {
		Set<ContextualException> raisedAndCaugthExceptions = this.getRaisedAndCaugthExceptions(state);
		if (raisedAndCaugthExceptions != null && !raisedAndCaugthExceptions.isEmpty()) {
			for (ContextualException exception : raisedAndCaugthExceptions) {
				state.addRaisedAndCaugthException(exception);
			}
		}
	}

	public void fillSateWithRaisedExceptions(ContextState state) throws EvaluationException {
		Set<ContextualException> raisedExceptions = this.getRaisedExceptions(state);
		if (raisedExceptions != null && !raisedExceptions.isEmpty()) {
			for (ContextualException exception : raisedExceptions) {
				state.addRaisedException(exception);
			}
		}
	}

	public Set<ContextualException> getRaisedExceptions(ContextState state) throws EvaluationException {
		if (this.hasHandlingScopes()) {
			Set<ContextualException> raisedExceptions = new LinkedHashSet<ContextualException>();
			for (HandlingScope hscope : this.handlingScopes) {
				if (hscope.canBeRaised(state.getAssignment())) {
					raisedExceptions.add(hscope.getContextualException());
				}
			}
			return raisedExceptions;
		}
		return null;
	}

	public Set<ContextualException> getRaisedAndCaugthExceptions(ContextState state) throws EvaluationException {
		if (this.hasHandlingScopes()) {
			Set<ContextualException> caugthExceptions = new LinkedHashSet<ContextualException>();
			for (HandlingScope hscope : this.handlingScopes) {
				if (hscope.canBeRaisedAndCaught(state.getAssignment())) {
					caugthExceptions.add(hscope.getContextualException());
				}
			}
			return caugthExceptions;
		}
		return null;
	}

	public boolean hasHandlingScopes() {
		return !handlingScopes.isEmpty();
	}

	public Set<HandlingBehavior> resolve(ContextState state) throws EvaluationException {
		Set<HandlingBehavior> handlingBehaviors = null;
		if (this.resolutionStrategy != null) {
			Set<ContextualException> exceptions = this.resolutionStrategy.resolve(state);
			if (exceptions != null && !exceptions.isEmpty()) {
				handlingBehaviors = new LinkedHashSet<HandlingBehavior>();
				for (ContextualException exception : exceptions) {
					for (HandlingScope hscope : handlingScopes) {
						if (hscope.isScopeOf(exception)) {
							handlingBehaviors.add(hscope.getHandlingBehavior(state.getAssignment()));
						}
					}
				}
			}
		}
		return handlingBehaviors;
	}
}