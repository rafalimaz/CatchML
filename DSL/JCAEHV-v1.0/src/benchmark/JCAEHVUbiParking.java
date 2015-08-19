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
import br.ufc.great.jcaehv.model.CAEHModel;
import br.ufc.great.jcaehv.model.CAEHToKripkeModel;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.HandlingBehavior;
import br.ufc.great.jcaehv.model.HandlingCase;
import br.ufc.great.jcaehv.model.HandlingScope;
import br.ufc.great.jcaehv.model.property.Property;
import br.ufc.great.jcaehv.model.property.PropertyGenerator;

public class JCAEHVUbiParking {
	public static void main(String args[]) throws EvaluationException {
		long startTime = System.currentTimeMillis();
		CAEHModel caeh = new CAEHModel("UbiParking");
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
		ContextExpression outOfPark = and(not(atParkEntrance),not(atParkPlace), not(atParkExit));
		caeh.addSemanticConstraint(new SemanticConstraint("AllPlacesDisjoined",or(xor(atParkEntrance, atParkPlace, atParkExit), outOfPark)));

		caeh.addTransitionConstraint(new TransitionConstraint(outOfPark, and(not(atParkPlace), not(atParkExit))));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkEntrance,not(atParkExit)));
		caeh.addTransitionConstraint(new TransitionConstraint(atParkPlace, and(not(atParkEntrance), not(outOfPark))));

		ContextualException fire = new ContextualException("Fire", and(isHot,hasSmoke, not(isSprinklerOn)));
		HandlingScope fireScope = new HandlingScope(fire);
		HandlingCase handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkPlace));
		HandlingBehavior handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn,and(inMovement, atParkExit)));
		handlingBehavior.addHandlingStep(and(isSprinklerOn,and(inMovement, outOfPark)));
		handlingCase.setHandlingBehavior(handlingBehavior);
		fireScope.addHandlingCase(handlingCase);

		handlingCase = new HandlingCase();
		handlingCase.setCatchConstraint(and(inMovement, atParkExit));
		handlingBehavior = new HandlingBehavior();
		handlingBehavior.addHandlingStep(and(isSprinklerOn,and(inMovement, outOfPark)));
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

		PropertyGenerator generator = new PropertyGenerator();
		Set<Property> properties = generator.generate(caeh.getHandlingScopes());

		CAEHToKripkeModel conversor = new CAEHToKripkeModel();
		KripkeModel kripkeModel = conversor.toKripkeModel(caeh);

		CTLMCiE checker = new CTLMCiE();
		properties = checker.check(kripkeModel, properties);

		JCAEHVReport report = new JCAEHVReport();
		report.report(System.currentTimeMillis() - startTime, kripkeModel,properties);
	}
}
