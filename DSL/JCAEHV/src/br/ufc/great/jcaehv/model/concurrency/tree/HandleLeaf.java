package br.ufc.great.jcaehv.model.concurrency.tree;

import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.model.ContextualException;

public class HandleLeaf extends HandleNode {

	private String name;

	private ContextualException exception;

	public HandleLeaf(ContextualException definition) {
		this.exception = definition;
		this.name = definition.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContextualException getDefinition() {
		return exception;
	}

	public void setDefinition(ContextualException definition) {
		this.exception = definition;
	}

	public ContextualException resolve(ContextPropositionAssignment assignment) {
		return this.exception;
	}
}