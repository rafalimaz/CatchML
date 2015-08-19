package br.ufc.great.jcaehv.model.concurrency;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.concurrency.tree.HandleLeaf;
import br.ufc.great.jcaehv.model.concurrency.tree.HandleNode;

public class ContextTree implements ExceptionResolutionStrategy {

	private HandleNode tree;

	private Set<HandleLeaf> handleLeafs = new HashSet<HandleLeaf>();

	@Override
	public Set<ContextualException> resolve(ContextState exceptionalState) throws EvaluationException {
		if (exceptionalState != null) {
			ContextPropositionAssignment assignment = exceptionalState.getAssignment();
			Set<ContextualException> raisedExceptions = exceptionalState.getRaisedAndCaugthExceptions();
			handleLeafs = new HashSet<HandleLeaf>();

			for (ContextualException raisedException : raisedExceptions) {
				handleLeafs.add(this.tree.getHandleLeaf(raisedException.getName()));
			}
			HandleLeaf lower = this.findLowerHeight(handleLeafs);
			handleLeafs.remove(lower);
			HandleNode handleNode = this.findHandlingSubtree(lower);
			ContextualException theChosenOne = handleNode.resolve(assignment);
			if (theChosenOne != null) {
				Set<ContextualException> result = new LinkedHashSet<ContextualException>();
				result.add(theChosenOne);
				return result;
			}
			return null;
		}
		return null;
	}

	public HandleNode getExceptionTree() {
		return tree;
	}

	public void setExceptionTree(HandleNode tree) {
		this.tree = tree;
	}

	private HandleLeaf findLowerHeight(Set<HandleLeaf> leafs) {
		int lowerHeight = Integer.MIN_VALUE;
		HandleLeaf lowerLeaf = null;

		for (HandleLeaf handleLeaf : handleLeafs) {
			int height = findHeight(handleLeaf);
			if (lowerHeight < height) {
				lowerHeight = height;
				lowerLeaf = handleLeaf;
			}
		}
		return lowerLeaf;
	}

	private int findHeight(HandleNode node) {
		int height = 0;
		while (node != null && node.getParent() != null) {
			height++;
			node = node.getParent();
		}
		return height;
	}

	private HandleNode findHandlingSubtree(HandleLeaf node) {
		HandleNode parent = node.getParent();
		HandleNode current = node;
		while (!this.handleLeafs.isEmpty() && parent != null) {
			if (current.equals(parent.getLeftNode())) {
				find(parent.getRightNode());
			} else {
				find(parent.getLeftNode());
			}
			current = parent;
			parent = current.getParent();
		}
		return current;
	}

	private void find(HandleNode node) {
		if (node instanceof HandleLeaf) {
			tryRemove((HandleLeaf) node);
		} else {
			find(node.getLeftNode());
			find(node.getRightNode());
		}
	}

	private void tryRemove(HandleLeaf node) {
		if (this.handleLeafs.contains(node)) {
			this.handleLeafs.remove(node);
		}
	}
}