package br.ufc.great.model;

public class TransitionAbstraction {

	private StateAbstraction from;

	private StateAbstraction to;

	public TransitionAbstraction() {
	}

	public TransitionAbstraction(StateAbstraction from, StateAbstraction to) {
		this.from = from;
		this.to = to;
	}

	public StateAbstraction getFrom() {
		return from;
	}

	public void setFrom(StateAbstraction from) {
		this.from = from;
	}

	public StateAbstraction getTo() {
		return to;
	}

	public void setTo(StateAbstraction to) {
		this.to = to;
	}
}