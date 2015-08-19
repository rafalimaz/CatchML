package br.ufc.great.jcaehv.model.concurrency;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.ContextualException;

public class HigherPriority implements ExceptionResolutionStrategy {

	private Map<String, Integer> exceptions;

	public HigherPriority() {
		this.exceptions = new HashMap<String, Integer>();
	}

	@Override
	public Set<ContextualException> resolve(ContextState exceptionalState) throws EvaluationException {
		if (exceptionalState != null) {
			Set<ContextualException> raisedExceptions = exceptionalState.getRaisedAndCaugthExceptions();

			if (raisedExceptions != null && !raisedExceptions.isEmpty()) {
				int higherPriority = Integer.MIN_VALUE;
				ContextualException theChosenOne = null;

				for (ContextualException raisedException : raisedExceptions) {
					int priority = this.exceptions.get(raisedException.getName());
					if (higherPriority <= priority) {
						if (higherPriority == priority) {
							theChosenOne = randomChoice(theChosenOne, raisedException);
						} else {
							theChosenOne = raisedException;
						}
						higherPriority = this.exceptions.get(raisedException.getName());
					}
				}
				if (theChosenOne != null) {
					Set<ContextualException> result = new LinkedHashSet<ContextualException>();
					result.add(theChosenOne);
					return result;
				}
				return null;
			}
		}
		return null;
	}

	private ContextualException randomChoice(ContextualException first, ContextualException second) {
		if (Math.random() > 0.5) {
			return first;
		} else {
			return second;
		}
	}

	public void put(ContextualException exception, int priority) {
		this.exceptions.put(exception.getName(), priority);
	}
}