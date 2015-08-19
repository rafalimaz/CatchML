package org.xtext.example.mydsl.converter;
/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.AbstractDeclaration;
import org.xtext.example.mydsl.myDsl.ActionDeclaration;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.MultipleExpression;
import org.xtext.example.mydsl.myDsl.Operation;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.ScopeDeclaration;
import org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.SituationDeclaration;
import org.xtext.example.mydsl.myDsl.SystemDeclaration;
import org.xtext.example.mydsl.myDsl.TemporalLogicExpression;
import org.xtext.example.mydsl.myDsl.TemporalLogicSubExpression;
import org.xtext.example.mydsl.myDsl.TemporalMultipleExpression;
import org.xtext.example.mydsl.myDsl.TemporalOperation;
import org.xtext.example.mydsl.myDsl.TemporalSubOperation;
import org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.impl.AndOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.OrOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.RelationalOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.TemporalAndOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.TemporalOrOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.TemporalRelationalOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.TemporalUnaryOpExpressionImpl;
import org.xtext.example.mydsl.myDsl.impl.UnaryOpExpressionImpl;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.KripkeModelSCXML;
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
import br.ufc.great.jcaehv.model.property.PropertyType;

public class MyDslToCAEHVConventional extends CAEHModel {
	private MyDslToEModel eModel;
	private long startTime;

	public MyDslToCAEHVConventional(SystemDeclaration model) {
		super(model.getName());

		startTime = System.currentTimeMillis();

		eModel = new MyDslToEModel(model);

		PropositionDeclaration[] propArray = (PropositionDeclaration[]) eModel
				.getPropList().toArray(new PropositionDeclaration[0]);
		setPropositions(propArray);

		SemanticConstraintDeclaration[] semconsArray = (SemanticConstraintDeclaration[]) eModel
				.getSconstList().toArray(new SemanticConstraintDeclaration[0]);
		setSemanticConstraints(semconsArray);

		TransitionConstraintDeclaration[] tranconsArray = (TransitionConstraintDeclaration[]) eModel
				.getTconstList()
				.toArray(new TransitionConstraintDeclaration[0]);
		setTransitionConstraints(tranconsArray);

		ScopeDeclaration[] scopeArray = (ScopeDeclaration[]) eModel
				.getScopeList().toArray(new ScopeDeclaration[0]);
		setHandlingScope(scopeArray);

		// ExceptionDeclaration[] excptArray = (ExceptionDeclaration[])
		// eModel.getExList().toArray();

		PropertyDeclaration[] ppArray = (PropertyDeclaration[]) eModel
				.getSpecList().toArray(new PropertyDeclaration[0]);
		setProperties(ppArray);
	}

	private void setProperties(PropertyDeclaration... properties) {
		for (int i = 0; i < properties.length; i++) {
			addPropertie(properties[i].getName(),
					getTemporalContextExpression(properties[i].getExpression()));
		}
	}

	private void setHandlingScope(ScopeDeclaration... scopes) {
		for (int i = 0; i < scopes.length; i++) {
			addHandlingScope(new HandlingScope(new ContextualException(
					scopes[i].getException().getName(),
					getContextExpression(scopes[i].getException()
							.getExpression())),
					getHandlingCases(scopes[i].getHandlers())));
		}
	}

	private Set<HandlingCase> getHandlingCases(
			EList<HandlerDeclaration> handlers) {
		Set<HandlingCase> handlingCases = new HashSet<HandlingCase>();
		for (HandlerDeclaration handler : handlers) {
			HandlingCase hCase = new HandlingCase(
					getContextExpression(handler.getExpression()));
			HandlingBehavior hBehavior = new HandlingBehavior();
			for (ActionDeclaration action : handler.getActions()) {
				hBehavior.addHandlingStep(getContextExpression(action
						.getExpression()));
			}
			hCase.setHandlingBehavior(hBehavior);
			handlingCases.add(hCase);
		}
		return handlingCases;
	}

