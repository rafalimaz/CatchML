package br.ufc.great.jcaehv.model;

import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextExpression;

public class HandlingBehavior {

	private Set<ContextExpression> handlingSteps;

	public HandlingBehavior() {
		handlingSteps = new LinkedHashSet<ContextExpression>();
	}

	public void addHandlingStep(ContextExpression step) {
		this.handlingSteps.add(step);
	}

	public Set<ContextExpression> getHandlingSteps() {
		return handlingSteps;
	}

	public boolean isEmpty() {
		return handlingSteps.isEmpty();
	}
}