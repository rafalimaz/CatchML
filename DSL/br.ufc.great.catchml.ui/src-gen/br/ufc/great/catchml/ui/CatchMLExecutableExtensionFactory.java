/*
 * generated by Xtext
 */
package br.ufc.great.catchml.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import br.ufc.great.catchml.ui.internal.CatchMLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CatchMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CatchMLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CatchMLActivator.getInstance().getInjector(CatchMLActivator.BR_UFC_GREAT_CATCHML_CATCHML);
	}
	
}
