package br.ufc.great.jcaehv.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.KripkeStructureModel;
import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextExpression2ChocoConstraint;
import br.ufc.great.jcaehv.context.ContextPropositionAssignment;
import br.ufc.great.jcaehv.context.ContextState;
import br.ufc.great.jcaehv.context.EvaluationException;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class CAEH2KripkeModel {

	private KripkeStructureModel kripkeModel;

	public CAEH2KripkeModel() {
	}

	public KripkeStructureModel toKripkeModel(CAEHModel caeh) throws EvaluationException {
		this.kripkeModel = new KripkeStructureModel(caeh.getName());
		this.kripkeModel.setAlphabet(caeh.getAlphabet());

		buildContextStates(caeh);
		buildExceptionalControlFlow(caeh);
		removeTransitionConstraintViolations(caeh);
		markReachableStates();
		addLoopTransitionOnTerminals();
		return this.kripkeModel;
	}

	private void buildContextStates(CAEHModel caeh) {
		Model model = new CPModel();
		ContextExpression2ChocoConstraint constraintConversor = new ContextExpression2ChocoConstraint(caeh.getContextPropositions());
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
							this.buildHandlingTransitions(handlingBehavior, exceptionalState);
						}
					}
				}
			}
		}
	}

	private void buildHandlingTransitions(HandlingBehavior handlingBehavior, ContextState exceptionalState) throws EvaluationException {
		if (handlingBehavior != null && !handlingBehavior.isEmpty()) {
			Iterator<ContextExpression> handlingSteps = handlingBehavior.getHandlingSteps().iterator();
			ContextExpression previousStep = null;
			while (handlingSteps.hasNext()) {
				ContextExpression nextStep = handlingSteps.next();
				if (previousStep != null) {
					this.buildTransition(previousStep, nextStep);
				} else {
					Set<ContextState> nextHandlingState = this.kripkeModel.getHoldStates(nextStep);
					for (ContextState resumeState : nextHandlingState) {
						exceptionalState.addNextState(resumeState);
					}
				}
				previousStep = nextStep;
			}
		}
	}

	private void buildTransition(ContextExpression source, ContextExpression target) throws EvaluationException {
		Set<ContextState> sourceStates = this.kripkeModel.getHoldStates(source);
		if (sourceStates != null && !sourceStates.isEmpty()) {
			Set<ContextState> targetStates = this.kripkeModel.getHoldStates(target);
			if (targetStates != null && !targetStates.isEmpty()) {
				for (ContextState sourceState : sourceStates) {
					for (ContextState targetState : targetStates) {
						this.kripkeModel.addStateTransition(sourceState, targetState);
					}
				}
			}
		}
	}

	private void removeTransitionConstraintViolations(CAEHModel caeh) throws EvaluationException {
		Set<TransitionConstraint> transitionConstraints = caeh.getTransitionConstraints();
		if (transitionConstraints != null && !transitionConstraints.isEmpty()) {
			for (TransitionConstraint transitionConstraint : transitionConstraints) {
				this.removeTransitionConstraintViolation(transitionConstraint);
			}
		}
	}

	private boolean removeTransitionConstraintViolation(TransitionConstraint transitionConstraint) throws EvaluationException {
		Set<ContextState> selectedStates = this.kripkeModel.getHoldStates(transitionConstraint.getSelection());
		for (ContextState selectedState : selectedStates) {
			if (selectedState.hasNextStates()) {
				int[] nextStatesId = selectedState.getNextStatesId();
				for (int stateId : nextStatesId) {
					ContextState nextState = this.kripkeModel.getState(stateId);
					if (!nextState.sat(transitionConstraint.getConstraint())) {
						selectedState.removeNextState(nextState);
					}
				}
			}
		}
		return false;
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
			if (this.isTerminal(state)) {
				state.addNextState(state);
			}
		}
	}

	private boolean isTerminal(ContextState state) {
		return !state.hasNextStates();
	}
}
