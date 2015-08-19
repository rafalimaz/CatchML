package br.ufc.great.jcaehv.context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ContextPropositionAssignment {

	private HashMap<String, Boolean> assignments;

	public ContextPropositionAssignment() {
		this.assignments = new HashMap<String, Boolean>();
	}

	public ContextPropositionAssignment(Alphabet alphabet) {
		this();
		for (String symbol : alphabet.getSymbols()) {
			this.assignments.put(symbol, false);
		}
	}

	public void assignTrue(String symbol) {
		this.assign(symbol, true);
	}

	public void assignFalse(String symbol) {
		this.assign(symbol, false);
	}

	public void assign(String symbol, boolean value) {
		this.assignments.put(symbol, value);
	}

	public boolean getValuationOf(String symbol) {
		return this.assignments.get(symbol);
	}

	public boolean hasSymbol(String symbol) {
		return this.assignments.containsKey(symbol);
	}

	public Set<String> getSymbols() {
		return this.assignments.keySet();
	}

	public Set<String> getTruthSymbols() {
		Set<String> truthSymbols = new HashSet<String>();
		Iterator<String> it = this.assignments.keySet().iterator();
		while (it.hasNext()) {
			String symbol = it.next();
			if (this.getValuationOf(symbol)) {
				truthSymbols.add(symbol);
			}
		}
		return truthSymbols;
	}

	public String getLabel() {
		StringBuffer label = new StringBuffer();
		label.append("{");
		Iterator<String> it = this.getTruthSymbols().iterator();
		while (it.hasNext()) {
			String symbol = it.next();
			if (this.getValuationOf(symbol)) {
				label.append(it.hasNext() ? symbol + ", " : symbol);
			}
		}
		label.append("}");
		return label.toString();
	}

	public int size() {
		return this.assignments.size();
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof ContextPropositionAssignment) {
			ContextPropositionAssignment objAss = ((ContextPropositionAssignment) obj);
			if (this.size() == objAss.size()) {
				result = this.getLabel().equals(objAss.getLabel());
			}
		}
		return result;
	}
}