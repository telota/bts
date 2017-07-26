package org.bbaw.bts.ui.egy.parts.support;

import java.util.HashSet;
import java.util.Set;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy;
import org.eclipse.jface.text.source.AnnotationPainter.IDrawingStrategy;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public abstract class AbstractTextEditorLogic {

    protected static final String[] ANNO_TYPES_SUFFIXES = new String[]{"", ".highlighted"};
    protected EmbeddedEditor embeddedEditor;
    protected AnnotationPainter painter;
    private IEclipsePreferences annotationPreferences = null;
    private Set<String> annotationStrategySet = null;


    private void addStrategy(String identifier, Color color, ITextStyleStrategy strategy) {
        painter.addTextStyleStrategy(identifier, strategy);
        addStrategyReferences(identifier, color);
    }

    private void addStrategy(String identifier, Color color, IDrawingStrategy strategy) {
        painter.addDrawingStrategy(identifier, strategy);
        addStrategyReferences(identifier, color);
    }

    private void addStrategyReferences(String identifier, Color color) {
        painter.addAnnotationType(identifier, identifier);
        painter.setAnnotationTypeColor(identifier, color);
        annotationStrategySet.add(identifier);
    }

    protected Set<String> getAnnotationStrategySet() {
        if (annotationStrategySet == null) {
            configureEditorDrawingStrategies(null);
        }
        return annotationStrategySet;
    }

    protected IEclipsePreferences getAnnotationPreferences() {
        if (annotationPreferences == null) {
            Preferences rootNode = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");
            annotationPreferences = (IEclipsePreferences) rootNode.node(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS);
        }
        return annotationPreferences;
    }

    protected void configureEditorDrawingStrategies(OverviewRuler oruler) {
        annotationStrategySet = new HashSet<>();

        // set basic rulers
        if (oruler != null) {
            oruler.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT);
            oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION_SUBTEXT, 12);
            oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT, BTSUIConstants.COLOR_SUBTEXT);

            oruler.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED);
            oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED, 2);
            oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED, BTSUIConstants.COLOR_SUBTEXT);

            oruler.addAnnotationType(BTSConstants.COMMENT);
            oruler.setAnnotationTypeLayer(BTSConstants.COMMENT, 11);
            oruler.setAnnotationTypeColor(BTSConstants.COMMENT,
                    BTSUIConstants.COLOR_COMMENT);

            oruler.addAnnotationType(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED);
            oruler.setAnnotationTypeLayer(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED, 14);
            oruler.setAnnotationTypeColor(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED,
                    BTSUIConstants.COLOR_COMMENT);

            oruler.addAnnotationType("org.eclipse.xtext.ui.editor.error");
            oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.error", 30);
            oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.error", BTSUIConstants.COLOR_ERROR);

            oruler.addAnnotationType("org.eclipse.xtext.ui.editor.warning");
            oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.warning", 18);
            oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.warning", BTSUIConstants.COLOR_WARNING);

            oruler.addAnnotationType(BTSSentenceAnnotation.TYPE_HIGHLIGHTED);
            oruler.setAnnotationTypeLayer(BTSSentenceAnnotation.TYPE_HIGHLIGHTED, 8);
            oruler.setAnnotationTypeColor(BTSSentenceAnnotation.TYPE_HIGHLIGHTED,
                    BTSUIConstants.COLOR_SENTENCE);
        }

        // highlighted sentence
        addStrategy(BTSSentenceAnnotation.TYPE_HIGHLIGHTED, BTSUIConstants.COLOR_SENTENCE,
                new AnnotationDrawingStrategy());

        // lemma
        addStrategy(BTSLemmaAnnotation.TYPE, BTSUIConstants.COLOR_LEMMA,
                new HighlightingStrategy());

        // comment
        addStrategy(BTSConstants.COMMENT, BTSUIConstants.COLOR_COMMENT,
                new CommentDrawingStrategy());
        // highlighted comment
        addStrategy(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED,
                BTSUIConstants.COLOR_COMMENT,
                new CommentHighlightedDrawingStrategy());

        // subtext
        // XXX we need to use prefix 'Text' for this. It's in BASIC_OBJECT_TYPES[5]
        addStrategy(BTSConstants.BASIC_OBJECT_TYPES[5] + CorpusUtils.TYPE_PATH_DELIMITER
                        + BTSConstants.ANNOTATION_SUBTEXT,
                BTSUIConstants.COLOR_SUBTEXT,
                new SubtextdrawingStrategy());
        // highlighted subtext
        // XXX again: prefix needed. marked for uglyness.
        addStrategy(BTSConstants.BASIC_OBJECT_TYPES[5] + CorpusUtils.TYPE_PATH_DELIMITER
                        + BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED,
                BTSUIConstants.COLOR_SUBTEXT,
                new SubtextHighlightedDrawingStrategy());


        // annotations
        boolean annotationBaseStrategyExists = false;
        boolean annotationRubrumStrategyExists = false;

        try {
            for (String childNode : getAnnotationPreferences().childrenNames()) {
                IEclipsePreferences node = (IEclipsePreferences) annotationPreferences.node(childNode);
                String strategyType = BTSConstants.ANNOTATION;
                String type = node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, null);
                String subtype = node.get(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, null);
                if (type != null && !"".equals(type)) {
                    strategyType += CorpusUtils.TYPE_PATH_DELIMITER + type;
                    if (subtype != null && !"".equals(subtype)) {
                        strategyType += CorpusUtils.TYPE_PATH_DELIMITER + subtype;
                    } else if (CorpusUtils.ANNOTATION_RUBRUM_TYPE.equalsIgnoreCase(type)) {
                        // general rubrum strategy extits
                        annotationRubrumStrategyExists = true;
                    }
                } else {
                    annotationBaseStrategyExists = true;
                }

                // Annotation
                String highlightingType = node.get(BTSCorpusConstants.PREF_HIGHLIGHTING_TYPE, BTSCorpusConstants.PREF_DEFAULT_HIGHLIGHTING_TYPE);
                IDrawingStrategy annotationStrategy = null;
                ITextStyleStrategy annotationTextStyleStrategy = null;
                if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_UNDERLINE.equals(highlightingType)) {
                    annotationStrategy = new AnnotationDrawingStrategy();
                } else if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_TEXTCOLOR.equals(highlightingType)) {
                    annotationTextStyleStrategy = new RubrumDrawingStrategy();
                } else if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_BACKGROUND_COLOR.equals(highlightingType)) {
                    annotationTextStyleStrategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
                } else {
                    annotationStrategy = new AnnotationDrawingStrategy();
                }

                if (annotationStrategy != null) {
                    painter.addDrawingStrategy(strategyType,
                            annotationStrategy);
                } else {
                    painter.addTextStyleStrategy(strategyType,
                            annotationTextStyleStrategy);
                }

                String colorString = node.get(BTSCorpusConstants.PREF_COLOR, null);
                Color color;
                if (colorString != null) {
                    color = BTSUIConstants.getColor(colorString);
                } else {
                    color = BTSUIConstants.COLOR_ANNOTATTION;
                }
                painter.setAnnotationTypeColor(strategyType, color);

                painter.addAnnotationType(strategyType,
                        strategyType);
                annotationStrategySet.add(strategyType);

                // Annotation highlighted
                AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
                painter.addDrawingStrategy(strategyType + BTSModelAnnotation.HIGHLIGHTED,
                        annotationHighlightedStrategy);
                painter.setAnnotationTypeColor(strategyType + BTSModelAnnotation.HIGHLIGHTED,
                        color);

                painter.addAnnotationType(strategyType + BTSModelAnnotation.HIGHLIGHTED,
                        strategyType + BTSModelAnnotation.HIGHLIGHTED);
                annotationStrategySet.add(strategyType + BTSModelAnnotation.HIGHLIGHTED);

                // configure ruler
                if (oruler != null) {
                    oruler.addAnnotationType(strategyType);
                    oruler.setAnnotationTypeLayer(strategyType, 3);
                    oruler.setAnnotationTypeColor(strategyType,
                            color);
                    oruler.addAnnotationType(strategyType + BTSModelAnnotation.HIGHLIGHTED);
                    oruler.setAnnotationTypeLayer(strategyType + BTSModelAnnotation.HIGHLIGHTED, 5);
                    oruler.setAnnotationTypeColor(strategyType + BTSModelAnnotation.HIGHLIGHTED,
                            color);
                }
            }
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
        // default strategies
        if (!annotationBaseStrategyExists) {
            // Annotation
            AnnotationDrawingStrategy annotationStrategy = new AnnotationDrawingStrategy();
            painter.addDrawingStrategy(BTSConstants.ANNOTATION,
                    annotationStrategy);
            painter.setAnnotationTypeColor(BTSConstants.ANNOTATION,
                    BTSUIConstants.COLOR_ANNOTATTION);
            painter.addAnnotationType(BTSConstants.ANNOTATION,
                    BTSConstants.ANNOTATION);
            annotationStrategySet.add(BTSConstants.ANNOTATION);

            // Annotation highlighted
            AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
            painter.addDrawingStrategy(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
                    annotationHighlightedStrategy);
            painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
                    BTSUIConstants.COLOR_ANNOTATTION);
            painter.addAnnotationType(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
                    BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED);
            annotationStrategySet.add(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED);

            if (oruler != null) {
                oruler.addAnnotationType(BTSConstants.ANNOTATION);
                oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION, 3);
                oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION,
                        BTSUIConstants.COLOR_ANNOTATTION);
                oruler.addAnnotationType(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED);
                oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED, 5);
                oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
                        BTSUIConstants.COLOR_ANNOTATTION);
            }
        }

        if (!annotationRubrumStrategyExists) {
            // Annotation rumbrum
            RubrumDrawingStrategy rubrumStrategy = new RubrumDrawingStrategy();
            painter.addTextStyleStrategy(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
                    rubrumStrategy);
            painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
                    BTSUIConstants.COLOR_RUBRUM);
            painter.addAnnotationType(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
                    BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE);
            annotationStrategySet.add(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE);

            // Annotation rumbrum highlighted
            AnnotationHighlightedDrawingStrategy rubrumHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
            painter.addDrawingStrategy(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
                    rubrumHighlightedStrategy);
            painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
                    BTSUIConstants.COLOR_RUBRUM);
            painter.addAnnotationType(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
                    BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED);
            annotationStrategySet.add(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED);

            if (oruler != null) {
                oruler.addAnnotationType(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE);
                oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE, 3);
                oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION + "" + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
                        BTSUIConstants.COLOR_RUBRUM);
            }
        }
    }


}
