package br.ufc.great.examples.smartpark;

import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.model.ModelBuilder;

/**
 * @author Rafael
 *
 */
public class SmartParkModelRun {

	public static void main(String[] args) {
		SmartParkModel smartPark = new SmartParkModel("SmartPark");
		try {
			ModelBuilder.build(smartPark);
		} catch (CKSBuildException e) {
			e.printStackTrace();
		}
	}
}
