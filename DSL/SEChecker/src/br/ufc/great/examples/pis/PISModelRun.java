package br.ufc.great.examples.pis;

import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.model.ModelBuilder;

public class PISModelRun {

	public static void main(String[] args) {
		PISModel pis = new PISModel("PIS");
		try {
			ModelBuilder.build(pis);
		} catch (CKSBuildException e) {
			e.printStackTrace();
		}
	}
}
