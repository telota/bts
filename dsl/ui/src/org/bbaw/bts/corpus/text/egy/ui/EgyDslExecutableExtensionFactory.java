/*
 * generated by Xtext
 */
package org.bbaw.bts.corpus.text.egy.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EgyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EgyDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EgyDslActivator.getInstance().getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
	}
	
}
