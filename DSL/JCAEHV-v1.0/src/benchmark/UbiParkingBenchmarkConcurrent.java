package benchmark;

import static br.ufc.great.jcaehv.context.ContextExpression.and;
import static br.ufc.great.jcaehv.context.ContextExpression.not;
import static br.ufc.great.jcaehv.context.ContextExpression.or;
import static br.ufc.great.jcaehv.context.ContextExpression.xor;

import java.util.Set;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.JCAEHVReport;
import br.ufc.great.jcaehv.checker.KripkeModel;
import br.ufc.great.jcaehv.checker.mcie.CTLMCiE;
import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextProposition;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.CAEHToKripkeModel;
import br.ufc.great.jcaehv.model.CAEHModel;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.HandlingBehavior;
import br.ufc.great.jcaehv.model.HandlingCase;
import br.ufc.great.jcaehv.model.HandlingScope;
import br.ufc.great.jcaehv.model.concurrency.ContextTree;
import br.ufc.great.jcaehv.model.concurrency.HigherPriority;
import br.ufc.great.jcaehv.model.concurrency.tree.HandleLeaf;
import br.ufc.great.jcaehv.model.concurrency.tree.HandleNode;
import br.ufc.great.jcaehv.model.property.Property;
import br.ufc.great.jcaehv.model.property.PropertyGenerator;

public class UbiParkingBenchmarkConcurrent {

	enum Strategy {
		HANDLE_ALL, HIGHER_PRIORITY, CONTEXT_TREE;
	}

	public static void main(String[] args) throws EvaluationException {
		performScenariosWithHandleAll();
		performScenariosWithHigherPriority();
		performScenariosWithContextTree();
	}

	public static void performScenariosWithHandleAll() throws EvaluationException {
		performScenario1Round1("Scenario1Round1-HandleAll", Strategy.HANDLE_ALL);
		performScenario1Round2("Scenario1Round2-HandleAll", Strategy.HANDLE_ALL);
		performScenario1Round3("Scenario1Round3-HandleAll", Strategy.HANDLE_ALL);

		performScenario2Round1("Scenario2Round1-HandleAll", Strategy.HANDLE_ALL);
		performScenario2Round2("Scenario2Round2-HandleAll", Strategy.HANDLE_ALL);
		performScenario2Round3("Scenario2Round3-HandleAll", Strategy.HANDLE_ALL);

		performScenario3Round1("Scenario3Round1-HandleAll", Strategy.HANDLE_ALL);
		performScenario3Round2("Scenario3Round2-HandleAll", Strategy.HANDLE_ALL);
		performScenario3Round3("Scenario3Round3-HandleAll", Strategy.HANDLE_ALL);

		performScenario4Round1("Scenario4Round1-HandleAll", Strategy.HANDLE_ALL);
		performScenario4Round2("Scenario4Round2-HandleAll", Strategy.HANDLE_ALL);
		performScenario4Round3("Scenario4Round3-HandleAll", Strategy.HANDLE_ALL);

		correct("UbiParkingCorrect-HandleAll", Strategy.HANDLE_ALL);
	}

	public static void performScenariosWithHigherPriority() throws EvaluationException {
		performScenario1Round1("Scenario1Round1-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario1Round2("Scenario1Round2-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario1Round3("Scenario1Round3-HigherPriority", Strategy.HIGHER_PRIORITY);

		performScenario2Round1("Scenario2Round1-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario2Round2("Scenario2Round2-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario2Round3("Scenario2Round3-HigherPriority", Strategy.HIGHER_PRIORITY);

		performScenario3Round1("Scenario3Round1-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario3Round2("Scenario3Round2-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario3Round3("Scenario3Round3-HigherPriority", Strategy.HIGHER_PRIORITY);

		performScenario4Round1("Scenario4Round1-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario4Round2("Scenario4Round2-HigherPriority", Strategy.HIGHER_PRIORITY);
		performScenario4Round3("Scenario4Round3-HigherPriority", Strategy.HIGHER_PRIORITY);

		correct("UbiParkingCorrect-HigherPriority", Strategy.HIGHER_PRIORITY);
	}

	public static void performScenariosWithContextTree() throws EvaluationException {
		performScenario1Round1("Scenario1Round1-ContextTree", Strategy.CONTEXT_TREE);
		performScenario1Round2("Scenario1Round2-ContextTree", Strategy.CONTEXT_TREE);
		performScenario1Round3("Scenario1Round3-ContextTree", Strategy.CONTEXT_TREE);

		performScenario2Round1("Scenario2Round1-ContextTree", Strategy.CONTEXT_TREE);
		performScenario2Round2("Scenario2Round2-ContextTree", Strategy.CONTEXT_TREE);
		performScenario2Round3("Scenario2Round3-ContextTree", Strategy.CONTEXT_TREE);

		performScenario3Round1("Scenario3Round1-ContextTree", Strategy.CONTEXT_TREE);
		performScenario3Round2("Scenario3Round2-ContextTree", Strategy.CONTEXT_TREE);
		performScenario3Round3("Scenario3Round3-ContextTree", Strategy.CONTEXT_TREE);

		performScenario4Round1("Scenario4Round1-ContextTree", Strategy.CONTEXT_TREE);
		performScenario4Round2("Scenario4Round2-ContextTree", Strategy.CONTEXT_TREE);
		performScenario4Round3("Scenario4Round3-ContextTree", Strategy.CONTEXT_TREE);

		correct("UbiParkingCorrect-ContextTree", Strategy.CONTEXT_TREE);
	}

	public static void performScenario1Round1(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn), not(isHot)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);
	}

	public static void performScenario1Round2(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace), hasSpace));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreeStrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreeStrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreeStrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreeStrategy.addExceptionTree(noSpaceNode);

