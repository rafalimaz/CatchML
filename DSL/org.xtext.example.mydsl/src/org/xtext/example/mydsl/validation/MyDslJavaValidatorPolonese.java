package org.xtext.example.mydsl.validation;

/*
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
		MyDslToEModel eModel = new MyDslToEModel((SystemDeclaration)propDecl.eContainer().eContainer());
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
		MyDslToEModel eModel = new MyDslToEModel((SystemDeclaration)exprDecl.eContainer().eContainer());
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
		MyDslToEModel eModel = new MyDslToEModel((SystemDeclaration)exceptionDecl.eContainer().eContainer());
		List<ExceptionDeclaration> expList = eModel.getExList();
		for (int i = 0; i < expList.size(); i++) {
			String otherExpName = expList.get(i).getName();
			if (otherExpName.equals(exceptionDecl.getName())
					&& !expList.get(i).equals(exceptionDecl)) {
				error("Exception names have to be unique",
						MyDslPackage.eINSTANCE
								.getExceptionDeclaration_Name(), i,
						MyDslIssueCodes.TEST_MESSAGE);
				return;
			}
		}
	}
	
	@Check(CheckType.EXPENSIVE)
	public void checkModelWithJCAEHV(SystemDeclaration model) {
		MyDslToCAEHV caehModel = new MyDslToCAEHV(model);
		caehModel.buildModel();
		
		List<ExceptionDeclaration> expList = caehModel.geteModel().getExList();
		Boolean isValid = true; 
		for (Property property : caehModel.getProperties()) {
			if (!property.isAccepted()) {
				isValid = false;
				for (ExceptionDeclaration exceptionDecl : expList) {
					if (property.getExceptionName().equals(exceptionDecl.getName())) {
						switch (property.getType()) {
						case DETECTION_LIVENESS:
							error("Dead Exception fault detected",exceptionDecl, 
									MyDslPackage.eINSTANCE.getExceptionDeclaration_Name(),-1);
							break;
						case CATCH_LIVENESS:
							for (ScopeDeclaration scope : caehModel.geteModel().getScopeList()) {
								if(scope.getException().getName().equals(exceptionDecl.getName())){
									error("Null Handling fault detected",scope, 
											MyDslPackage.eINSTANCE.getScopeDeclaration_Name(),-1);
								}
							};
							break;
						case HANDLER_LIVENESS:
							for (ScopeDeclaration scope : caehModel.geteModel().getScopeList()) {
								if(scope.getException().getName().equals(exceptionDecl.getName())){
									for (HandlerDeclaration handler : scope.getHandlers()) {
										error("Dead Handler fault detected",handler, 
												MyDslPackage.eINSTANCE.getHandlerDeclaration_Expression(),-1);
									}
								}
							}
							break;
						case HANDLING_STABILITY:
							error("Cyclic Handling fault detected",exceptionDecl, 
									MyDslPackage.eINSTANCE.getExceptionDeclaration_Name(),-1);
							break;
						case REACHABILITY:
							error("Resume Impossible fault detected",exceptionDecl, 
									MyDslPackage.eINSTANCE.getExceptionDeclaration_Name(),-1);
							break;
						default:
							break;
						}	
						break;
					}
				}
			}
		}
		
		if(isValid){
			info("All properties were verified. No errors were found.", MyDslPackage.eINSTANCE.getSystemDeclaration_Name());
		}
	}
}*/
