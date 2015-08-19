package br.ufc.great.catchml.converter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import br.ufc.great.catchml.catchML.Declaration;
import br.ufc.great.catchml.catchML.ExceptionDeclaration;
import br.ufc.great.catchml.catchML.PropertyDeclaration;
import br.ufc.great.catchml.catchML.PropositionDeclaration;
import br.ufc.great.catchml.catchML.PropositionExpressionDeclaration;
import br.ufc.great.catchml.catchML.ScopeDeclaration;
import br.ufc.great.catchml.catchML.SemanticConstraintDeclaration;
import br.ufc.great.catchml.catchML.SituationDeclaration;
import br.ufc.great.catchml.catchML.SystemDeclaration;
import br.ufc.great.catchml.catchML.TransitionConstraintDeclaration;

public class CatchMLToEModel {
	private List<PropositionDeclaration> propList = new ArrayList<PropositionDeclaration>();
	private List<SituationDeclaration> sitList = new ArrayList<SituationDeclaration>();
	private List<TransitionConstraintDeclaration> tconstList = new ArrayList<TransitionConstraintDeclaration>();;
	private List<SemanticConstraintDeclaration> sconstList = new ArrayList<SemanticConstraintDeclaration>();;
	private List<ExceptionDeclaration> exList = new ArrayList<ExceptionDeclaration>();;
	private List<ScopeDeclaration> scopeList = new ArrayList<ScopeDeclaration>();;
	private List<PropertyDeclaration> specList = new ArrayList<PropertyDeclaration>();;

	public CatchMLToEModel(SystemDeclaration model) {
		for (Declaration decl : model.getDeclarations()) {
			if (decl instanceof PropositionExpressionDeclaration) {
				propList.addAll(((PropositionExpressionDeclaration) decl).getArgs());
			} else if (decl instanceof SituationDeclaration) {
				sitList.add(((SituationDeclaration) decl));
			} else if (decl instanceof SemanticConstraintDeclaration) {
				sconstList.add(((SemanticConstraintDeclaration) decl));
			} else if (decl instanceof TransitionConstraintDeclaration) {
				tconstList.add(((TransitionConstraintDeclaration) decl));
			} else if (decl instanceof ExceptionDeclaration) {
				exList.add(((ExceptionDeclaration) decl));
			} else if (decl instanceof ScopeDeclaration) {
				scopeList.add(((ScopeDeclaration) decl));
			} else if (decl instanceof PropertyDeclaration) {
				specList.add(((PropertyDeclaration) decl));
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
