package org.xtext.example.mydsl.converter;
/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.AbstractExpression;
import org.xtext.example.mydsl.myDsl.ContextModel;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExpressionDeclaration;
import org.xtext.example.mydsl.myDsl.Handler;
import org.xtext.example.mydsl.myDsl.HandlingModel;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MultipleExpression;
import org.xtext.example.mydsl.myDsl.Operation;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.Scope;
import org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.SpecificationModel;
import org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.KripkeModelTXTReport;
import br.ufc.great.jcaehv.checker.KripkeStructureModel;
import br.ufc.great.jcaehv.checker.mcie.CTLTransitionSystemMCiE;
import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.context.ContextProposition;
import br.ufc.great.jcaehv.context.EvaluationException;
import br.ufc.great.jcaehv.model.CAEH2KripkeModel;
import br.ufc.great.jcaehv.model.CAEHModel;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.HandlingBehavior;
import br.ufc.great.jcaehv.model.HandlingCase;
import br.ufc.great.jcaehv.model.HandlingScope;
import br.ufc.great.jcaehv.model.property.Property;
import br.ufc.great.jcaehv.model.property.PropertyGenerator;

public class CopyOfMyDslToCAEH extends CAEHModel {
	private EList<ExpressionDeclaration> exprList; 
	
	public CopyOfMyDslToCAEH(Model model) {
		super(model.getName());
		
		// Context Model
		ContextModel contextModel = model.getContextModel();
		
		PropositionDeclaration[] propArray = (PropositionDeclaration[]) contextModel
				.getPropositionsList().getPropositions().toArray();
		setPropositions(propArray);
		
		exprList = contextModel.getExpressionsList().getExpressions();
		
		SemanticConstraintDeclaration[] semconsArray = (SemanticConstraintDeclaration[]) contextModel
				.getSemanticConstraintsList().getConstraints().toArray();
 		setSemanticConstraints(semconsArray);

		TransitionConstraintDeclaration[] tranconsArray = (TransitionConstraintDeclaration[]) contextModel
				.getTransitionConstraintsList().getConstraints().toArray();
		setTransitionConstraints(tranconsArray);
		
		//Handling Model
		HandlingModel handlingModel = model.getHandlingModel();
		
		ExceptionDeclaration[] excptArray = 
 				(ExceptionDeclaration[]) handlingModel
				.getExceptionsList().getExceptions().toArray();
		
		Scope[] scopeArray = (Scope[]) handlingModel
				.getScopes().toArray();
		setHandlingScope(scopeArray);
		
		//Specification Model
		SpecificationModel specModel = model.getSpecificationModel();
		
		PropertyDeclaration[] ppArray = (PropertyDeclaration[]) specModel
				.getProperties().toArray();	
	}

	private void setHandlingScope(Scope... scopes) {
		for (int i = 0; i < scopes.length; i++) {
			addHandlingScope(new HandlingScope(
					new ContextualException(scopes[i].getException().getName(),
							getContextExpression(scopes[i].getException().getExpression()))
					,getHandlingCases(scopes[i].getHandlers())));
		}
	}

	private Set<HandlingCase> getHandlingCases(EList<Handler> handlers) {
		Set<HandlingCase> handlingCases = new HashSet<HandlingCase>();
		for (Handler handler : handlers) {
			HandlingCase hCase = new HandlingCase(
					getContextExpression(handler.getConditionExpression().getExpression()));
			HandlingBehavior hBehavior = new HandlingBehavior();
			for (LogicExpression action : handler.getActionsExpression().getActions()) {
				hBehavior.addHandlingStep(getContextExpression(action));
			}
			hCase.setHandlingBehavior(hBehavior);
			handlingCases.add(hCase);
		}
		return handlingCases;
	}

	private void setPropositions(PropositionDeclaration... propositions) {
		for (int i = 0; i < propositions.length; i++) {
			addContextProposition(new ContextProposition(propositions[i]
					.getName()));
		}
	}

	public ContextProposition getContextPropositionByName(String name) {
		for (ContextProposition proposition : propositions) {
			if (proposition.getName().equals(name)) {
				return proposition;
			}
		}
		return null;
	}
	
	private void setSemanticConstraints(SemanticConstraintDeclaration... constraints) {
		for (int i = 0; i < constraints.length; i++) {
		addSemanticConstraint(new SemanticConstraint
				(constraints[i].getName(),getContextExpression(constraints[i].getExpression())));
		}
	}
	
	private void setTransitionConstraints(TransitionConstraintDeclaration... constraints) {
		for (int i = 0; i < constraints.length; i++) {
		addTransitionConstraint(new TransitionConstraint(
				getContextExpression(constraints[i].getLeft()),
				getContextExpression(constraints[i].getRight()))
				);
	    }
	}
	
