package org.xtext.example.mydsl.validation;
/*
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.xtext.example.mydsl.converter.MyDslToCAEH;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExpressionDeclaration;
import org.xtext.example.mydsl.myDsl.Handler;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.Scope;
import org.xtext.example.mydsl.myDsl.impl.ExceptionsListImpl;
import org.xtext.example.mydsl.myDsl.impl.ExpressionsListImpl;
import org.xtext.example.mydsl.myDsl.impl.ModelImpl;
import org.xtext.example.mydsl.myDsl.impl.PropositionsListImpl;

import br.ufc.great.jcaehv.model.property.Property;

public class JCAEHV1MyDslJavaValidator extends AbstractMyDslJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.mydsl.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}

	@Check
	public void checkPropositionNameIsUnique(PropositionDeclaration propDecl) {
		EObject obj = propDecl.eContainer();
		if (obj instanceof PropositionsListImpl) {
			PropositionsListImpl propListImpl = (PropositionsListImpl) obj;
			EList<PropositionDeclaration> propList = propListImpl
					.getPropositions();
			for (int i = 0; i < propList.size(); i++) {
				String otherPropName = propList.get(i).getName();
				if (otherPropName.equals(propDecl.getName())
						&& !propList.get(i).equals(propDecl)) {
					error("Proposition names have to be unique",
							MyDslPackage.eINSTANCE.getAbstractExpression_Name(),
							i, MyDslIssueCodes.TEST_MESSAGE);
					return;
				}
			}
		}
	}

	@Check
	public void checkExpressionNameIsUnique(ExpressionDeclaration exprDecl) {
		EObject obj = exprDecl.eContainer();
		if (obj instanceof ExpressionsListImpl) {
			ExpressionsListImpl exprListImpl = (ExpressionsListImpl) obj;
			EList<ExpressionDeclaration> exprList = exprListImpl
					.getExpressions();
			for (int i = 0; i < exprList.size(); i++) {
				String otherExprName = exprList.get(i).getName();
				if (otherExprName.equals(exprDecl.getName())
						&& !exprList.get(i).equals(exprDecl)) {
					error("Expression names have to be unique",
							MyDslPackage.eINSTANCE.getAbstractExpression_Name(),
							i, MyDslIssueCodes.TEST_MESSAGE);
					return;
				}
			}
		}
	}

	@Check
	public void checkExceptionNameIsUnique(ExceptionDeclaration exceptionDecl) {
		EObject obj = exceptionDecl.eContainer();
		if (obj instanceof ExceptionsListImpl) {
			ExceptionsListImpl expListImpl = (ExceptionsListImpl) obj;
			EList<ExceptionDeclaration> expList = expListImpl.getExceptions();
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
	}

	@Check(CheckType.EXPENSIVE)
	public void checkModelWithJCAEHV(ModelImpl model) {
		MyDslToCAEH caehModel = new MyDslToCAEH(model);
		caehModel.buildModel();
		
		EList<ExceptionDeclaration> expList = model.getHandlingModel().getExceptionsList()
				.getExceptions();
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
							for (Scope scope : model.getHandlingModel().getScopes()) {
								if(scope.getException().getName().equals(exceptionDecl.getName())){
									error("Null Handling fault detected",scope, 
											MyDslPackage.eINSTANCE.getScope_Name(),-1);
								}
							};
							break;
						case HANDLER_LIVENESS:
							for (Scope scope : model.getHandlingModel().getScopes()) {
								if(scope.getException().getName().equals(exceptionDecl.getName())){
									for (Handler handler : scope.getHandlers()) {
										error("Dead Handler fault detected",handler, 
												MyDslPackage.eINSTANCE.getHandler_Name(),-1);
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
			info("All properties were verified. No errors were found.", MyDslPackage.eINSTANCE.getModel_Name());
		}
	}
}*/