	private void setPropositions(PropositionDeclaration... propositions) {
		for (int i = 0; i < propositions.length; i++) {
			addContextProposition(new ContextProposition(
					propositions[i].getName()));
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

	private void setSemanticConstraints(
			SemanticConstraintDeclaration... constraints) {
		for (int i = 0; i < constraints.length; i++) {
			addSemanticConstraint(new SemanticConstraint(
					constraints[i].getName(),
					getContextExpression(constraints[i].getExpression())));
		}
	}

	private void setTransitionConstraints(
			TransitionConstraintDeclaration... constraints) {
		for (int i = 0; i < constraints.length; i++) {
			addTransitionConstraint(new TransitionConstraint(
					getContextExpression(constraints[i].getLeft()),
					getContextExpression(constraints[i].getRight())));
		}
	}

	private ContextExpression getContextExpression(LogicExpression expression) { //TODO: verify multiple expression with one parameter
		if (expression instanceof OrOpExpressionImpl) {
			if (((OrOpExpressionImpl) expression).getOp().equals("||")) {
				return ContextExpression.or(
						getContextExpression(((OrOpExpressionImpl) expression)
								.getLeft()),
						getContextExpression(((OrOpExpressionImpl) expression)
								.getRight()));
			} else {
				throw new RuntimeException("Error on OrOpExpression");
			}
		} else if (expression instanceof AndOpExpressionImpl) {
			if (((AndOpExpressionImpl) expression).getOp().equals("&&")) {
				return ContextExpression.and(
						getContextExpression(((AndOpExpressionImpl) expression)
								.getLeft()),
						getContextExpression(((AndOpExpressionImpl) expression)
								.getRight()));
			} else {
				throw new RuntimeException("Error on AndOpExpression");
			}
		} else if (expression instanceof RelationalOpExpressionImpl) {
			if (((RelationalOpExpressionImpl) expression).getOp().equals("->")) {
				return ContextExpression
						.ifThen(getContextExpression(((RelationalOpExpressionImpl) expression)
								.getLeft()),
								getContextExpression(((RelationalOpExpressionImpl) expression)
										.getRight()));
			} else if (((RelationalOpExpressionImpl) expression).getOp()
					.equals("<->")) {
				return ContextExpression
						.iff(getContextExpression(((RelationalOpExpressionImpl) expression)
								.getLeft()),
								getContextExpression(((RelationalOpExpressionImpl) expression)
										.getRight()));
			} else {
				throw new RuntimeException("Error on RelationalOpExpression");
			}
		} else if (expression instanceof UnaryOpExpressionImpl) {
			return ContextExpression
					.not(getContextExpression(((UnaryOpExpressionImpl) expression)
							.getExpr()));
		} else if (expression.getMultiple() != null) {
			ArrayList<ContextExpression> list = populateExpressionList(
					(Operation) expression.getMultiple(),
					new ArrayList<ContextExpression>());
			switch (expression.getOpMul()) {
			case XOR:
				return ContextExpression.xor(list
						.toArray(new ContextExpression[0]));
			default:
				throw new RuntimeException(
						"MultipleExpression parsing exception");
			}
		} else if (expression.getRight() != null
				&& expression.getLeft() != null) {
			switch (expression.getOpBin()) {
			case NAND:
				return ContextExpression.nand(
						getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			case NOR:
				return ContextExpression.nor(
						getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight()));
			default:
				throw new RuntimeException("BinaryExpression parsing exception");
			}
		} else {
			if (expression.getValue() != null) {
				AbstractDeclaration exp = expression.getValue();
				if (exp instanceof PropositionDeclaration) {
					return getContextPropositionByName(exp.getName());
				} else if (exp instanceof SituationDeclaration) {
					return getContextExpression(((SituationDeclaration) exp)
							.getExpression());
				} else {
					throw new RuntimeException(
							"AbstractDeclaration parsing exception");
				}
			} else if (expression.getExpr() != null) {
				return getContextExpression(expression.getExpr());
			} else {
				throw new RuntimeException("LogicExpression parsing exception");
			}
		}
	}

	private ArrayList<ContextExpression> populateExpressionList(
			Operation operation, ArrayList<ContextExpression> list) {
		if (operation.getLeft() != null) {
			MultipleExpression multiple = (MultipleExpression) operation
					.getLeft();
			list.add(getContextExpression(multiple.getAtom()));
		}
		if (operation.getRight() instanceof Operation) {
			return populateExpressionList((Operation) operation.getRight(),
					list);
		} else if (operation.getRight() instanceof MultipleExpression) {
			MultipleExpression multiple = (MultipleExpression) operation
					.getRight();
			list.add(getContextExpression(multiple.getAtom()));
			return list;
		} else {
			throw new RuntimeException(
					"PopulateExpressionList parsing Exception");
		}
	}

	private String getTemporalContextExpression(
			TemporalLogicExpression expression) {
		if (expression instanceof TemporalOrOpExpressionImpl) {
			if (((TemporalOrOpExpressionImpl) expression).getOp().equals("||")) {
				return "(" + getTemporalContextExpression(((TemporalOrOpExpressionImpl) expression)
						.getLeft())
						+ ") | ("
						+ getTemporalContextExpression(((TemporalOrOpExpressionImpl) expression)
								.getRightTemp()) + ")";
			} else {
				throw new RuntimeException("Error on TemporalOrOpExpression");
			}
		} else if (expression instanceof TemporalAndOpExpressionImpl) {
			if (((TemporalAndOpExpressionImpl) expression).getOp().equals("&&")) {
				return "(" + getTemporalContextExpression(((TemporalAndOpExpressionImpl) expression)
						.getLeft()) 
						+ ") & ("
						+ getTemporalContextExpression(((TemporalAndOpExpressionImpl) expression)
								.getRightTemp()) + ")";
			} else {
				throw new RuntimeException("Error on AndOpExpression");
			}
		} else if (expression instanceof TemporalRelationalOpExpressionImpl) {
			if (((TemporalRelationalOpExpressionImpl) expression).getOp()
					.equals("->")) {
				return "( " + getTemporalContextExpression(((TemporalRelationalOpExpressionImpl) expression)
						.getLeft()) 
						+ ") -> ("
						+ getTemporalContextExpression(((TemporalRelationalOpExpressionImpl) expression)
								.getRightTemp()) + ")";
			} else if (((TemporalRelationalOpExpressionImpl) expression)
					.getOp().equals("<->")) {
				return "(" + getTemporalContextExpression(((TemporalRelationalOpExpressionImpl) expression)
						.getLeft())
						+ ") <-> ("
						+ getTemporalContextExpression(((TemporalRelationalOpExpressionImpl) expression)
								.getRightTemp()) + ")";
			} else {
				throw new RuntimeException("Error on RelationalOpExpression");
			}
		} else if (expression instanceof TemporalUnaryOpExpressionImpl) {
			return "!( "
					+ getTemporalContextExpression(((TemporalUnaryOpExpressionImpl) expression)
							.getExpr()) + " )";
		} else if (expression.getMultipleTemp() != null) {
			ArrayList<String> list = populateTemporalExpressionList(
					(TemporalOperation) expression.getMultipleTemp(),
					new ArrayList<String>());
			switch (expression.getOpMulTemp()) { //TODO: multiple temporal
			// case XOR:
			// return ContextExpression.xor(list
			// .toArray(new ContextExpression[0]));
			default:
				throw new RuntimeException(
						"MultipleExpression parsing exception");
			}
		} else if (expression.getRightTemp() != null
				&& expression.getLeftTemp() != null) {
			switch (expression.getOpBinTemp()) { //TODO: binary Temporal
			// case NAND:
			// return ContextExpression.nand(
			// getTemporalContextExpression(expression.getLeftTemp()),
			// getTemporalContextExpression(expression.getRightTemp()));
			// case NOR:
			// return ContextExpression.nor(
			// getTemporalContextExpression(expression.getLeftTemp()),
			// getTemporalContextExpression(expression.getRightTemp()));
			default:
				throw new RuntimeException("BinaryExpression parsing exception");
			}
		} else if (expression.getSubTemp() != null) {
			ArrayList<TemporalLogicExpression> list = populateTemporalSubExpressionList(
					expression.getSubTemp(),
					new ArrayList<TemporalLogicExpression>());
			if (list.size() > 1) {
				return expression.getOpTemp() + "(("
						+ getTemporalContextExpression(list.get(0)) + ") U ("
						+ getTemporalContextExpression(list.get(1)) + "))";
			} else if (list.size() > 0) {
				return expression.getOpTemp() + "("
						+ getTemporalContextExpression(list.get(0)) + ")";
			} else {
				throw new RuntimeException(
						"TemporalSubExpressoin parsing exception");
			}
//		}  else if(expression.getTemporalExpression() != null){
//			return expression.getOpTemp() + "(" + getTemporalContextExpression(expression.getTemporalExpression()) + ")" ;
//		} else if(expression.getLeftExp() != null && expression.getRightExp() != null){
//			return expression.getOpTempUntil() + "(" + getTemporalContextExpression(expression.getLeftExp()) +  " U " 
//					+ getTemporalContextExpression(expression.getRightExp()) + ")" ;
//		  //TODO: Old temporal expression
		} else {
			if (expression.getValueTemp() != null) {
				AbstractDeclaration exp = expression.getValueTemp();
				if (exp instanceof PropositionDeclaration) {
					return exp.getName();
				} 
//				  else if (exp instanceof SituationDeclaration) { return
//				  getTemporalContextExpression(((SituationDeclaration) exp)
//				  .getExpression());  //TODO: situation in temporal Logic
				 } else {
					throw new RuntimeException(
							"AbstractDeclaration parsing exception");
				}
			} else if (expression.getExprTemp() != null) {
				return getTemporalContextExpression(expression.getExprTemp());
			} else {
				throw new RuntimeException("TemporalLogicExpression parsing exception");
			}
		}
	}

	private ArrayList<TemporalLogicExpression> populateTemporalSubExpressionList(
			TemporalLogicExpression expression,
			ArrayList<TemporalLogicExpression> list) {
		if (expression instanceof TemporalSubOperation) {
			TemporalSubOperation operation = (TemporalSubOperation) expression;
			if (operation.getLeft() != null) {
				TemporalLogicSubExpression multiple = (TemporalLogicSubExpression) operation
						.getLeft();
				list.add(multiple.getSingleTemp());
			}
			if (operation.getRightTemp() instanceof TemporalSubOperation) {
				return populateTemporalSubExpressionList(
						(TemporalSubOperation) operation.getRightTemp(), list);
			} else if (operation.getRightTemp() instanceof TemporalLogicExpression) {
				TemporalLogicExpression right = (TemporalLogicExpression) operation
						.getRightTemp();
				list.add(right);
				return list;
			} else {
				throw new RuntimeException(
						"PopulateTemporalSubExpressionList parsing Exception");
			}
		} else if(expression instanceof TemporalLogicSubExpression){
			list.add(((TemporalLogicSubExpression)expression).getSingleTemp());
			return list;
		} else {
			throw new RuntimeException(
					"PopulateTemporalSubExpressionListB parsing Exception");
		}
	}

	private ArrayList<String> populateTemporalExpressionList(
			TemporalOperation operation, ArrayList<String> list) {
		if (operation.getLeft() != null) {
			TemporalMultipleExpression multiple = (TemporalMultipleExpression) operation
					.getLeft();
			list.add(getTemporalContextExpression(multiple.getAtomTemp()));
		}
		if (operation.getRightTemp() instanceof TemporalOperation) {
			return populateTemporalExpressionList(
					(TemporalOperation) operation.getRightTemp(), list);
		} else if (operation.getRightTemp() instanceof TemporalMultipleExpression) {
			TemporalMultipleExpression multiple = (TemporalMultipleExpression) operation
					.getRightTemp();
			list.add(getTemporalContextExpression(multiple.getAtomTemp()));
			return list;
		} else {
			throw new RuntimeException(
					"PopulateTemporalExpressionList parsing Exception");
		}
	}

	public StringBuffer buildModel() {
		try {
			PropertyGenerator generator = new PropertyGenerator();
			Set<Property> properties = generator.generate(getHandlingScopes());

			for (Map.Entry<String, String> property : this.properties
					.entrySet()) {
				Property prop = new Property(PropertyType.USER_DEFINED); //TODO: Report user properties
				prop.setFormula(property.getValue());
				properties.add(prop);
			}

			setSpecs(properties);
			checkModel(this);

			CAEH2KripkeModel conversor = new CAEH2KripkeModel();
			KripkeStructureModel kripkeModel = conversor.toKripkeModel(this);

			CTLTransitionSystemMCiE checker = new CTLTransitionSystemMCiE();
			properties = checker.check(kripkeModel, properties);

			KripkeModelTXTReport report = new KripkeModelTXTReport();

			return report.generateReport(
					System.currentTimeMillis() - startTime, kripkeModel,
					properties);
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
		return null;
	}

	public StringBuffer buildSCXML() {
		try {
			PropertyGenerator generator = new PropertyGenerator();
			Set<Property> properties = generator.generate(getHandlingScopes());
			setSpecs(properties);

			// checkModel(this);

			CAEH2KripkeModel conversor = new CAEH2KripkeModel();
			KripkeStructureModel kripkeModel = conversor.toKripkeModel(this);

			CTLTransitionSystemMCiE checker = new CTLTransitionSystemMCiE();
			properties = checker.check(kripkeModel, properties);

			KripkeModelSCXML scxml = new KripkeModelSCXML();

			return scxml.generateFile(System.currentTimeMillis() - startTime,
					kripkeModel, properties);
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Set<Property> specs;

	public Set<Property> getSpecs() {
		return specs;
	}

	public void setSpecs(Set<Property> specs) {
		this.specs = specs;
	}

	public void checkModel(MyDslToCAEHV jcaehvModel) {
		System.out.println("Propositions:");
		for (ContextProposition prop : propositions) {
			System.out.print(prop.getName() + " ");
		}

		System.out.println("\nConstraints:");
		for (SemanticConstraint semCon : semanticConstraints) {
			System.out.println(semCon.getName() + ": "
					+ semCon.getConstraint().toString().replace(" ", ""));
		}
		for (TransitionConstraint tranCon : transitionConstraints) {
			System.out.println("Transition constraint: pre "
					+ tranCon.getSelection().toString().replace(" ", "")
					+ " pos "
					+ tranCon.getConstraint().toString().replace(" ", ""));
		}

		System.out.println("\nScopes: ");
		for (HandlingScope scope : handlingScopes) {
			System.out.println("Exception: "
					+ scope.getContextualException().getName()
					+ " "
					+ scope.getContextualException().getExceptionalContext()
							.toString().replace(" ", ""));
			for (HandlingCase hCase : scope.getHandlingCases()) {
				System.out.println("When: "
						+ hCase.getCatchConstraint().toString()
								.replace(" ", ""));
				for (ContextExpression step : hCase.getHandlingBehavior()
						.getHandlingSteps()) {
					System.out.println("Step: "
							+ step.toString().replace(" ", ""));
				}
			}
		}

		for (Map.Entry<String, String> property : properties.entrySet()) {
			System.out.println("Properties: " + property.getKey() + ": "
					+ property.getValue());
		}

		for (Property property : specs) {
			System.out.println("Specs: " + property.getExceptionName() + ": "
					+ property.getFormula());
		}
	}

	public MyDslToEModel geteModel() {
		return eModel;
	}

	public void seteModel(MyDslToEModel eModel) {
		this.eModel = eModel;
	}
}*/