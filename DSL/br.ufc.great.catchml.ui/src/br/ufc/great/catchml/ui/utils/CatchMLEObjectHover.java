package br.ufc.great.catchml.ui.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import br.ufc.great.catchml.services.CatchMLGrammarAccess;

import com.google.inject.Inject;

public class CatchMLEObjectHover extends DispatchingEObjectTextHover {

	@Inject
	CatchMLGrammarAccess grammarAccess;

	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource,
			int offset) {
		Pair<EObject, IRegion> temp = super.getXtextElementAt(resource, offset);
		if (temp == null) {
			ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(resource
					.getParseResult().getRootNode(), offset);
			if (node.getGrammarElement() instanceof Keyword) {
				IRegion region = new Region(node.getOffset(), node.getLength());
				temp = Tuples.create(node.getGrammarElement(), region);
			}
		}
		return temp;
	}

	@Override
	public Object getHoverInfo(EObject first, ITextViewer textViewer,
			IRegion hoverRegion) {
		if (first instanceof Keyword) {
			return getHoverInfoForKeyword((Keyword) first);
		} else {
			return super.getHoverInfo(first, textViewer, hoverRegion);
		}
	}

	private Object getHoverInfoForKeyword(final Keyword keyword) {
		// use grammarAccess here to see which Keyword you are dealing with
		// and determine the text to show
		if (keyword == grammarAccess.getPropositionExpressionDeclarationAccess().getPropKeyword_0()) {
			keyword.setValue("test prop");
		}
		return keyword.getValue();
	}
}