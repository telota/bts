/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.util;

import org.eclipse.core.resources.IResource;

/*
 * Important note:
 * ===============
 * Neither the interface nor the implementation class(es) may
 * expose any types from jdt.core in its signatures or use
 * any exceptions from jdt.core in catch clauses.
 */

/**
 * Encapsulates common functionality when dealing with JavaCore.
 *
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 2.1
 */
public interface IJdtHelper {

    /**
     * Return <code>true</code> if the plugin {@code jdt.core} is available.
     *
     * @return <code>true</code> if the plugin {@code jdt.core} is available.
     */
    boolean isJavaCoreAvailable();

    /**
     * Return <code>true</code> if the given resource is member of a java target folder.
     * May only be invoked if {@link #isJavaCoreAvailable() jdt.core is available}.
     *
     * @return <code>true</code> if the given resource is member of a java target folder.
     */
    boolean isFromOutputPath(IResource resource);

}
