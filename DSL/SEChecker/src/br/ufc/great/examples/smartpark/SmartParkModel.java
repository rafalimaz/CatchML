package br.ufc.great.examples.smartpark;

import static br.ufc.great.expression.ContextPredicate.and;
import static br.ufc.great.expression.ContextPredicate.dsjn;
import static br.ufc.great.expression.ContextPredicate.ifThen;
import static br.ufc.great.expression.ContextPredicate.not;
import static br.ufc.great.expression.ContextPredicate.or;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.ufc.great.caeh.CEModel;
import br.ufc.great.expression.ContextPredicate;
import br.ufc.great.expression.ContextProposition;
import br.ufc.great.model.Alphabet;
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

public class SmartParkModel extends SystemModel {

	private ContextProposition isReady;

	private ContextProposition isRunning;

	private ContextProposition isStopped;

	private ContextProposition atPark;

	private ContextProposition hasSpace;

	private ContextProposition isHot;

	private ContextProposition hasSmoke;

	private ContextProposition isSpkOn;

	public SmartParkModel(String name) {
		super(name);
	}

	@Override
	public Set<ContextProposition> getPropositions() {
		Set<ContextProposition> properties = new HashSet<ContextProposition>();

		isReady = new ContextProposition("isReady");
		properties.add(isReady);

		isRunning = new ContextProposition("isRunning");
		properties.add(isRunning);

		isStopped = new ContextProposition("isStopped");
		properties.add(isStopped);

		atPark = new ContextProposition("atPark");
		properties.add(atPark);

		hasSpace = new ContextProposition("hasSpace");
		properties.add(hasSpace);

		isHot = new ContextProposition("isHot");
		properties.add(isHot);

		hasSmoke = new ContextProposition("hasSmoke");
		properties.add(hasSmoke);

		isSpkOn = new ContextProposition("isSpkOn");
		properties.add(isSpkOn);

		return properties;
	}

	@Override
	public Set<ModelConstraint> getConstraints() {
		Set<ModelConstraint> constraints = new HashSet<ModelConstraint>();

		ContextPredicate allDsjn = dsjn(isReady, isRunning, isStopped);
		constraints.add(new ModelConstraint(allDsjn));

		ContextPredicate spkOn = ifThen(and(hasSmoke, isHot), isSpkOn);
		constraints.add(new ModelConstraint(spkOn));

		return constraints;
	}

	@Override
	public Set<TransitionAbstraction> getTransitions() {
		Set<TransitionAbstraction> transitions = new HashSet<TransitionAbstraction>();

		ContextPredicate fs0 = and(not(atPark), isReady);
		StateAbstraction s0 = new StateAbstraction("s0", fs0);
		s0.setInitial(true);

		ContextPredicate fs1 = and(atPark, isRunning);
		StateAbstraction s1 = new StateAbstraction("s1", fs1);

		ContextPredicate fs2 = and(atPark, isStopped);
		StateAbstraction s2 = new StateAbstraction("s2", fs2);

		TransitionAbstraction transition = new TransitionAbstraction(s0, s1);
		transitions.add(transition);

		transition = new TransitionAbstraction(s1, s0);
		transitions.add(transition);

		transition = new TransitionAbstraction(s1, s2);
		transitions.add(transition);

		transition = new TransitionAbstraction(s2, s0);
		transitions.add(transition);

		return transitions;
	}

	@Override
	public Set<CEModel> getContextualExceptions() {
		Set<CEModel> exceptions = new HashSet<CEModel>();

		CEModel exception = new CEModel();
		exception.setName("Fire");
		exception.setECS(and(isHot, hasSmoke));
		exception.setHCS(or(isRunning, isStopped));
		exception.setRCS(and(isSpkOn, or(not(atPark), isStopped)));
		exceptions.add(exception);

		exception = new CEModel();
		exception.setName("NoFreeSpace");
		exception.setECS(and(and(atPark, isRunning), not(hasSpace)));
		exception.setHCS(and(atPark, isRunning));
		exception.setRCS(and(not(atPark), isReady));
		exceptions.add(exception);
		return exceptions;
	}

	public static void main(String[] args) {
		Alphabet alphabet = new Alphabet(new String[] { "a", "b", "c", "d",
				"e", "f", "g", "h" });
		Environment env = Environment.getInstance();
		env.build(alphabet);
		ContextProposition a = new ContextProposition("a");
		ContextProposition b = new ContextProposition("b");
		ContextProposition c = new ContextProposition("c");
		ContextProposition d = new ContextProposition("d");
		ContextProposition e = new ContextProposition("e");
		ContextProposition f = new ContextProposition("f");
		ContextProposition g = new ContextProposition("g");
		ContextPredicate onlyA = and(and(a, not(b)), not(c));
		ContextPredicate onlyB = and(and(not(a), b), not(c));
		ContextPredicate onlyC = and(and(not(a), not(b)), c);
		ContextPredicate conj = or(or(onlyA, onlyB), onlyC);
		ContextPredicate ifThen = ifThen(and(e, f), g);
		// ContextPredicate state = and(not(d), a);
		ContextPredicate state = or(or(and(not(d), a), and(d, b)), and(d, c));
		Model m = new CPModel();
		m.addVariable(env.getChocoVar("a"));
		m.addVariable(env.getChocoVar("b"));
		m.addVariable(env.getChocoVar("c"));
		m.addVariable(env.getChocoVar("d"));
		m.addVariable(env.getChocoVar("e"));
		m.addVariable(env.getChocoVar("f"));
		m.addVariable(env.getChocoVar("g"));
		m.addVariable(env.getChocoVar("h"));
		m.addConstraint(conj.toChocoModel());
		m.addConstraint(ifThen.toChocoModel());
		m.addConstraint(state.toChocoModel());

		Solver s = new CPSolver();
		s.read(m);
		s.solve();
		int i = 0;
		if (s.isFeasible()) {
			do {
				Iterator<IntegerVariable> it = m.getIntVarIterator();
				System.out.print("S(" + i++ + ") = { ");
				while (it.hasNext()) {
					IntegerVariable var = it.next();
					String symbolName = var.getName();
					boolean symbolValue = s.getVar(var).getVal() == 1;
					System.out.print(symbolName + "=" + symbolValue + " ");
				}
				System.out.println("}");
			} while (s.isFeasible() && s.nextSolution());
		}
	}
	
	public void generate(){
		main(null);
	}
}