	private ContextExpression getContextExpression(LogicExpression expression) {		
		if(expression.getAtom() != null){
			AbstractExpression exp = expression.getAtom();
			if(exp instanceof PropositionDeclaration){
				return getContextPropositionByName(expression.getAtom().getName());
			}
			else if(exp instanceof ExpressionDeclaration)
			{
				return getContextExpression(((ExpressionDeclaration)exp).getExpression());
			}
			else
			{
				throw new RuntimeException("AbstractExpression parsing exception");
			}
		}else if(expression.getMultiple() != null){
			ArrayList<ContextExpression> list = 
					populateExpressionList((Operation)expression.getMultiple(), new ArrayList<ContextExpression>());
			switch (expression.getOpMul()) {
			case AND:
				return ContextExpression.and(list.toArray(new ContextExpression[0]));
			case OR: 
				return ContextExpression.or(list.toArray(new ContextExpression[0]));
			case XOR:
				return ContextExpression.xor(list.toArray(new ContextExpression[0]));
			default:
				throw new RuntimeException("MultipleExpression parsing exception");
			}			
		}else if(expression.getUnary() != null){
			switch (expression.getOpUn()) {
			case NOT:
				 return ContextExpression.not(getContextExpression(expression.getUnary()));
			default:
				throw new RuntimeException("UnaryExpression parsing exception");
			}
		}else if(expression.getRight() != null && expression.getLeft() != null){
			switch (expression.getOpBin()) {
//			case AND:
//				return ContextExpression.and(getContextExpression(expression.getLeft()),
//						getContextExpression(expression.getRight()));
//			case OR: 
//				return ContextExpression.or(getContextExpression(expression.getLeft()),
//						getContextExpression(expression.getRight()));
//			case XOR:
//				return ContextExpression.xor(getContextExpression(expression.getLeft()),
//					getContextExpression(expression.getRight()));
			case IFF:
				return ContextExpression.iff(getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			case IFTHEN:
				return ContextExpression.ifThen(getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			case NAND:
				return ContextExpression.nand(getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			case NOR:
				return ContextExpression.nor(getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			default:
				throw new RuntimeException("BinaryExpression parsing exception");
			}
		}
		else
		{
			throw new RuntimeException("LogicExpression parsing exception");
		}
	}
	
	private ArrayList<ContextExpression> populateExpressionList(Operation operation, 
			ArrayList<ContextExpression> list){
		if(operation.getLeft() != null)
		{
			MultipleExpression multiple = (MultipleExpression)operation.getLeft();
			list.add(getContextExpression(multiple.getValue()));
		}
		if(operation.getRight() instanceof Operation)
		{
			return populateExpressionList((Operation)operation.getRight(), list);
		}
		else if(operation.getRight() instanceof MultipleExpression)
		{
			MultipleExpression multiple = (MultipleExpression)operation.getRight();
			list.add(getContextExpression(multiple.getValue()));
			return list;
		}
		else
		{
			throw new RuntimeException("PopulateExpressionList parsing Exception");
		}	
	}
	
	public StringBuffer buildModel() {
		try {
			//checkModel(this);
			
			PropertyGenerator generator = new PropertyGenerator();
			Set<Property> properties = generator.generate(getHandlingScopes());

			CAEH2KripkeModel conversor = new CAEH2KripkeModel();
			KripkeStructureModel kripkeModel = conversor.toKripkeModel(this);

			CTLTransitionSystemMCiE checker = new CTLTransitionSystemMCiE();
			properties = checker.check(kripkeModel, properties);
			
			KripkeModelTXTReport report = new KripkeModelTXTReport();
			
			setProperties(properties);			
		    return report.generateReport(0, kripkeModel, properties);
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Set<Property> properties;
	
	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}
	
	private void checkModel(CopyOfMyDslToCAEH jcaehvModel) {
		System.out.println("Propositions:");
		for (ContextProposition prop : propositions) {
			System.out.print(prop.getName() + " ");
		}
		
		System.out.println("\nConstraints:");
		for (SemanticConstraint semCon : semanticConstraints) {
			System.out.println(semCon.getName() + ": " + semCon.getConstraint().toString());
		}
		for (TransitionConstraint tranCon : transitionConstraints) {
			System.out.println("Transition constraint: " + tranCon.getConstraint().toString());
		}
		
		System.out.println("\nScopes: ");
		for (HandlingScope scope : handlingScopes) {
			System.out.println("Exception: " + scope.getContextualException().getName() + " " + 
							scope.getContextualException().getExceptionalContext().toString());
			for (HandlingCase hCase : scope.getHandlingCases()) {
				System.out.println("When: " + hCase.getCatchConstraint().toString());
				for (ContextExpression step : hCase.getHandlingBehavior().getHandlingSteps()) {
					System.out.println("Step: " + step.toString());
				}
			}
		}		
	}
}*/