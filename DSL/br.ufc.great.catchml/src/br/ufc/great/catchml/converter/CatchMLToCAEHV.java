package br.ufc.great.catchml.converter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import br.ufc.great.catchml.catchML.AbstractDeclaration;
import br.ufc.great.catchml.catchML.ActionDeclaration;
import br.ufc.great.catchml.catchML.HandlerDeclaration;
import br.ufc.great.catchml.catchML.LogicExpression;
import br.ufc.great.catchml.catchML.PropertyDeclaration;
import br.ufc.great.catchml.catchML.PropositionDeclaration;
import br.ufc.great.catchml.catchML.ScopeDeclaration;
import br.ufc.great.catchml.catchML.SemanticConstraintDeclaration;
import br.ufc.great.catchml.catchML.SituationDeclaration;
import br.ufc.great.catchml.catchML.SystemDeclaration;
import br.ufc.great.catchml.catchML.TransitionConstraintDeclaration;
import br.ufc.great.catchml.catchML.impl.AndOpExpressionImpl;
import br.ufc.great.catchml.catchML.impl.OrOpExpressionImpl;
import br.ufc.great.catchml.catchML.impl.RelationalOpExpressionImpl;
import br.ufc.great.catchml.catchML.impl.UnaryOpExpressionImpl;

import br.ufc.great.jcaehv.abstraction.SemanticConstraint;
import br.ufc.great.jcaehv.abstraction.TransitionConstraint;
import br.ufc.great.jcaehv.checker.JCAEHVReport;
import br.ufc.great.jcaehv.checker.KripkeModel;
import br.ufc.great.jcaehv.checker.KripkeModelToSCXML;
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
import br.ufc.great.jcaehv.model.property.PropertyType;

public class CatchMLToCAEHV extends CAEHModel {
	private CatchMLToEModel eModel;
	private long startTime;
	private Set<Property> specs;
	
	public CatchMLToCAEHV(SystemDeclaration model) {
		super(model.getName());

		startTime = System.currentTimeMillis();

		eModel = new CatchMLToEModel(model);

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
	
	public Set<Property> getSpecs() {
		return specs;
	}

	public void setSpecs(Set<Property> specs) {
		this.specs = specs;
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
		addContextProposition(new ContextProposition(propositions[i].getName()));
	}
}

