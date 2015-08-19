package br.ufc.great.jcaehv.model.concurrency;

import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.concurrency.tree.HandleNode;

public class ContextTree implements ExceptionResolutionStrategy {

	private Set<HandleNode> exceptionTree = new LinkedHashSet<HandleNode>();

	@Override
	public Set<ContextualException> resolve(ContextState exceptionalState) throws EvaluationException {
		if (exceptionalState != null) {
			ContextPropositionAssignment assignment = exceptionalState.getAssignment();
			Set<ContextualException> raisedExceptions = exceptionalState.getRaisedAndCaugthExceptions();
			if (raisedExceptions != null && !raisedExceptions.isEmpty()) {
				HandleNode handleNode = getExceptionTree(raisedExceptions);
				Set<ContextualException> theChosenOne = new LinkedHashSet<ContextualException>();
				theChosenOne.add(handleNode.resolve(assignment));
				return theChosenOne;
			}
		}
		return null;
	}

	public void addExceptionTree(HandleNode tree) {
		this.exceptionTree.add(tree);
	}

	public HandleNode getExceptionTree(Set<ContextualException> raised) {
		for (HandleNode handleNode : exceptionTree) {
			Set<ContextualException> exceptions = handleNode.getExceptions();
			if (raised.size() == exceptions.size() && raised.containsAll(exceptions)) {
				return handleNode;
			}
		}
		return null;
	}
}