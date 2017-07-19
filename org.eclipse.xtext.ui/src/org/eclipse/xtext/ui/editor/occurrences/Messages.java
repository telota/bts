/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.occurrences;

import org.eclipse.osgi.util.NLS;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.xtext.ui.editor.occurrences.messages"; //$NON-NLS-1$
	public static String MarkOccurrenceActionContributor_description;
	public static String MarkOccurrenceActionContributor_text;
	public static String MarkOccurrenceActionContributor_toolTipText;
	public static String OccurrenceMarker_MarkOccurenceJob_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
