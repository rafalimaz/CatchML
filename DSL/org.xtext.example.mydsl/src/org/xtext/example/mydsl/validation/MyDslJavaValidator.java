package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.xtext.example.mydsl.converter.MyDslToCAEHV;
import org.xtext.example.mydsl.converter.MyDslToEModel;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.ScopeDeclaration;
import org.xtext.example.mydsl.myDsl.SituationDeclaration;
import org.xtext.example.mydsl.myDsl.SystemDeclaration;

import br.ufc.great.jcaehv.model.property.Property;

public class MyDslJavaValidator extends AbstractMyDslJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.mydsl.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}

	@Check
	public void checkPropositionNameIsUnique(PropositionDeclaration propDecl) {
		MyDslToEModel eModel = new MyDslToEModel((SystemDeclaration) propDecl
				.eContainer().eContainer());
		List<PropositionDeclaration> propList = eModel.getPropList();
		for (int i = 0; i < propList.size(); i++) {
			String otherPropName = propList.get(i).getName();
			if (otherPropName.equals(propDecl.getName())
					&& !propList.get(i).equals(propDecl)) {
				error("Proposition names have to be unique",
						MyDslPackage.eINSTANCE.getAbstractDeclaration_Name(),
						i, MyDslIssueCodes.TEST_MESSAGE);
				return;
			}
		}
	}

	@Check
	public void checkExpressionNameIsUnique(SituationDeclaration exprDecl) {
		MyDslToEModel eModel = new MyDslToEModel((SystemDeclaration) exprDecl
				.eContainer().eContainer());
		List<SituationDeclaration> exprList = eModel.getSitList();
		for (int i = 0; i < exprList.size(); i++) {
			String otherExprName = exprList.get(i).getName();
			if (otherExprName.equals(exprDecl.getName())
					&& !exprList.get(i).equals(exprDecl)) {
				error("Expression names have to be unique",
						MyDslPackage.eINSTANCE.getAbstractDeclaration_Name(),
						i, MyDslIssueCodes.TEST_MESSAGE);
				return;
			}
		}
	}

	@Check
	public void checkExceptionNameIsUnique(ExceptionDeclaration exceptionDecl) {
		MyDslToEModel eModel = new MyDslToEModel(
				(SystemDeclaration) exceptionDecl.eContainer().eContainer());
		List<ExceptionDeclaration> expList = eModel.getExList();
		for (int i = 0; i < expList.size(); i++) {
			String otherExpName = expList.get(i).getName();
			if (otherExpName.equals(exceptionDecl.getName())
					&& !expList.get(i).equals(exceptionDecl)) {
				error("Exception names have to be unique",
						MyDslPackage.eINSTANCE.getExceptionDeclaration_Name(),
						i, MyDslIssueCodes.TEST_MESSAGE);
				return;
			}
		}
	}

	@Check(CheckType.EXPENSIVE)
	public void checkModelWithJCAEHV(SystemDeclaration model) {
		MyDslToCAEHV caehModel = new MyDslToCAEHV(model);
		caehModel.buildModel();

		List<ExceptionDeclaration> expList = caehModel.geteModel().getExList();
		List<PropertyDeclaration> propList = caehModel.geteModel()
				.getSpecList();
		Boolean isValid = true;
		for (Property property : caehModel.getSpecs()) {
			if (!property.isAccepted()) {
				isValid = false;
				boolean found = false;
				for (ExceptionDeclaration exceptionDecl : expList) {
					if (property.getExceptionName() != null
							&& property.getExceptionName().equals(
									exceptionDecl.getName())) {
						found = true;
						switch (property.getType()) {
						case DETECTION_LIVENESS:
							error("A Dead Exception fault was detected. This means that the Detection Liveness property was violated. This property "
									+ "is only valid if there is at least one state in which each contextual exception is detected.",
									exceptionDecl, MyDslPackage.eINSTANCE
											.getExceptionDeclaration_Name(), -1);
							break;
						case CATCH_LIVENESS:
							for (ScopeDeclaration scope : caehModel.geteModel()
									.getScopeList()) {
								if (scope.getException().getName()
										.equals(exceptionDecl.getName())) {
									error("A Null Handling fault was detected. This means that the Catch Liveness property was violated. This property "
											+ "is only valid if for each contextual exception raised, there is at least one handling case that could capture it.",
											scope,
											MyDslPackage.eINSTANCE
													.getScopeDeclaration_Name(),
											-1);
								}
							}
							;
							break;
						case HANDLER_LIVENESS:
							for (ScopeDeclaration scope : caehModel.geteModel()
									.getScopeList()) {
								if (scope.getException().getName()
										.equals(exceptionDecl.getName())) {
									for (HandlerDeclaration handler : scope
											.getHandlers()) {
										error("A Dead Handler fault was detected. This means that the Handler Liveness property was violated. This property "
												+ "is only valid if for each state in which a contextual exception is raised, there is at least one of these states "
												+ "in which each handling case is selected to handle that exception.",
												handler,
												MyDslPackage.eINSTANCE
														.getHandlerDeclaration_Expression(),
												-1);
									}
								}
							}
							break;
						case HANDLING_STABILITY:
							error("A Cyclic Handling fault was detected. This means that the Handling Stability property was violated. This property "
									+ "is only valid if for each contextual exception handled, the resumption state of the control flow must not be a state in which "
									+ "the same exception is raised.",
									exceptionDecl,
									MyDslPackage.eINSTANCE
											.getExceptionDeclaration_Name(), -1);
							break;
						case REACHABILITY:
							error("A Resume Impossible fault was detected. This means that the Reachability property was violated. This property "
									+ "is only valid if for each contextual exception raised and catched, it is always possible execute all handling actions and "
									+ "regain the normal control flow.",
									exceptionDecl,
									MyDslPackage.eINSTANCE
											.getExceptionDeclaration_Name(), -1);
							break;
						default:
							break;
						}
						break;
					}
				}
				if (!found) { // TODO: show user defined faults
					switch (property.getType()) {
					case USER_DEFINED:
						for (PropertyDeclaration prop : propList) {
							if (prop.getName().equals(property.getName())) {
								warning("The user defined "
										+ prop.getName()
										+ " property was rejected.", prop,
										MyDslPackage.eINSTANCE
												.getPropertyDeclaration_Name(),
										-1);
							}
						}
						break;
					default:
						break;
					}
				}
			}
		}

		if (isValid) {
			info("All properties were verified. No faults were found.",
					MyDslPackage.eINSTANCE.getSystemDeclaration_Name());
		}
	}
}