			caeh.setExceptionResolutionStrategy(contextTreeStrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario1Round3(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn), not(isHot)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace), hasSpace));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario2Round1(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace, not(inMovement)));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit, not(inMovement)));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario2Round2(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace, not(inMovement)));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario2Round3(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace, not(inMovement)));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit, not(inMovement)));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace, not(inMovement)));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);
	}

	public static void performScenario3Round1(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(inMovement, outOfPark, and(isHot, hasSmoke, not(isSprinklerOn))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, outOfPark, and(isHot, hasSmoke, not(isSprinklerOn))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario3Round2(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, and(inMovement, atParkPlace, not(hasSpace))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario3Round3(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(inMovement, outOfPark, and(isHot, hasSmoke, not(isSprinklerOn))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, outOfPark, and(isHot, hasSmoke, not(isSprinklerOn))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, and(inMovement, atParkPlace, not(hasSpace))));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario4Round1(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, inMovement, atParkExit, not(isSprinklerOn)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, inMovement, outOfPark, not(isSprinklerOn)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario4Round2(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit, not(inMovement)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}

	public static void performScenario4Round3(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, inMovement, atParkExit, not(isSprinklerOn)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, inMovement, outOfPark));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, inMovement, outOfPark, not(isSprinklerOn)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit, not(inMovement)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);
	}

	public static void correct(String name, Strategy resolutionSatrategy) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel(name);
		ContextProposition inMovement = new ContextProposition("inMovement");
		caeh.addContextProposition(inMovement);
		ContextProposition atParkEntrance = new ContextProposition("atParkEntrance");
		caeh.addContextProposition(atParkEntrance);
		ContextProposition atParkPlace = new ContextProposition("atParkPlace");
		caeh.addContextProposition(atParkPlace);
		ContextProposition atParkExit = new ContextProposition("atParkExit");
		caeh.addContextProposition(atParkExit);
		ContextProposition hasSpace = new ContextProposition("hasSpace");
		caeh.addContextProposition(hasSpace);
		ContextProposition isHot = new ContextProposition("isHot");
		caeh.addContextProposition(isHot);
		ContextProposition hasSmoke = new ContextProposition("hasSmoke");
		caeh.addContextProposition(hasSmoke);
		ContextProposition isSprinklerOn = new ContextProposition("isSprinklerOn");
		caeh.addContextProposition(isSprinklerOn);
		ContextExpression outOfPark = and(not(atParkEntrance), not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined", or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance, not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot, hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn, and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(fireScope);

		ContextualException noSpace = new ContextualException("NoSpace", and(inMovement, atParkPlace, not(hasSpace)));
		HandlingScope noSpaceScope = new HandlingScope(noSpace);
		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(inMovement, atParkExit));
		handlingCase.setHandlingBehavior(handlingBehavior);
		noSpaceScope.addHandlingCase(handlingCase);
		caeh.addHandlingScope(noSpaceScope);

		switch (resolutionSatrategy) {
		case HANDLE_ALL:
			break;

		case HIGHER_PRIORITY:
			HigherPriority higherPriorityStrategy = new HigherPriority();
			higherPriorityStrategy.put(fire, 1);
			higherPriorityStrategy.put(noSpace, 0);
			caeh.setExceptionResolutionStrategy(higherPriorityStrategy);
			break;

		case CONTEXT_TREE:
			ContextTree contextTreestrategy = new ContextTree();
			HandleNode node = HandleNode.node(or(atParkPlace, atParkEntrance, atParkExit), fire, noSpace);
			contextTreestrategy.addExceptionTree(node);

			HandleLeaf fireNode = new HandleLeaf(fire);
			contextTreestrategy.addExceptionTree(fireNode);

			HandleLeaf noSpaceNode = new HandleLeaf(noSpace);
			contextTreestrategy.addExceptionTree(noSpaceNode);
			caeh.setExceptionResolutionStrategy(contextTreestrategy);
			break;
		}

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel, properties);

	}
}
