/******************************************************************************
 Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.reconciler;

import static com.google.common.collect.ObjectArrays.*;
import static org.eclipse.jface.text.IDocumentExtension3.*;
import static org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper.*;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;
import org.eclipse.ui.texteditor.spelling.SpellingContext;
import org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy;
import org.eclipse.ui.texteditor.spelling.SpellingService;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapperExtension;

import com.google.inject.Inject;

/**
 * @author Michael Clay - Initial contribution and API
 * @since 2.3
 */
public class XtextSpellingReconcileStrategy extends SpellingReconcileStrategy {

    private ISpellingProblemCollector spellingProblemCollector;
    private SpellingService spellingService = EditorsUI.getSpellingService();
    private SpellingContext spellingContext = new SpellingContext();
    private NullProgressMonitor progressMonitor = new NullProgressMonitor();
    private ITokenTypeToPartitionTypeMapperExtension partitionMapperExtension;
    protected XtextSpellingReconcileStrategy(ISourceViewer viewer) {
        super(viewer, EditorsUI.getSpellingService());
        spellingContext.setContentType(getContentType());
    }

    /**
     * @since 2.4
     */
    protected void setPartitionMapperExtension(ITokenTypeToPartitionTypeMapperExtension partitionMapperExtension) {
        this.partitionMapperExtension = partitionMapperExtension;
    }

    @Override
    public void setDocument(IDocument document) {
        super.setDocument(document);
        spellingProblemCollector = createSpellingProblemCollector();
    }

    @Override
    public void reconcile(IRegion region) {
        if (!isSpellingEnabled()) {
            return;
        }
        ITypedRegion[] regions = computePartitioning(0, getDocument().getLength(), DEFAULT_PARTITIONING);
        spellingService.check(getDocument(), regions, spellingContext, spellingProblemCollector, progressMonitor);
    }

    protected ITypedRegion[] computePartitioning(int offset, int length, String partitionType) {
        ITypedRegion[] result = new ITypedRegion[0];
        ITypedRegion[] allRegions = new ITypedRegion[0];
        try {
            allRegions = TextUtilities.computePartitioning(getDocument(), partitionType, offset, length, false);
        } catch (BadLocationException ignored) {
        }
        for (ITypedRegion allRegion : allRegions) {
            if (shouldProcess(allRegion)) {
                result = concat(result, allRegion);
            }

        }
        return result;
    }

    protected boolean shouldProcess(ITypedRegion typedRegion) {
        String type = typedRegion.getType();
        if (partitionMapperExtension != null) {
            return partitionMapperExtension.isMultiLineComment(type) || partitionMapperExtension.isSingleLineComment(type) || STRING_LITERAL_PARTITION.equals(type);
        }
        return STRING_LITERAL_PARTITION.equals(type)
                || SL_COMMENT_PARTITION.equals(type)
                || COMMENT_PARTITION.equals(type);
    }

    protected boolean isSpellingEnabled() {
        return spellingProblemCollector != null && EditorsUI.getPreferenceStore().getBoolean(SpellingService.PREFERENCE_SPELLING_ENABLED);
    }

    public static class Factory {

        @Inject
        private ITokenTypeToPartitionTypeMapperExtension partitionMapperExtension;

        public XtextSpellingReconcileStrategy create(ISourceViewer sourceViewer) {
            XtextSpellingReconcileStrategy result = new XtextSpellingReconcileStrategy(sourceViewer);
            result.setPartitionMapperExtension(partitionMapperExtension);
            return result;
        }
    }

}
