package br.ufc.great.jcaehv.model.concurrency;

import java.util.Set;

import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.ContextualException;

public class HandleAll implements ExceptionResolutionStrategy {

	@Override
	public Set<ContextualException> resolve(ContextState exceptionalState) throws EvaluationException {
		return exceptionalState.getRaisedAndCaugthExceptions();
	}

}
