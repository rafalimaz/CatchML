package br.ufc.great.jcaehv.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.KripkeModel;
import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextExpressionToChocoConstraint;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class CAEHToKripkeModel {

	private KripkeModel kripkeModel;

	public CAEHToKripkeModel() {
	}

	public KripkeModel toKripkeModel(CAEHModel caeh) throws EvaluationException {
		this.kripkeModel = new KripkeModel(caeh.getName());
		this.kripkeModel.setAlphabet(caeh.getAlphabet());

		buildContextStates(caeh);
		buildExceptionalControlFlow(caeh);
		markReachableStates();
		addLoopTransitionOnTerminals();
		return this.kripkeModel;
	}

	private void buildContextStates(CAEHModel caeh) {
		Model model = new CPModel();
		ContextExpressionToChocoConstraint constraintConversor = new ContextExpressionToChocoConstraint(caeh.getContextPropositions());
		Collection<IntegerVariable> variables = constraintConversor.getChocoAlphabet();

		for (IntegerVariable variable : variables) {
			model.addVariable(variable);
		}

		if (caeh.hasSemanticConstraints()) {
			Set<SemanticConstraint> semanticConstraint = caeh.getSemanticConstraints();
			for (SemanticConstraint constraint : semanticConstraint) {
				Constraint chocoConstraint = constraintConversor.toChocoConstraint(constraint.getConstraint());
				model.addConstraint(chocoConstraint);
			}
		}

		if (caeh.hasHandlingScopes()) {
			ContextExpression disjunction = null;
			for (HandlingScope hscope : caeh.getHandlingScopes()) {
				ContextualException exception = hscope.getContextualException();
				if (disjunction != null) {
					disjunction = ContextExpression.or(disjunction, exception.getExceptionalContext());
				} else {
					disjunction = exception.getExceptionalContext();
				}

				if (hscope.hasHandlingCase()) {
					for (HandlingCase handlingCase : hscope.getHandlingCases()) {
						disjunction = ContextExpression.or(disjunction, handlingCase.getCatchConstraint());
						HandlingBehavior handlingBehavior = handlingCase.getHandlingBehavior();
						for (ContextExpression step : handlingBehavior.getHandlingSteps()) {
							disjunction = ContextExpression.or(disjunction, step);
						}
					}
				}
			}
		}

		Solver solver = new CPSolver();
		solver.read(model);
		solver.solve();

		if (solver.isFeasible()) {
			do {
				Iterator<IntegerVariable> it = model.getIntVarIterator();
				ContextPropositionAssignment assignment = new ContextPropositionAssignment(caeh.getAlphabet());
				while (it.hasNext()) {
					IntegerVariable var = it.next();
					String symbolName = var.getName();
					boolean symbolValue = solver.getVar(var).getVal() == 1;
					assignment.assign(symbolName, symbolValue);
				}
				ContextState contextState = new ContextState(assignment);
				this.kripkeModel.addState(contextState);
			} while (solver.isFeasible() && solver.nextSolution());
		}
	}

	private void buildExceptionalControlFlow(CAEHModel caeh) throws EvaluationException {
		if (caeh != null && caeh.hasHandlingScopes()) {
			for (ContextState state : this.kripkeModel.getStates()) {
				caeh.fillSateWithRaisedExceptions(state);
				caeh.fillSateWithRaisedAndCaugthExceptions(state);
				if (state.isExceptional()) {
					state.removeAllNextStates();
					state.setInitial(true);
				}
			}

			if (this.kripkeModel.hasExceptionalState()) {
				Set<HandlingBehavior> handlingBehaviors = null;
				Set<ContextState> exceptionalStates = this.kripkeModel.getExceptionalStates();
				for (ContextState exceptionalState : exceptionalStates) {
					handlingBehaviors = caeh.resolve(exceptionalState);
					if (handlingBehaviors != null && !handlingBehaviors.isEmpty()) {
						for (HandlingBehavior handlingBehavior : handlingBehaviors) {
							this.buildHandlingTransitions(exceptionalState, handlingBehavior, caeh);
						}
					}
				}
			}
		}
	}

	private void buildHandlingTransitions(ContextState exceptionalState, HandlingBehavior handlingBehavior, CAEHModel caeh) throws EvaluationException {
		if (handlingBehavior != null && !handlingBehavior.isEmpty()) {
			Set<ContextState> validSourceStates = new LinkedHashSet<ContextState>();
			validSourceStates.add(exceptionalState);
			Iterator<ContextExpression> handlingSteps = handlingBehavior.getHandlingSteps().iterator();

			while (handlingSteps.hasNext()) {
				ContextExpression handlingStep = handlingSteps.next();
				if (this.canDoAtLeastOneTransition(validSourceStates, handlingStep, caeh)) {
					validSourceStates = tryDoTransitions(validSourceStates, handlingStep, caeh);
				} else {
					break;
				}
			}
		}
	}

	private Set<ContextState> tryDoTransitions(Set<ContextState> sourceStates, ContextExpression target, CAEHModel caeh) throws EvaluationException {
		Set<ContextState> validTargetStates = new LinkedHashSet<ContextState>();
		Set<ContextState> targetStateCandidates = this.kripkeModel.getHoldStates(target);
		if (sourceStates != null && !sourceStates.isEmpty() && targetStateCandidates != null && !targetStateCandidates.isEmpty()) {
			for (ContextState sourceState : sourceStates) {
				for (ContextState targetStateCandidate : targetStateCandidates) {
					if (canDoTransition(sourceState, targetStateCandidate, caeh.getTransitionConstraints())) {
						this.kripkeModel.addStateTransition(sourceState, targetStateCandidate);
						validTargetStates.add(targetStateCandidate);
					}
				}
			}
		}

		return validTargetStates;
	}

	private boolean canDoAtLeastOneTransition(Set<ContextState> sourceStates, ContextExpression target, CAEHModel caeh) throws EvaluationException {
		if (sourceStates != null && !sourceStates.isEmpty()) {
			Set<ContextState> targetStates = this.kripkeModel.getHoldStates(target);
			if (targetStates != null && !targetStates.isEmpty()) {
				for (ContextState sourceState : sourceStates) {
					for (ContextState targetState : targetStates) {
						if (canDoTransition(sourceState, targetState, caeh.getTransitionConstraints())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean canDoTransition(ContextState source, ContextState target, Set<TransitionConstraint> transitionConstraints)
			throws EvaluationException {
		if (source != null && target != null && transitionConstraints != null && !transitionConstraints.isEmpty()) {
			for (TransitionConstraint transitionConstraint : transitionConstraints) {
				if (source.sat(transitionConstraint.getSelection()) && !target.sat(transitionConstraint.getConstraint())) {
					return false;
				}
			}
		}
		return true;
	}

	private void markReachableStates() {
		for (ContextState initial : this.kripkeModel.getInitialStates()) {
			initial.setReachable(true);
			this.markNextReachableStates(initial);
		}
	}

	private void markNextReachableStates(ContextState current) {
		if (current.hasNextStates()) {
			int[] nextStatesId = current.getNextStatesId();
			for (int stateId : nextStatesId) {
				ContextState nextState = this.kripkeModel.getState(stateId);
				if (!nextState.isReachable()) {
					nextState.setReachable(true);
					this.markNextReachableStates(nextState);
				}
			}
		}
	}

	private void addLoopTransitionOnTerminals() {
		for (ContextState state : this.kripkeModel.getStates()) {
			if (state.isReachable() && state.isTerminal()) {
				state.addNextState(state);
			}
		}
	}
}
