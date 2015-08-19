package br.ufc.great.model;

import java.util.Collection;
import java.util.HashMap;

import choco.Choco;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;

public class Environment {

	private HashMap<String, IntegerVariable> chocoAlphabet;

	private static Environment instance;

	private Environment() {
		this.chocoAlphabet = new HashMap<String, IntegerVariable>();
	}

	public void build(Alphabet alphabet) {
		for (String symbol : alphabet.getSymbols()) {
			this.chocoAlphabet.put(symbol, Choco.makeBooleanVar(symbol));
		}
	}

	public void fill(Model model) {
		Collection<IntegerVariable> vars = this.chocoAlphabet.values();
		for (IntegerVariable var : vars) {
			model.addVariable(var);
		}
	}

	public static Environment getInstance() {
		if (instance == null) {
			instance = new Environment();
		}
		return instance;
	}

	public IntegerVariable getChocoVar(String symbol) {
		if (this.chocoAlphabet.containsKey(symbol)) {
			return this.chocoAlphabet.get(symbol);
		}
		return null;
	}
}