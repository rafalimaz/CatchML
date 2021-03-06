/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.xtext.example.mydsl.myDsl.AbstractElement;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.Domainmodel;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExceptionType;
import org.xtext.example.mydsl.myDsl.HandlerDeclaration;
import org.xtext.example.mydsl.myDsl.LogicExpression;
import org.xtext.example.mydsl.myDsl.PropertyDeclaration;
import org.xtext.example.mydsl.myDsl.PropertyType;
import org.xtext.example.mydsl.myDsl.PropositionDeclaration;
import org.xtext.example.mydsl.myDsl.PropositionList;
import org.xtext.example.mydsl.myDsl.PropositionSingle;
import org.xtext.example.mydsl.myDsl.PropositionType;
import org.xtext.example.mydsl.myDsl.ScopeDeclaration;
import org.xtext.example.mydsl.myDsl.ScopeType;
import org.xtext.example.mydsl.myDsl.SemanticConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.SemanticConstraintType;
import org.xtext.example.mydsl.myDsl.SituationDeclaration;
import org.xtext.example.mydsl.myDsl.SituationType;
import org.xtext.example.mydsl.myDsl.SystemDeclaration;
import org.xtext.example.mydsl.myDsl.TransitionConstraintDeclaration;
import org.xtext.example.mydsl.myDsl.TransitionConstraintType;

/**
 * customization of the default outline structure
 * 
 */
public class MyDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	protected void _createChildren(DocumentRootNode parentNode,
			Domainmodel root){
		SystemDeclaration element = null;
		for (AbstractElement el : root.getElements()) {
			if(el instanceof SystemDeclaration){
				element = (SystemDeclaration)el;
				createNode(parentNode, element);
			}
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode, SystemDeclaration element) {
		Boolean propRootNode = false;
		Boolean sitRootNode = false;
		Boolean tconstRootNode = false;
		Boolean sconstRootNode = false;
		Boolean exRootNode = false;
		Boolean scopeRootNode = false;
		Boolean specRootNode = false;		
		
		for (Declaration decl : element.getDeclarations()) {
			if (decl instanceof PropositionType) {
				if (!propRootNode) {
					createNode(parentNode, decl);
					propRootNode = true;
				}
			} else if (decl instanceof SituationType) {
				if (!sitRootNode) {
					createNode(parentNode, decl);
					sitRootNode = true;
				}
			} else if (decl instanceof SemanticConstraintType) {
				if (!sconstRootNode) {
					createNode(parentNode, decl);
					sconstRootNode = true;
				}
			} else if (decl instanceof TransitionConstraintType) {
				if (!tconstRootNode) {
					createNode(parentNode, decl);
					tconstRootNode = true;
				}
			} else if (decl instanceof ExceptionType) {
				if (!exRootNode) {
					createNode(parentNode, decl);
					exRootNode = true;
				}
			} else if (decl instanceof ScopeType) {
				if (!scopeRootNode) {
					createNode(parentNode, decl);
					scopeRootNode = true;
				}
			} else if (decl instanceof PropertyType) {
				if (!specRootNode) {
					createNode(parentNode, decl);
					specRootNode = true;
				}
			} else {
				createNode(parentNode, decl);
			}
		}
	}

	protected void _createChildren(IOutlineNode parentNode,
			PropositionType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof PropositionType) {
				if (decl instanceof PropositionList) {
					createNode(parentNode, ((PropositionList) decl)
							.getHead());
					for (PropositionDeclaration prop : ((PropositionList) decl)
							.getTail()) {
						createNode(parentNode, prop);
					}
				} else{
					createNode(parentNode, ((PropositionSingle)decl).getValue());
				}
			}  
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode,
			SituationType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof SituationType) {
				SituationDeclaration sit = ((SituationType) decl).getValue();
					createNode(parentNode, sit);
			}
		}
	}
	protected void _createChildren(IOutlineNode parentNode,
			SemanticConstraintType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof SemanticConstraintType) {
				SemanticConstraintDeclaration sconst = ((SemanticConstraintType) decl)
						.getValue(); 
				createNode(parentNode, sconst);
			}
		}
	}
	protected void _createChildren(IOutlineNode parentNode,
			TransitionConstraintType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof TransitionConstraintType) {
				TransitionConstraintDeclaration tconst = ((TransitionConstraintType) decl)
						.getValue();
				createNode(parentNode, tconst);
			}
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode,
			ExceptionType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof ExceptionType) {
				ExceptionDeclaration ex =  ((ExceptionType) decl).getValue();
				createNode(parentNode, ex);
			}
		}
	}
	protected void _createChildren(IOutlineNode parentNode,
			ScopeType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof ScopeType) {
				ScopeDeclaration scope = ((ScopeType) decl).getValue();
				createNode(parentNode, scope);
			}
		}
	}
	protected void _createChildren(IOutlineNode parentNode,
			PropertyType element) {
		SystemDeclaration system = (SystemDeclaration) element.eContainer();
		for (Declaration decl : system.getDeclarations()) {
			if (decl instanceof PropertyType) {
				PropertyDeclaration spec = ((PropertyType) decl).getValue();
				createNode(parentNode, spec);
			}
		}
	}

	protected boolean _isLeaf(LogicExpression exp) {
		return true;
	}

	protected boolean _isLeaf(HandlerDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(ExceptionDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(SituationDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(ScopeDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(PropertyDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(TransitionConstraintDeclaration exp) {
		return true;
	}

	protected boolean _isLeaf(SemanticConstraintDeclaration exp) {
		return true;
	}
}
