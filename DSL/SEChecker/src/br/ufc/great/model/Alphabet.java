package br.ufc.great.model;

import java.util.HashSet;
import java.util.Set;

public class Alphabet {

	private Set<String> symbols;

	public Alphabet() {
		this.symbols = new HashSet<String>();
	}

	public Alphabet(String[] symbols) {
		this();
		this.setSymbols(symbols);
	}

	public void addSymbol(String symbol) {
		this.symbols.add(symbol);
	}

	public Set<String> getSymbols() {
		return this.symbols;
	}

	public void setSymbols(String[] symbols) {
		for (String symbol : symbols) {
			this.addSymbol(symbol);
		}
	}

	public boolean hasSymbol(String symbol) {
		return this.symbols.contains(symbol);
	}
}