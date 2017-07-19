/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.doubleClicking;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

import com.google.inject.Inject;

/**
 * Provide the double click strategies for the given content types in a document.
 *
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DoubleClickStrategyProvider {

    @Inject
    private LexerTokenAndCharacterPairAwareStrategy defaultDoubleClickStrategy;

    public ITextDoubleClickStrategy getStrategy(ISourceViewer sourceViewer, String contentType, String documentPartitioning) {
        if (TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION.equals(contentType))
            return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 0, 0);
        if (TerminalsTokenTypeToPartitionMapper.SL_COMMENT_PARTITION.equals(contentType))
            return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 0, 0);
        if (TerminalsTokenTypeToPartitionMapper.STRING_LITERAL_PARTITION.equals(contentType))
            return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 1, 1);
        return defaultDoubleClickStrategy;
    }

}
