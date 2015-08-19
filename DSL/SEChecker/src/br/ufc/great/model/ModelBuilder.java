package br.ufc.great.model;

import java.util.Date;

import br.ufc.great.caeh.CAEHCFlowBuilder;
import br.ufc.great.cks.CKSBuilder;
import br.ufc.great.cks.CKSModel;
import br.ufc.great.cks.exception.CKSBuildException;
import br.ufc.great.convertion.CKS2MCiEModel;
import br.ufc.great.convertion.CKS2XMLModel;
import br.ufc.great.convertion.CKSModelConverter;

public class ModelBuilder {

	public static void build(SystemModel model) throws CKSBuildException {
		CKSBuilder cksBuilder = new CKSBuilder();
		long startTime = new Date().getTime();

		cksBuilder.build(model);
		CKSModel ecks = cksBuilder.getTotalCKSWithTerminalStateLoop();
		CKSModelConverter xmlConverter = new CKS2XMLModel();		
		xmlConverter.convert(ecks);
		CKSModelConverter mcie = new CKS2MCiEModel();
		mcie.convert(ecks);

		long endTime = new Date().getTime();

		System.out
				.println("The CKS was built. Nº of states "
						+ ecks.getStateNumber() + " in "
						+ (endTime - startTime) + "ms");

		startTime = new Date().getTime();
		CAEHCFlowBuilder caehBuilder = new CAEHCFlowBuilder();
		ecks = caehBuilder.caeh(ecks, model.getContextualExceptions());
		xmlConverter.convert(ecks);
		mcie.convert(ecks);
		endTime = new Date().getTime();

		System.out
				.println("The caeh(CKS, E) was applied. Nº of states "
						+ ecks.getStateNumber() + " in "
						+ (endTime - startTime) + "ms");

	}
	
	public static StringBuffer[] getXML(SystemModel model) throws CKSBuildException {
		StringBuffer[] buffer = new StringBuffer[2];
		CKSBuilder cksBuilder = new CKSBuilder();
		long startTime = new Date().getTime();

		cksBuilder.build(model);
		CKSModel ecks = cksBuilder.getTotalCKSWithTerminalStateLoop();
		CKSModelConverter xmlConverter = new CKS2XMLModel();		
		buffer[0] = xmlConverter.getXML(ecks);
		
		long endTime = new Date().getTime();

		System.out
				.println("The CKS was built. Nº of states "
						+ ecks.getStateNumber() + " in "
						+ (endTime - startTime) + "ms");
		
		CKSModelConverter mcie = new CKS2MCiEModel();
		buffer[1] = mcie.getXML(ecks);
		
		return buffer;
	}
}
