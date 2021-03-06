/******************************************************************************
 Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.hover.html;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

/**
 * @author Holger Schill - Initial contribution and API
 * @since 2.3
 */
@ImplementedBy(DefaultHoverDocumentationProvider.class)
public interface IEObjectHoverDocumentationProvider {

    String getDocumentation(EObject object);

}
