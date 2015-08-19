package br.ufc.great.cks;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.expression.ContextProposition;
import br.ufc.great.expression.exception.EvaluationException;
import br.ufc.great.model.Alphabet;
import br.ufc.great.model.Assignment;
import br.ufc.great.model.Environment;
import br.ufc.great.model.ModelConstraint;
import br.ufc.great.model.StateAbstraction;
import br.ufc.great.model.SystemModel;
import br.ufc.great.model.TransitionAbstraction;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class CKSBuilder {

	private Alphabet alphabet;

	private Set<ContextProposition> propositions;

	private HashMap<String, StateAbstraction> stateAbstractions;

	private Map<String, TransitionAbstraction> transitions;

	private Set<ModelConstraint> contraints;

	private CKSModel cks;

	public CKSBuilder() {
		this.alphabet = new Alphabet();
		this.propositions = new HashSet<ContextProposition>();
		this.transitions = new HashMap<String, TransitionAbstraction>();
		this.contraints = new HashSet<ModelConstraint>();
		this.stateAbstractions = new HashMap<String, StateAbstraction>();
		this.cks = new CKSModel();
	}

	public void addConstraint(ModelConstraint constraint) {
		this.contraints.add(constraint);
	}

	public void addTransition(StateAbstraction from, StateAbstraction to) {
		if (!this.stateAbstractions.containsKey(from.getId())) {
			this.stateAbstractions.put(from.getId(), from);
		}

		if (!this.stateAbstractions.containsKey(to.getId())) {
			this.stateAbstractions.put(to.getId(), to);
		}

		if (!this.transitions.containsKey(from.getId() + "->" + to.getId())) {
			TransitionAbstraction trans = new TransitionAbstraction(from, to);
			this.transitions.put(from.getId() + "->" + to.getId(), trans);
		}
	}

	public Collection<TransitionAbstraction> getTransitions() {
		return this.transitions.values();
	}

	public Alphabet getAlphabet() {
		return alphabet;
	}

	public void addProposition(ContextProposition proposition) {
		if (this.propositions.add(proposition)) {
			this.alphabet.addSymbol(proposition.getName());
		}
	}

	public void build(SystemModel model) throws CKSBuildException {
		this.cks.setName(model.getName());
		this.cks.setConstraints(model.getConstraints());

		for (ContextProposition proposition : model.getPropositions()) {
			this.addProposition(proposition);
		}

		for (ModelConstraint constraint : model.getConstraints()) {
			this.addConstraint(constraint);
		}

		for (TransitionAbstraction transition : model.getTransitions()) {
			this.addTransition(transition.getFrom(), transition.getTo());
		}
		this.build();
	}

	public void build() throws CKSBuildException {

		this.buildStates();
		try {
			this.buildTransitions();
		} catch (EvaluationException ee) {
			throw new CKSBuildException("The CKS cannot be built.", ee);
		}
	}

	public CKSModel getCKSModel() {
		this.cks.doStateTextLabeling();
		return this.cks;
	}

	public CKSModel getTotalCKSWithTerminalStateLoop() {
		CKSModel cks = this.getCKSModel();
		cks.removeUnreachableStates();
		cks.addLoopTransitionOnTerminals();
		cks.doStateTextLabeling();
		return cks;
	}

	public CKSModel getTotalCKSWithoutTerminalStates() {
		CKSModel cks = this.getCKSModel();
		while (cks.hasTerminalState() || cks.hasUnreachableState()) {
			cks.removeUnreachableStates();
			cks.removeTerminalStates();
		}
		cks.doStateTextLabeling();
		return cks;
	}

	public CKSModel getCKSWithoutUnreachableStates() {
		CKSModel cks = this.getCKSModel();
		cks.removeUnreachableStates();
		cks.doStateTextLabeling();
		return cks;
	}

	private void buildStates() throws CKSBuildException {
		if (this.stateAbstractions != null
				&& this.stateAbstractions.size() >= 1) {
			for (StateAbstraction state : this.stateAbstractions.values()) {
				if (state.getPredicate() == null) {
					throw new CKSBuildException("The state abstraction "
							+ state.getId() + "' predicate is NULL.");
				}
				this.buildContextState(state);
			}
		} else {
			throw new CKSBuildException(
					"There are no state abstractions in the builder.");
		}

		if (this.cks.getStateNumber() == 0) {
			throw new CKSBuildException("No context state was generated.");
		}
	}

	private void buildContextState(StateAbstraction state) {
		Model model = new CPModel();
		Environment coverter = Environment.getInstance();
		coverter.build(this.getAlphabet());
		coverter.fill(model);

		Iterator<ModelConstraint> cstrIt = this.contraints.iterator();
		while (cstrIt.hasNext()) {
			ModelConstraint constraint = cstrIt.next();
			if (constraint.isStateConstraint()) {
				model.addConstraint(constraint.getConstraint().toChocoModel());
			}
		}

		model.addConstraint(state.getPredicate().toChocoModel());

		Solver solver = new CPSolver();
		solver.read(model);
		solver.solve();

		if (solver.isFeasible()) {
			do {
				Iterator<IntegerVariable> it = model.getIntVarIterator();
				Assignment assig = new Assignment(this.getAlphabet());
				while (it.hasNext()) {
					IntegerVariable var = it.next();
					String symbolName = var.getName();
					boolean symbolValue = solver.getVar(var).getVal() == 1;
					assig.assign(symbolName, symbolValue);
				}
				ContextState contextState = new ContextState(assig);
				contextState.setInitial(state.isInitial());
				this.cks.addState(contextState);
			} while (solver.isFeasible() && solver.nextSolution());
		}
	}

	private void buildTransitions() throws EvaluationException,
			CKSBuildException {
		if (this.transitions != null && this.transitions.size() >= 1) {
			for (TransitionAbstraction transition : this.transitions.values()) {
				buildTransition(transition);
			}
		} else {
			throw new CKSBuildException(
					"There are no transition abstractions in the builder.");
		}
	}

	private void buildTransition(TransitionAbstraction transition)
			throws EvaluationException, CKSBuildException {
		Set<ContextState> fromSet = new HashSet<ContextState>();
		Set<ContextState> toSet = new HashSet<ContextState>();

		for (ContextState state : this.cks.getStates()) {
			if (state.check(transition.getFrom().getPredicate())) {
				fromSet.add(state);
			}

			if (state.check(transition.getTo().getPredicate())) {
				toSet.add(state);
			}
		}
		if (fromSet.size() > 0) {
			for (ContextState from : fromSet) {
				for (ContextState to : toSet) {
					if (this.cks.tryDoTransition(from, to)) {
						from.addNextState(to);
						to.addPreviousState(from);
					}
				}
			}
		}
	}
}