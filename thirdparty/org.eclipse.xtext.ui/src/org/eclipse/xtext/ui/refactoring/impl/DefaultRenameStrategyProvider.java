/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.refactoring.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;

import com.google.inject.Inject;

/**
 * Uses a Guice provider to instantiate and initialize a {@link IRenameStrategy}.
 *
 * @author Jan Koehnlein - Initial contribution and API
 */
public class DefaultRenameStrategyProvider implements IRenameStrategy.Provider {

    @Inject(optional = true)
    private com.google.inject.Provider<IRenameStrategy> guiceStrategyProvider;

    public IRenameStrategy get(EObject targetEObject, IRenameElementContext renameElementContext) {
        IRenameStrategy renameStrategy = createRenameStrategy(targetEObject, renameElementContext);
        if (renameStrategy instanceof DefaultRenameStrategyProvider.IInitializable
                && ((DefaultRenameStrategyProvider.IInitializable) renameStrategy).initialize(targetEObject,
                renameElementContext)) {
            return renameStrategy;
        }
        return null;
    }

    protected IRenameStrategy createRenameStrategy(EObject targetEObject, IRenameElementContext renameElementContext) {
        return guiceStrategyProvider == null ? null : guiceStrategyProvider.get();
    }

    public interface IInitializable extends IRenameStrategy {
        boolean initialize(EObject targetEObject, IRenameElementContext renameElementContext);
    }
}