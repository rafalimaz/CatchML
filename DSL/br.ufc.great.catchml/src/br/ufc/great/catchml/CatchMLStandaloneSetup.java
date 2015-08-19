
package br.ufc.great.catchml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CatchMLStandaloneSetup extends CatchMLStandaloneSetupGenerated{

	public static void doSetup() {
		new CatchMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

