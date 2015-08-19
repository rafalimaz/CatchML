/*
* generated by Xtext
*/
package br.ufc.great.catchml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import br.ufc.great.catchml.services.CatchMLGrammarAccess;

public class CatchMLParser extends AbstractContentAssistParser {
	
	@Inject
	private CatchMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected br.ufc.great.catchml.ui.contentassist.antlr.internal.InternalCatchMLParser createParser() {
		br.ufc.great.catchml.ui.contentassist.antlr.internal.InternalCatchMLParser result = new br.ufc.great.catchml.ui.contentassist.antlr.internal.InternalCatchMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getAbstractDeclarationAccess().getAlternatives(), "rule__AbstractDeclaration__Alternatives");
					put(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0(), "rule__RelationalExpression__OpAlternatives_1_1_0");
					put(grammarAccess.getAdditiveExpressionAccess().getAlternatives(), "rule__AdditiveExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getTemporalRelationalExpressionAccess().getOpAlternatives_1_1_0(), "rule__TemporalRelationalExpression__OpAlternatives_1_1_0");
					put(grammarAccess.getTemporalAdditiveExpressionAccess().getAlternatives(), "rule__TemporalAdditiveExpression__Alternatives");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getAlternatives(), "rule__TemporalPrimaryExpression__Alternatives");
					put(grammarAccess.getBINARYOPERATORAccess().getAlternatives(), "rule__BINARYOPERATOR__Alternatives");
					put(grammarAccess.getTEMPORALOPERATORAccess().getAlternatives(), "rule__TEMPORALOPERATOR__Alternatives");
					put(grammarAccess.getTEMPUNTILOPERATORAccess().getAlternatives(), "rule__TEMPUNTILOPERATOR__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSystemDeclarationAccess().getGroup(), "rule__SystemDeclaration__Group__0");
					put(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup(), "rule__PropositionExpressionDeclaration__Group__0");
					put(grammarAccess.getPropositionExpressionDeclarationAccess().getGroup_2(), "rule__PropositionExpressionDeclaration__Group_2__0");
					put(grammarAccess.getSituationDeclarationAccess().getGroup(), "rule__SituationDeclaration__Group__0");
					put(grammarAccess.getSemanticConstraintDeclarationAccess().getGroup(), "rule__SemanticConstraintDeclaration__Group__0");
					put(grammarAccess.getTransitionConstraintDeclarationAccess().getGroup(), "rule__TransitionConstraintDeclaration__Group__0");
					put(grammarAccess.getExceptionDeclarationAccess().getGroup(), "rule__ExceptionDeclaration__Group__0");
					put(grammarAccess.getScopeDeclarationAccess().getGroup(), "rule__ScopeDeclaration__Group__0");
					put(grammarAccess.getHandlerDeclarationAccess().getGroup(), "rule__HandlerDeclaration__Group__0");
					put(grammarAccess.getActionDeclarationAccess().getGroup(), "rule__ActionDeclaration__Group__0");
					put(grammarAccess.getPropertyDeclarationAccess().getGroup(), "rule__PropertyDeclaration__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_0(), "rule__AdditiveExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3_3(), "rule__PrimaryExpression__Group_3_3__0");
					put(grammarAccess.getTemporalOrExpressionAccess().getGroup(), "rule__TemporalOrExpression__Group__0");
					put(grammarAccess.getTemporalOrExpressionAccess().getGroup_1(), "rule__TemporalOrExpression__Group_1__0");
					put(grammarAccess.getTemporalAndExpressionAccess().getGroup(), "rule__TemporalAndExpression__Group__0");
					put(grammarAccess.getTemporalAndExpressionAccess().getGroup_1(), "rule__TemporalAndExpression__Group_1__0");
					put(grammarAccess.getTemporalRelationalExpressionAccess().getGroup(), "rule__TemporalRelationalExpression__Group__0");
					put(grammarAccess.getTemporalRelationalExpressionAccess().getGroup_1(), "rule__TemporalRelationalExpression__Group_1__0");
					put(grammarAccess.getTemporalAdditiveExpressionAccess().getGroup_0(), "rule__TemporalAdditiveExpression__Group_0__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_0(), "rule__TemporalPrimaryExpression__Group_0__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_2(), "rule__TemporalPrimaryExpression__Group_2__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_3(), "rule__TemporalPrimaryExpression__Group_3__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_4(), "rule__TemporalPrimaryExpression__Group_4__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5(), "rule__TemporalPrimaryExpression__Group_5__0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getGroup_5_3(), "rule__TemporalPrimaryExpression__Group_5_3__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getSystemDeclarationAccess().getNameAssignment_1(), "rule__SystemDeclaration__NameAssignment_1");
					put(grammarAccess.getSystemDeclarationAccess().getDeclarationsAssignment_3(), "rule__SystemDeclaration__DeclarationsAssignment_3");
					put(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_1(), "rule__PropositionExpressionDeclaration__ArgsAssignment_1");
					put(grammarAccess.getPropositionExpressionDeclarationAccess().getArgsAssignment_2_1(), "rule__PropositionExpressionDeclaration__ArgsAssignment_2_1");
					put(grammarAccess.getPropositionDeclarationAccess().getNameAssignment(), "rule__PropositionDeclaration__NameAssignment");
					put(grammarAccess.getSituationDeclarationAccess().getNameAssignment_1(), "rule__SituationDeclaration__NameAssignment_1");
					put(grammarAccess.getSituationDeclarationAccess().getExpressionAssignment_3(), "rule__SituationDeclaration__ExpressionAssignment_3");
					put(grammarAccess.getSemanticConstraintDeclarationAccess().getNameAssignment_1(), "rule__SemanticConstraintDeclaration__NameAssignment_1");
					put(grammarAccess.getSemanticConstraintDeclarationAccess().getExpressionAssignment_3(), "rule__SemanticConstraintDeclaration__ExpressionAssignment_3");
					put(grammarAccess.getTransitionConstraintDeclarationAccess().getNameAssignment_1(), "rule__TransitionConstraintDeclaration__NameAssignment_1");
					put(grammarAccess.getTransitionConstraintDeclarationAccess().getLeftAssignment_4(), "rule__TransitionConstraintDeclaration__LeftAssignment_4");
					put(grammarAccess.getTransitionConstraintDeclarationAccess().getRightAssignment_6(), "rule__TransitionConstraintDeclaration__RightAssignment_6");
					put(grammarAccess.getExceptionDeclarationAccess().getNameAssignment_1(), "rule__ExceptionDeclaration__NameAssignment_1");
					put(grammarAccess.getExceptionDeclarationAccess().getExpressionAssignment_3(), "rule__ExceptionDeclaration__ExpressionAssignment_3");
					put(grammarAccess.getScopeDeclarationAccess().getNameAssignment_1(), "rule__ScopeDeclaration__NameAssignment_1");
					put(grammarAccess.getScopeDeclarationAccess().getExceptionAssignment_4(), "rule__ScopeDeclaration__ExceptionAssignment_4");
					put(grammarAccess.getScopeDeclarationAccess().getHandlersAssignment_7(), "rule__ScopeDeclaration__HandlersAssignment_7");
					put(grammarAccess.getHandlerDeclarationAccess().getExpressionAssignment_2(), "rule__HandlerDeclaration__ExpressionAssignment_2");
					put(grammarAccess.getHandlerDeclarationAccess().getActionsAssignment_5(), "rule__HandlerDeclaration__ActionsAssignment_5");
					put(grammarAccess.getActionDeclarationAccess().getExpressionAssignment_1(), "rule__ActionDeclaration__ExpressionAssignment_1");
					put(grammarAccess.getPropertyDeclarationAccess().getNameAssignment_1(), "rule__PropertyDeclaration__NameAssignment_1");
					put(grammarAccess.getPropertyDeclarationAccess().getExpressionAssignment_3(), "rule__PropertyDeclaration__ExpressionAssignment_3");
					put(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1(), "rule__OrExpression__OpAssignment_1_1");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1(), "rule__AndExpression__OpAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1(), "rule__RelationalExpression__OpAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2(), "rule__RelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_0_1(), "rule__AdditiveExpression__OpAssignment_0_1");
					put(grammarAccess.getAdditiveExpressionAccess().getExprAssignment_0_2(), "rule__AdditiveExpression__ExprAssignment_0_2");
					put(grammarAccess.getPrimaryExpressionAccess().getExprAssignment_0_1(), "rule__PrimaryExpression__ExprAssignment_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1(), "rule__PrimaryExpression__ValueAssignment_1");
					put(grammarAccess.getPrimaryExpressionAccess().getOpBinAssignment_2_0(), "rule__PrimaryExpression__OpBinAssignment_2_0");
					put(grammarAccess.getPrimaryExpressionAccess().getLeftAssignment_2_2(), "rule__PrimaryExpression__LeftAssignment_2_2");
					put(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_2_4(), "rule__PrimaryExpression__RightAssignment_2_4");
					put(grammarAccess.getPrimaryExpressionAccess().getOpMulAssignment_3_0(), "rule__PrimaryExpression__OpMulAssignment_3_0");
					put(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_2(), "rule__PrimaryExpression__ArgsAssignment_3_2");
					put(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_3_3_1(), "rule__PrimaryExpression__ArgsAssignment_3_3_1");
					put(grammarAccess.getTemporalOrExpressionAccess().getOpAssignment_1_1(), "rule__TemporalOrExpression__OpAssignment_1_1");
					put(grammarAccess.getTemporalOrExpressionAccess().getRightAssignment_1_2(), "rule__TemporalOrExpression__RightAssignment_1_2");
					put(grammarAccess.getTemporalAndExpressionAccess().getOpAssignment_1_1(), "rule__TemporalAndExpression__OpAssignment_1_1");
					put(grammarAccess.getTemporalAndExpressionAccess().getRightAssignment_1_2(), "rule__TemporalAndExpression__RightAssignment_1_2");
					put(grammarAccess.getTemporalRelationalExpressionAccess().getOpAssignment_1_1(), "rule__TemporalRelationalExpression__OpAssignment_1_1");
					put(grammarAccess.getTemporalRelationalExpressionAccess().getRightAssignment_1_2(), "rule__TemporalRelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getTemporalAdditiveExpressionAccess().getOpAssignment_0_1(), "rule__TemporalAdditiveExpression__OpAssignment_0_1");
					put(grammarAccess.getTemporalAdditiveExpressionAccess().getExprAssignment_0_2(), "rule__TemporalAdditiveExpression__ExprAssignment_0_2");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getExprAssignment_0_1(), "rule__TemporalPrimaryExpression__ExprAssignment_0_1");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getValueAssignment_1(), "rule__TemporalPrimaryExpression__ValueAssignment_1");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempAssignment_2_0(), "rule__TemporalPrimaryExpression__OpTempAssignment_2_0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getTemporalAssignment_2_2(), "rule__TemporalPrimaryExpression__TemporalAssignment_2_2");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getOpTempUntilAssignment_3_0(), "rule__TemporalPrimaryExpression__OpTempUntilAssignment_3_0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftExpAssignment_3_2(), "rule__TemporalPrimaryExpression__LeftExpAssignment_3_2");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getRightExpAssignment_3_4(), "rule__TemporalPrimaryExpression__RightExpAssignment_3_4");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getOpBinAssignment_4_0(), "rule__TemporalPrimaryExpression__OpBinAssignment_4_0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getLeftAssignment_4_2(), "rule__TemporalPrimaryExpression__LeftAssignment_4_2");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getRightAssignment_4_4(), "rule__TemporalPrimaryExpression__RightAssignment_4_4");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getOpMulAssignment_5_0(), "rule__TemporalPrimaryExpression__OpMulAssignment_5_0");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_2(), "rule__TemporalPrimaryExpression__ArgsAssignment_5_2");
					put(grammarAccess.getTemporalPrimaryExpressionAccess().getArgsAssignment_5_3_1(), "rule__TemporalPrimaryExpression__ArgsAssignment_5_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			br.ufc.great.catchml.ui.contentassist.antlr.internal.InternalCatchMLParser typedParser = (br.ufc.great.catchml.ui.contentassist.antlr.internal.InternalCatchMLParser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CatchMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CatchMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}