	public ContextProposition getContextPropositionByName(String name) {
		for (ContextProposition proposition : getContextPropositions()) {
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

	private ContextExpression getContextExpression(LogicExpression expression) {
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
		} else if (expression.getArgs().size() > 0) {
			ArrayList<ContextExpression> list = new ArrayList<ContextExpression>();
			for (LogicExpression exp : expression.getArgs()) {
				list.add(getContextExpression(exp));
			}
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

	private String getTemporalContextExpression(LogicExpression expression) {
		if (expression instanceof OrOpExpressionImpl) {
			if (((OrOpExpressionImpl) expression).getOp().equals("||")) {
				return "(" + getTemporalContextExpression(((OrOpExpressionImpl) expression)
								.getLeft()) + ") | (" +
								getTemporalContextExpression(((OrOpExpressionImpl) expression)
										.getRight()) + ")";
			} else {
				throw new RuntimeException("Error on TemporalOrOpExpression");
			}
		} else if (expression instanceof AndOpExpressionImpl) {
			if (((AndOpExpressionImpl) expression).getOp().equals("&&")) {
				return "("
						+ getTemporalContextExpression(((AndOpExpressionImpl) expression)
								.getLeft())
						+ ") & ("
						+ getTemporalContextExpression(((AndOpExpressionImpl) expression)
								.getRight()) + ")";
			} else {
				throw new RuntimeException("Error on AndOpExpression");
			}
		} else if (expression instanceof RelationalOpExpressionImpl) {
			if (((RelationalOpExpressionImpl) expression).getOp().equals("->")) {
				return "( "
						+ getTemporalContextExpression(((RelationalOpExpressionImpl) expression)
								.getLeft())
						+ ") -> ("
						+ getTemporalContextExpression(((RelationalOpExpressionImpl) expression)
								.getRight()) + ")";
			} else if (((RelationalOpExpressionImpl) expression).getOp()
					.equals("<->")) {
				return "("
						+ getTemporalContextExpression(((RelationalOpExpressionImpl) expression)
								.getLeft())
						+ ") <-> ("
						+ getTemporalContextExpression(((RelationalOpExpressionImpl) expression)
								.getRight()) + ")";
			} else {
				throw new RuntimeException("Error on RelationalOpExpression");
			}
		} else if (expression instanceof UnaryOpExpressionImpl) {
			return "!( "
					+ getTemporalContextExpression(((UnaryOpExpressionImpl) expression)
							.getExpr()) + " )";
		} else if (expression.getArgs().size() > 0) {
			ArrayList<ContextExpression> list = new ArrayList<ContextExpression>();
			for (LogicExpression exp : expression.getArgs()) {
				list.add(getContextExpression(exp));
			}
			switch (expression.getOpMul()) {
			case XOR:
				return ContextExpression.xor(
						list.toArray(new ContextExpression[0])).toString();
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
						getContextExpression(expression.getRight())).toString();
			case NOR:
				return ContextExpression.nor(
						getContextExpression(expression.getLeft()),
						getContextExpression(expression.getRight())).toString();
			default:
				throw new RuntimeException("BinaryExpression parsing exception");
			}
		} else if (expression.getTemporal() != null) {
			return expression.getOpTemp() + "("
					+ getTemporalContextExpression(expression.getTemporal())
					+ ")";
		} else if (expression.getLeftExp() != null
				&& expression.getRightExp() != null) {
			return "(" + getTemporalContextExpression(expression.getLeftExp())
					+ " " + expression.getOpTempUntil() + "U "
					+ getTemporalContextExpression(expression.getRightExp())
					+ ")";
		} else {
			if (expression.getValue() != null) {
				AbstractDeclaration exp = expression.getValue();
				if (exp instanceof PropositionDeclaration) {
					return exp.getName();
				} else if (exp instanceof SituationDeclaration) {
					return getTemporalContextExpression(((SituationDeclaration) exp)
							.getExpression());
				} else {
					throw new RuntimeException(
							"AbstractDeclaration parsing exception");
				}
			} else if (expression.getExpr() != null) {
				return getTemporalContextExpression(expression.getExpr());
			} else {
				throw new RuntimeException(
						"TemporalLogicExpression parsing exception");
			}
		}
	}

	public StringBuffer buildModel() {
		try {
			PropertyGenerator generator = new PropertyGenerator();
			Set<Property> properties = generator.generate(getHandlingScopes());

			for (Map.Entry<String, String> property : this.getProperties()
					.entrySet()) {
				Property prop = new Property(PropertyType.USER_DEFINED);
				prop.setFormula(property.getValue());
				prop.setName(property.getKey());
				properties.add(prop);
			}

			setSpecs(properties);
			//checkModel(this);

			CAEHToKripkeModel conversor = new CAEHToKripkeModel();
			KripkeModel kripkeModel = conversor.toKripkeModel(this);

			CTLMCiE checker = new CTLMCiE();
			properties = checker.check(kripkeModel, properties);

			JCAEHVReport report = new JCAEHVReport();

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

			CAEHToKripkeModel conversor = new CAEHToKripkeModel();
			KripkeModel kripkeModel = conversor.toKripkeModel(this);

			CTLMCiE checker = new CTLMCiE();
			properties = checker.check(kripkeModel, properties);

			KripkeModelToSCXML scxml = new KripkeModelToSCXML();

			return scxml.generateFile(System.currentTimeMillis() - startTime,
					kripkeModel, properties);
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void checkModel(CatchMLToCAEHV jcaehvModel) {
		System.out.println("Propositions:");
		for (ContextProposition prop : getContextPropositions()) {
			System.out.print(prop.getName() + " ");
		}

		System.out.println("\nSituations:");
		for (SituationDeclaration situation : eModel.getSitList()) {
			ContextExpression exp = getContextExpression(situation
					.getExpression());
			System.out.println(situation.getName() + ": "
					+ exp.toString().replace(" ", ""));
		}

		System.out.println("\nConstraints:");
		for (SemanticConstraint semCon : getSemanticConstraints()) {
			System.out.println(semCon.getName() + ": "
					+ semCon.getConstraint().toString().replace(" ", ""));
		}
		for (TransitionConstraint tranCon : getTransitionConstraints()) {
			System.out.println("Transition constraint: pre "
					+ tranCon.getSelection().toString().replace(" ", "")
					+ " pos "
					+ tranCon.getConstraint().toString().replace(" ", ""));
		}

		System.out.println("\nScopes: ");
		for (HandlingScope scope : getHandlingScopes()) {
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

		for (Map.Entry<String, String> property : getProperties().entrySet()) {
			System.out.println("Properties: " + property.getKey() + ": "
					+ property.getValue());
		}

		for (Property property : specs) {
			System.out.println("Specs: " + property.getExceptionName() + ": "
					+ property.getFormula());
		}
	}

	public CatchMLToEModel geteModel() {
		return eModel;
	}

	public void seteModel(CatchMLToEModel eModel) {
		this.eModel = eModel;
	}
}