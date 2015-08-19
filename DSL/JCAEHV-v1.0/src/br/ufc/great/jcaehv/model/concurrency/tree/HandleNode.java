package br.ufc.great.jcaehv.model.concurrency.tree;

import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextExpressionEvaluator;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.ContextualException;

public class HandleNode {

	private HandleNode parent;

	private HandleNode leftNode;

	private HandleNode rightNode;

	private ContextExpression selection;

	public HandleNode() {
	}

	public HandleNode(ContextExpression selection) {
		this.selection = selection;
	}

	public HandleNode getParent() {
		return parent;
	}

	public void setParent(HandleNode parent) {
		this.parent = parent;
	}

	public HandleNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(HandleNode leftNode) {
		this.leftNode = leftNode;
	}

	public HandleNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(HandleNode rightNode) {
		this.rightNode = rightNode;
	}

	public ContextExpression getSelection() {
		return selection;
	}

	public void setSelection(ContextExpression selection) {
		this.selection = selection;
	}

	public ContextualException resolve(ContextPropositionAssignment assignment) throws EvaluationException {
		if (ContextExpressionEvaluator.eval(assignment, getSelection())) {
			return this.leftNode.resolve(assignment);
		} else {
			return this.rightNode.resolve(assignment);
		}
	}

	public static HandleNode node(ContextExpression selection, ContextualException left, ContextualException right) {
		HandleNode parent = new HandleNode(selection);
		HandleLeaf leftLeaf = new HandleLeaf(left);
		HandleLeaf rightLeaf = new HandleLeaf(right);
		leftLeaf.setParent(parent);
		rightLeaf.setParent(parent);
		parent.setLeftNode(leftLeaf);
		parent.setRightNode(rightLeaf);
		return parent;
	}

	public static HandleNode node(ContextExpression selection, HandleNode left, HandleNode right) {
		HandleNode parent = new HandleNode(selection);
		left.setParent(parent);
		right.setParent(parent);
		parent.setLeftNode(left);
		parent.setRightNode(right);
		return parent;
	}

	public Set<ContextualException> getExceptions() {
		Set<ContextualException> leaves = new LinkedHashSet<ContextualException>();
		leaves.addAll(this.leftNode.getExceptions());
		leaves.addAll(this.rightNode.getExceptions());
		return leaves;
	}
}