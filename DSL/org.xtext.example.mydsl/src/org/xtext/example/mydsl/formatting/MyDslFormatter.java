/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class MyDslFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		MyDslGrammarAccess f = (MyDslGrammarAccess) getGrammarAccess();

		c.setAutoLinewrap(120);

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

		for (Keyword semicolon : f.findKeywords(";")) {
			c.setNoSpace().before(semicolon);
			c.setLinewrap().after(semicolon);
		}

		for (Keyword op : f.findKeywords("!")) {
			c.setNoSpace().after(op);
		}

		for (Keyword bracket : f.findKeywords("{")) {
			c.setSpace(" ").before(bracket);
			c.setLinewrap().after(bracket);
		}

		c.setNoSpace().after(
				f.getPrimaryExpressionAccess().getOpBinAssignment_2_0());
		c.setNoSpace().after(
				f.getPrimaryExpressionAccess().getOpMulAssignment_3_0());

		c.setIndentationIncrement().after(
				f.getSystemDeclarationAccess().getLeftCurlyBracketKeyword_2());
		c.setIndentationDecrement().before(
				f.getSystemDeclarationAccess().getRightCurlyBracketKeyword_4());

		c.setLinewrap(0, 1, 2).before(f.getPropositionSingleRule());
		c.setLinewrap(0, 1, 2).after(f.getPropositionSingleRule());

		c.setLinewrap(0, 1, 2).before(f.getSituationTypeRule());
		c.setLinewrap(0, 1, 2).after(f.getSituationTypeRule());

		c.setLinewrap(0, 1, 2).before(f.getSemanticConstraintTypeRule());
		c.setLinewrap(0, 1, 2).after(f.getSemanticConstraintTypeRule());

		c.setLinewrap(0, 1, 2).before(f.getTransitionConstraintTypeRule());
		c.setLinewrap(0, 1, 2).after(f.getTransitionConstraintTypeRule());

		c.setLinewrap(0, 1, 2).before(f.getExceptionTypeRule());
		c.setLinewrap(0, 1, 2).after(f.getExceptionTypeRule());

		c.setLinewrap(0, 1, 2).before(f.getScopeDeclarationRule());
		c.setLinewrap(0, 1, 2).after(f.getScopeDeclarationRule());

		c.setLinewrap(0, 1, 2).before(f.getHandlerDeclarationRule());
		c.setLinewrap(0, 1, 2).after(f.getHandlerDeclarationRule());

		c.setSpace(" ").before(
				f.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_5());
		c.setIndentationIncrement().after(
				f.getScopeDeclarationAccess().getLeftCurlyBracketKeyword_5());
		c.setIndentationDecrement().before(
				f.getScopeDeclarationAccess().getRightCurlyBracketKeyword_7());

		c.setSpace(" ").before(
				f.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_5());
		c.setIndentationIncrement().after(
				f.getHandlerDeclarationAccess().getLeftCurlyBracketKeyword_5());
		c.setIndentationDecrement()
				.before(f.getHandlerDeclarationAccess()
						.getRightCurlyBracketKeyword_7());

		// formatting for Comments
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}