package br.ufc.great.catchml.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import br.ufc.great.catchml.catchML.ActionDeclaration;
import br.ufc.great.catchml.catchML.CatchMLPackage;
import br.ufc.great.catchml.catchML.ExceptionDeclaration;
import br.ufc.great.catchml.catchML.HandlerDeclaration;
import br.ufc.great.catchml.catchML.PropertyDeclaration;
import br.ufc.great.catchml.catchML.PropositionDeclaration;
import br.ufc.great.catchml.catchML.ScopeDeclaration;
import br.ufc.great.catchml.catchML.SemanticConstraintDeclaration;
import br.ufc.great.catchml.catchML.SituationDeclaration;
import br.ufc.great.catchml.catchML.SystemDeclaration;
import br.ufc.great.catchml.catchML.TransitionConstraintDeclaration;
import br.ufc.great.catchml.converter.CatchMLToCAEHV;
import br.ufc.great.catchml.converter.CatchMLToEModel;
import br.ufc.great.jcaehv.model.property.Property;

public class CatchMLJavaValidator extends AbstractCatchMLJavaValidator {
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(br.ufc.great.catchml.catchML.CatchMLPackage.eINSTANCE);
		return result;
	}

	@Check
	public void checkPropositionNameIsUnique(PropositionDeclaration propDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) propDecl.eContainer().eContainer());
		List<PropositionDeclaration> propList = eModel.getPropList();
		for (int i = 0; i < propList.size(); i++) {
			String otherPropName = propList.get(i).getName();
			if (otherPropName.equals(propDecl.getName())
					&& !propList.get(i).equals(propDecl)) {
				error("Proposition names have to be unique",
						CatchMLPackage.eINSTANCE.getAbstractDeclaration_Name());
				return;
			}
		}
	}

	@Check
	public void checkExpressionNameIsUnique(SituationDeclaration exprDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) exprDecl.eContainer());
		List<SituationDeclaration> exprList = eModel.getSitList();
		for (int i = 0; i < exprList.size(); i++) {
			String otherExprName = exprList.get(i).getName();
			if (otherExprName.equals(exprDecl.getName())
					&& !exprList.get(i).equals(exprDecl)) {
				error("Expression names have to be unique",
						CatchMLPackage.eINSTANCE.getAbstractDeclaration_Name());
				return;
			}
		}
	}

	@Check
	public void checkSemanticConstraintNameIsUnique(
			SemanticConstraintDeclaration sconstDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) sconstDecl.eContainer());
		List<SemanticConstraintDeclaration> sconstList = eModel.getSconstList();
		for (int i = 0; i < sconstList.size(); i++) {
			String otherExpName = sconstList.get(i).getName();
			if (otherExpName.equals(sconstDecl.getName())
					&& !sconstList.get(i).equals(sconstDecl)) {
				error("Semantic constraint names have to be unique",
						CatchMLPackage.eINSTANCE.getSemanticConstraintDeclaration_Name());
				return;
			}
		}
	}

	@Check
	public void checkTransitionConstraintNameIsUnique(
			TransitionConstraintDeclaration tconstDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) tconstDecl.eContainer());
		List<TransitionConstraintDeclaration> tconstList = eModel
				.getTconstList();
		for (int i = 0; i < tconstList.size(); i++) {
			String otherExpName = tconstList.get(i).getName();
			if (otherExpName.equals(tconstDecl.getName())
					&& !tconstList.get(i).equals(tconstDecl)) {
				error("Transition constraint names have to be unique",
						CatchMLPackage.eINSTANCE.getTransitionConstraintDeclaration_Name());
				return;
			}
		}
	}
	
	@Check
	public void checkExceptionNameIsUnique(ExceptionDeclaration exceptionDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) exceptionDecl.eContainer());
		List<ExceptionDeclaration> expList = eModel.getExList();
		for (int i = 0; i < expList.size(); i++) {
			String otherExpName = expList.get(i).getName();
			if (otherExpName.equals(exceptionDecl.getName())
					&& !expList.get(i).equals(exceptionDecl)) {
				error("Exception names have to be unique",
						CatchMLPackage.eINSTANCE.getExceptionDeclaration_Name());
				return;
			}
		}
	}
	
	@Check
	public void checkScopeNameIsUnique(
			ScopeDeclaration scopeDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) scopeDecl.eContainer());
		List<ScopeDeclaration> scopeList = eModel
				.getScopeList();
		for (int i = 0; i < scopeList.size(); i++) {
			String otherExpName = scopeList.get(i).getName();
			if (otherExpName.equals(scopeDecl.getName())
					&& !scopeList.get(i).equals(scopeDecl)) {
				error("Scope names have to be unique",
						CatchMLPackage.eINSTANCE.getScopeDeclaration_Name());
				return;
			}
		}
	}
	
	@Check
	public void checkPropertyNameIsUnique(
			PropertyDeclaration specDecl) {
		CatchMLToEModel eModel = new CatchMLToEModel(
				(SystemDeclaration) specDecl.eContainer());
		List<PropertyDeclaration> specList = eModel
				.getSpecList();
		for (int i = 0; i < specList.size(); i++) {
			String otherExpName = specList.get(i).getName();
			if (otherExpName.equals(specDecl.getName())
					&& !specList.get(i).equals(specDecl)) {
				error("Spec names have to be unique",
						CatchMLPackage.eINSTANCE.getPropertyDeclaration_Name());
				return;
			}
		}
	}	

	@Check(CheckType.EXPENSIVE)
	public void checkModelWithJCAEHV(SystemDeclaration model) {
		CatchMLToCAEHV caehModel = new CatchMLToCAEHV(model);
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
						case DETECTION_LIVENESS: //Progresso de Detecção
							error("A Dead Exception fault was detected. This means that the Detection Liveness property was violated. This property "
									+ "is only valid if there is at least one state in which each contextual exception is detected.",
									exceptionDecl, CatchMLPackage.eINSTANCE
											.getExceptionDeclaration_Name(), -1);
							break;
						case CATCH_LIVENESS: //Progresso de Captura
							for (ScopeDeclaration scope : caehModel.geteModel()
									.getScopeList()) {
								if (scope.getException().getName()
										.equals(exceptionDecl.getName())) {
									error("A Null Handling fault was detected. This means that the Catch Liveness property was violated. This property "
											+ "is only valid if for each contextual exception raised, there is at least one handling case that could capture it.",
											scope,
											CatchMLPackage.eINSTANCE
													.getScopeDeclaration_Name(),
											-1);
								}
							}
							;
							break;
						case HANDLER_LIVENESS: //Progresso de Tratador
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
												CatchMLPackage.eINSTANCE
														.getHandlerDeclaration_Expression(),
												-1);
									}
								}
							}
							break;
						case HANDLING_STABILITY://Estabilidade de tratamento
							error("A Cyclic Handling fault was detected. This means that the Handling Stability property was violated. This property "
									+ "is only valid if for each contextual exception handled, the resumption state of the control flow must not be a state in which "
									+ "the same exception is raised.",
									exceptionDecl,
									CatchMLPackage.eINSTANCE
											.getExceptionDeclaration_Name(), -1);
							break;
						case REACHABILITY: //Alcançabilidade
							for (ScopeDeclaration scope : caehModel.geteModel()
									.getScopeList()) {
								if (scope.getException().getName()
										.equals(exceptionDecl.getName())) {
									for (HandlerDeclaration handler : scope
											.getHandlers()) {
										for (ActionDeclaration action : handler.getActions()) {
											error("A Resume Impossible fault was detected. This means that the Reachability property was violated. This property "
													+ "is only valid if for each contextual exception raised and catched, it is always possible execute all handling actions and "
													+ "regain the normal control flow.",
													action,
													CatchMLPackage.eINSTANCE
															.getActionDeclaration_Expression(), -1);
										}
										
									}
								}
							}
							
							break;
						default:
							break;
						}
						break;
					}
				}
				if (!found) { // TODO: Show user defined faults
					switch (property.getType()) {
					case USER_DEFINED:
						for (PropertyDeclaration prop : propList) {
							if (prop.getName().equals(property.getName())) {
								warning("The user defined " + prop.getName()
										+ " property was rejected.", prop,
										CatchMLPackage.eINSTANCE
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
					CatchMLPackage.eINSTANCE.getSystemDeclaration_Name());
		}
		
		
	}
}