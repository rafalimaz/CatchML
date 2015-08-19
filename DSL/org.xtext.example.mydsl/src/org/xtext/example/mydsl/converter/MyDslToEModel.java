package org.xtext.example.mydsl.converter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.ExceptionDeclaration;
import org.xtext.example.mydsl.myDsl.ExceptionType;
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

public class MyDslToEModel {
	private List<SituationDeclaration> sitList = new ArrayList<SituationDeclaration>();
	private List<PropositionDeclaration> propList = new ArrayList<PropositionDeclaration>();
	private List<TransitionConstraintDeclaration> tconstList = new ArrayList<TransitionConstraintDeclaration>();;
	private List<SemanticConstraintDeclaration> sconstList = new ArrayList<SemanticConstraintDeclaration>();;
	private List<ExceptionDeclaration> exList = new ArrayList<ExceptionDeclaration>();;
	private List<ScopeDeclaration> scopeList = new ArrayList<ScopeDeclaration>();;
	private List<PropertyDeclaration> specList = new ArrayList<PropertyDeclaration>();;

	public MyDslToEModel(SystemDeclaration model) {
		for (Declaration decl : model.getDeclarations()) {
			if (decl instanceof PropositionType) {
				if (decl instanceof PropositionList) {
					propList.addAll(((PropositionList) decl).getTail());
					propList.add(((PropositionList) decl).getHead());
				} else {
					propList.add(((PropositionSingle) decl).getValue());
				}
			} else if (decl instanceof SituationType) {
				sitList.add(((SituationType) decl).getValue());
			} else if (decl instanceof SemanticConstraintType) {
				sconstList.add(((SemanticConstraintType) decl).getValue());
			} else if (decl instanceof TransitionConstraintType) {
				tconstList.add(((TransitionConstraintType) decl).getValue());
			} else if (decl instanceof ExceptionType) {
				exList.add(((ExceptionType) decl).getValue());
			} else if (decl instanceof ScopeType) {
				scopeList.add(((ScopeType) decl).getValue());
			} else if (decl instanceof PropertyType) {
				specList.add(((PropertyType) decl).getValue());
			}
		}
	}

	public List<ExceptionDeclaration> getExList() {
		return exList;
	}

	public void setExList(EList<ExceptionDeclaration> exList) {
		this.exList = exList;
	}

	public List<ScopeDeclaration> getScopeList() {
		return scopeList;
	}

	public void setScopeList(EList<ScopeDeclaration> scopeList) {
		this.scopeList = scopeList;
	}

	public List<PropositionDeclaration> getPropList() {
		return propList;
	}

	public void setPropList(EList<PropositionDeclaration> propList) {
		this.propList = propList;
	}

	public List<SituationDeclaration> getSitList() {
		return sitList;
	}

	public void setSitList(EList<SituationDeclaration> sitList) {
		this.sitList = sitList;
	}

	public List<TransitionConstraintDeclaration> getTconstList() {
		return tconstList;
	}

	public void setTconstList(EList<TransitionConstraintDeclaration> tconstList) {
		this.tconstList = tconstList;
	}

	public List<SemanticConstraintDeclaration> getSconstList() {
		return sconstList;
	}

	public void setSconstList(EList<SemanticConstraintDeclaration> sconstList) {
		this.sconstList = sconstList;
	}

	public List<PropertyDeclaration> getSpecList() {
		return specList;
	}

	public void setSpecList(List<PropertyDeclaration> specList) {
		this.specList = specList;
	}
}
