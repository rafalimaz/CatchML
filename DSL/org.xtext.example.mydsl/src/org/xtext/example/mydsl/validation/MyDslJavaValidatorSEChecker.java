package org.xtext.example.mydsl.validation;
/*package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Proposition;
 

public class SECheckerMyDslJavaValidator extends AbstractMyDslJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkPropositionNameIsUnique(Model model) {
		EList<Proposition> props = model.getPropositions();

		for (int i = 0; i < props.size(); i++) {
			String firstName = props.get(i).getName();
			for (int j = props.size()-1; j >= i ; j--) {
				if(j != i) {
					String secondName = props.get(j).getName();
					if (firstName.equals(secondName)) {
						error("Proposition names have to be unique",
								MyDslPackage.Literals.PROPOSITION__NAME);
						return;
					}
				}
			}
		}		
	}
}*/
