package br.ufc.great.convertion;

import br.ufc.great.cks.CKSModel;

public interface CKSModelConverter {

	public void convert(CKSModel cks);

	public StringBuffer getXML(CKSModel ecks);
}
