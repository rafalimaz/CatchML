package br.ufc.great.jcaehv.model.property;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import br.ufc.great.jcaehv.context.ContextExpression;
import br.ufc.great.jcaehv.model.ContextualException;
import br.ufc.great.jcaehv.model.HandlingBehavior;
import br.ufc.great.jcaehv.model.HandlingCase;
import br.ufc.great.jcaehv.model.HandlingScope;

public class PropertyGenerator {

	public Property detectionLiveness(HandlingScope scope) {
		Property property = new Property(PropertyType.DETECTION_LIVENESS);
		ContextualException exception = scope.getContextualException();
		property.setExceptionName(exception.getName());
		StringBuffer buffer = new StringBuffer();
		buffer.append("EX(");
		buffer.append(exception.getExceptionalContext());
		buffer.append(")");
		property.setFormula(buffer.toString());
		return property;
	}

	public Property catchLiveness(HandlingScope scope) {
		Property property = new Property(PropertyType.CATCH_LIVENESS);
		ContextualException exception = scope.getContextualException();
		property.setExceptionName(exception.getName());
		StringBuffer buffer = new StringBuffer();
		buffer.append("EX(");
		buffer.append(exception.getExceptionalContext());
		buffer.append(" & (");
		Iterator<HandlingCase> it = scope.getHandlingCases().iterator();
		while (it.hasNext()) {
			HandlingCase hcase = it.next();
			buffer.append(hcase.getCatchConstraint());
			if (it.hasNext()) {
				buffer.append(" | ");
			}
		}
		buffer.append("))");
		property.setFormula(buffer.toString());
		return property;
	}

	public Property handlerLiveness(HandlingScope scope) {
		Property property = new Property(PropertyType.HANDLER_LIVENESS);
		ContextualException exception = scope.getContextualException();
		property.setExceptionName(exception.getName());
		StringBuffer buffer = new StringBuffer();
		Iterator<HandlingCase> it = scope.getHandlingCases().iterator();
		while (it.hasNext()) {
			StringBuffer innerBuffer = new StringBuffer();
			innerBuffer.append("EX(");
			innerBuffer.append(exception.getExceptionalContext());
			innerBuffer.append(" & ");
			HandlingCase hcase = it.next();
			innerBuffer.append(hcase.getCatchConstraint());
			innerBuffer.append(")");
			if (it.hasNext()) {
				innerBuffer.append(" & ");
			}
			buffer.append(innerBuffer.toString());
		}
		property.setFormula(buffer.toString());
		return property;
	}

	public Property handlingStability(HandlingScope scope) {
		Property property = new Property(PropertyType.HANDLING_STABILITY);
		ContextualException exception = scope.getContextualException();
		property.setExceptionName(exception.getName());
		StringBuffer buffer = new StringBuffer();
		Iterator<HandlingCase> caseIt = scope.getHandlingCases().iterator();
		while (caseIt.hasNext()) {
			StringBuffer caseBuffer = new StringBuffer();
			caseBuffer.append("AX(!((");
			caseBuffer.append(exception.getExceptionalContext());
			caseBuffer.append(" & ");
			HandlingCase hcase = caseIt.next();
			caseBuffer.append(hcase.getCatchConstraint());
			caseBuffer.append(") & ");
			HandlingBehavior behavior = hcase.getHandlingBehavior();
			Iterator<ContextExpression> stepIt = behavior.getHandlingSteps().iterator();

			StringBuffer lastStepBuffer = new StringBuffer();
			while (stepIt.hasNext()) {
				ContextExpression expression = stepIt.next();
				if (!stepIt.hasNext()) {
					lastStepBuffer.append("EF(");
					lastStepBuffer.append(expression);
					lastStepBuffer.append(" &");
					lastStepBuffer.append(exception.getExceptionalContext());
					lastStepBuffer.append(")");
					caseBuffer.append(lastStepBuffer.toString());
				}
			}
			caseBuffer.append("))");
			if (caseIt.hasNext()) {
				caseBuffer.append(" & ");
			}
			buffer.append(caseBuffer.toString());
		}
		property.setFormula(buffer.toString());
		return property;
	}

	public Property reachability(HandlingScope scope) {
		Property property = new Property(PropertyType.REACHABILITY);
		ContextualException exception = scope.getContextualException();
		property.setExceptionName(exception.getName());
		StringBuffer buffer = new StringBuffer();
		Iterator<HandlingCase> caseIt = scope.getHandlingCases().iterator();
		while (caseIt.hasNext()) {
			StringBuffer caseBuffer = new StringBuffer();
			caseBuffer.append("AX((");
			caseBuffer.append(exception.getExceptionalContext());
			caseBuffer.append(" & ");
			HandlingCase hcase = caseIt.next();
			caseBuffer.append(hcase.getCatchConstraint());
			caseBuffer.append(") -> ");
			HandlingBehavior behavior = hcase.getHandlingBehavior();

			Iterator<ContextExpression> stepIt = behavior.getHandlingSteps().iterator();
			StringBuffer stepsBuffer = new StringBuffer();
			while (stepIt.hasNext()) {
				ContextExpression expression = stepIt.next();
				stepsBuffer.append("EX(");
				stepsBuffer.append(expression);
				if (stepIt.hasNext()) {
					stepsBuffer.append(" & ");
				}
			}

			stepIt = behavior.getHandlingSteps().iterator();
			while (stepIt.hasNext()) {
				stepIt.next();
				stepsBuffer.append(")");
			}
			caseBuffer.append(stepsBuffer.toString());
			caseBuffer.append(")");
			if (caseIt.hasNext()) {
				caseBuffer.append(" & ");
			}
			buffer.append(caseBuffer.toString());
		}
		property.setFormula(buffer.toString());
		return property;
	}

	public Set<Property> generate(Set<HandlingScope> scopes) {
		Set<Property> properties = new LinkedHashSet<Property>();
		for (HandlingScope scope : scopes) {
			properties.addAll(generate(scope));
		}
		return properties;
	}

	public Set<Property> generate(HandlingScope scope) {
		Set<Property> properties = new LinkedHashSet<Property>();
		Property property = detectionLiveness(scope);
		properties.add(property);
		property = catchLiveness(scope);
		properties.add(property);
		property = handlerLiveness(scope);
		properties.add(property);
		property = handlingStability(scope);
		properties.add(property);
		property = reachability(scope);
		properties.add(property);
		return properties;
	}

	public void print(Set<Property> properties) {
		for (Property property : properties) {
			System.out.println(property.toString());
		}
	}
}
