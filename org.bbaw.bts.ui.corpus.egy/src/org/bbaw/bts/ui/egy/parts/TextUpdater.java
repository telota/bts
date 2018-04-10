package org.bbaw.bts.ui.egy.parts;

import org.eclipse.e4.core.services.log.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.Position;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EList;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSReferenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLinkageAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSAnnotationAnnotation;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;


/** Class to generate a document string and accompanying annotations from a model object.
 *
 * This class takes a model object and renders it into text and an annotation model linking the parts of that text back
 * to the model.
 *
 * If given relating objects, this class will also update the relating object's temp sort key with their position in the
 * document so they can be displayed in-order in the relating objects panel on the right of the UI. Reference
 * annotations for relating objects are also added to the annotation model.
 */
public class TextUpdater {
	private static final String SENTENCE_SIGN = "\u00A7";
	private static final String AMBIVALENCE_START_SIGN = "\u0025";
	private static final String AMBIVALENCE_END_SIGN = "\u0025";
	private static final String LEMMA_CASE_TERMIAL = "case";
	private static final String LEMMA_CASE_SEPARATOR = "| ";
	private static final String WS = " ";
	private static final String LEMMA_CASE_INTERFIX = ": ";
	private static final String MARKER_START_SIGN = "\u0023";
	private static final String MARKER_END_SIGN = "\u0023";
	private static final String MARKER_INTERFIX = ": ";

    public static class LinkageData {
        public AnnotationModel amLinkage = new AnnotationModel(),
                               amReference = new AnnotationModel(),
                               amLemma = new AnnotationModel(),
                               amSentence = new AnnotationModel();
        /* This resolves to BTSIdentifiableItem instead of BTSSentenceItem since it also contains an ambivalence's
         * individual BTSLemmaCases which are BTSIdentifiableItems but no BTSSentenceItems. */
        public Map<BTSIdentifiableItem, BTSLinkageAnnotation> amap = new HashMap<>();
        public Map<BTSSenctence, BTSSentenceAnnotation> smap = new HashMap<>();
        public List<BTSReferenceAnnotation> rlist = new LinkedList<>();
    }

    /** Class used to track annotation positions while building the document content string.
     *
     * An object of this class concatenates Strings using a StringBuilder and tracks positions to generate matching
     * Annotations into an AnnotationModel.
     *
     * A TextBuilder has a separator that is automatically inserted between strings when using appendSeparated.
     */
    private class TextBuilder {
        @Inject private Logger logger; 

        /* Output foo */
        protected StringBuilder sb = new StringBuilder();
        protected LinkageData ld;

        /* Context */
        protected Map<String, List<BTSInterTextReference>> romap;
        protected TextBuilder parent;
        protected TextUpdater updater;
        protected String sep;

        /* Internal state */
        protected HashMap<BTSInterTextReference, BTSReferenceAnnotation> refAnnoCache = new HashMap<>();
        protected int lastPos = 0;
        protected int builderOffx = 0;
        protected boolean isEmpty = true;

        public TextBuilder(TextUpdater updater, Map<String, List<BTSInterTextReference>> romap, String sep) {
            this.updater = updater;
            this.romap = romap;
            this.sep = sep;
        }

        public String getContent() {
            return sb.toString();
        }

        public LinkageData getLinkageData() {
            return ld;
        }

        /* Stuff used for hierarchical builders. These are used to construct ambivalences, which may recursively contain
         * other stuff. */
        private TextBuilder(TextBuilder parent, TextUpdater updater, Map<String, List<BTSInterTextReference>> romap, String sep, int offx) {
            this(updater, romap, sep);
            this.parent = parent;
            this.builderOffx = offx;
            this.ld = parent.ld;
        }

        public TextBuilder subBuilder(String sep) {
            return new TextBuilder(this, updater, romap, sep, lastPos);
        }

        public void finalize(BTSIdentifiableItem item) {
            /* Transfer text content */
            parent.appendSeparated(getContent());
            parent.link(item);
        }
        /* End of hierarchy stuff. */

        /** Append a String to the TextBuilder directly, not updating annotation position information or inserting
         * separators */
        public TextBuilder append(String s) {
            sb.append(s);
            return this; /* for cascading calls: .append(...).append(...) */
        }

        /** Append a String to the TextBuilder using the separator and update annotation position information for
         * subsequent calls to lemmatize or link. */
        public TextBuilder appendSeparated(String s) {
            if (isEmpty)
                isEmpty = false;
            else
                sb.append(sep);
            lastPos = sb.length();
            sb.append(s);
            return this;
        }

        /** Link the last token added before this method was called to a bts model object.
         *
         * This produces a linkage annotation and creates or updates any reference annotations if necessary.
         */
        public void link(BTSIdentifiableItem item) {
            BTSLinkageAnnotation la = new BTSLinkageAnnotation(item);
            ld.amLinkage.addAnnotation(la, lastPosition());
            ld.amap.put(item, la);

            /* Check if there are comments, annotations or subtext pointing to this item. "pointer" can either be start
             * or end positions. */
            String id = item.get_id();
            if (!romap.containsKey(id))
                return;

            for (BTSInterTextReference ref : romap.get(id)) {
                String beg = ref.getBeginId(), end = ref.getEndId();

                if (id.equals(beg)) {
                    /* A reference begins on this object. Create a new annotation of the appropriate type and add it to
                     * the annotation model for this object only for the moment. If the reference goes beyond this
                     * object, the annotation will be extended below in a later call. */
                    BTSReferenceAnnotation ra = updater.createReferenceAnnotation(item, ref);
                    ld.rlist.add(ra);
                    ld.amReference.addAnnotation(ra, lastPosition());

                    if (end != null && !end.equals(id))
                        refAnnoCache.put(ref, ra);

                } else { /* id = end */
                    /* Fetch an annotation previously added to the model and extend it to the end of the current
                     * object's syntax token. If no annotation can be found that can be due to an invalid start id or
                     * due to the start id pointing somewhere else, such as somewhere outside an ambivalence we're
                     * processing right now or into another document. These cases are ignored, but first a nice warning
                     * message is emitted into eclipse's log. */
                    BTSReferenceAnnotation anno = refAnnoCache.get(ref);
                    if (anno == null) {
                        logger.warn(String.format(
                                "Reference %s has end %s pointing to an object in a different context than beginning %s.",
                                ((BTSRelation)ref.eContainer()).get_id(), end, beg));
                        continue;
                    }
                    refAnnoCache.remove(ref);

                    int start = ld.amReference.getPosition(anno).getOffset();
                    /* Note: We have to store the annotation positions here and re-add the annotation to the
                     * AnnotationModel being built since we cannot use modifyAnnotationPosition due to a bug(?) in
                     * eclipse.jface.text.  modifyAnnotationPosition barfs on a null pointer when you tell it to
                     * modify the position of an annotation while no document is connected. */
                    ld.amReference.removeAnnotation(anno);
                    ld.amReference.addAnnotation(anno, new Position(start, sb.length() - start));
                }
            }
        } 
        
        public void linkSentence(BTSSenctence sent) {
            BTSSentenceAnnotation sa = new BTSSentenceAnnotation(sent);
            ld.amSentence.addAnnotation(sa, lastPosition());
            ld.smap.put(sent, sa);
        }

        /** Link the last token added before this method was called to a lemma entry by lemma ID.
         *
         * Lemma entries are cached for performance. If the lemma entry ID cannot be found, still create an annotation
         * but have it point to null. This makes sense as we still want words to be highlighted even if they are
         * lemmatized with invalid lemma ids.
         * 
         * TODO possibly highlight them in a different color so the user can see at a glance that there is a problem.
         */
        public void lemmatize(BTSWord word, String lemmaId) {
            ld.amLemma.addAnnotation(new BTSLemmaAnnotation(word, updater.findLemma(lemmaId)), lastPosition());
        }

        /** Get the Position of the last appended text part. */
        private Position lastPosition() {
            return new Position(lastPos, sb.length()-lastPos);
        }
    }


    @Inject private Logger logger; 
	@Inject private BTSLemmaEntryService lemmaService; 

	private int roCounter = 0;
    protected HashMap<String, BTSLemmaEntry> lemmaCache = new HashMap<>();
    private TextBuilder tb;

    
    /* public API */
    public TextUpdater(BTSLemmaEntryService lemmaService) { /* For generating text without relating object annotations */
        this.tb = new TextBuilder(this, Collections.<String, List<BTSInterTextReference>>emptyMap(), "\n");
        this.lemmaService = lemmaService;
    }

    public TextUpdater(BTSLemmaEntryService lemmaService, Map<String, List<BTSInterTextReference>> relatingObjectsMap) {
        this.tb = new TextBuilder(this, relatingObjectsMap, "\n");
        this.lemmaService = lemmaService;
        /* Reset temp sort keys for all relating objects */
        for (List<BTSInterTextReference> l : relatingObjectsMap.values()) {
            for (BTSInterTextReference ref : l)
                ((BTSObject)ref.eContainer().eContainer()).setTempSortKey(-1);
        }
    }

    public String getContent() {
        return tb.getContent();
    }

    public LinkageData getLinkageData() { return tb.getLinkageData(); }

    protected BTSLemmaEntry findLemma(String lemmaId) {
        if (lemmaCache.containsKey(lemmaId))
            return lemmaCache.get(lemmaId);

        BTSLemmaEntry entry = lemmaService.find(lemmaId, /*montior*/null);
        lemmaCache.put(lemmaId, entry);
        return entry;
    }

    private BTSReferenceAnnotation createReferenceAnnotation(BTSIdentifiableItem item, BTSInterTextReference ref) {
        BTSObject pobj = (BTSObject)ref.eContainer().eContainer(); /* Whatever bts object contains the reference */

        /* Update temp sort key. Since this method is called on the references in order of their appearance in the
         * text, this results in the references being numbered in order of their appearance. tempSortKey is then
         * used to display them in-order next to the text in the UI */
        roCounter++;
        if (pobj.getTempSortKey() < 0)
            pobj.setTempSortKey(roCounter);

        if (pobj instanceof BTSAnnotation)
            return new BTSAnnotationAnnotation(item, ref, (BTSAnnotation)pobj);

        if (pobj instanceof BTSText)
            return new BTSSubtextAnnotation(item, ref, (BTSText)pobj);

        if (pobj instanceof BTSComment)
            return new BTSCommentAnnotation(item, ref, (BTSComment)pobj);

        logger.warn(String.format(
                "Reference %s is pointing to an object of unhandled type %s.",
                ((BTSRelation)ref.eContainer()).get_id(), pobj.getClass().toString()));
        return null;
    }

	public void generateFromModel(BTSTextContent textContent) {
        boolean first = true;
		for (BTSTextItems item : textContent.getTextItems()) {
            BTSSenctence sentence = (BTSSenctence)item; /* Sentences are the only textItems */

            TextBuilder sub = tb.subBuilder(WS);
            sub.append(SENTENCE_SIGN);
            for (BTSSentenceItem sitem : sentence.getSentenceItems())
                appendAndLink(sub, sitem);
            sub.append(SENTENCE_SIGN);
            sub.finalize(sentence);
		}
	}

	private void appendAndLink(TextBuilder tb, BTSIdentifiableItem item){
		if (item instanceof BTSWord) {
            BTSWord word = (BTSWord)item;
			tb.appendSeparated(stringify(word));
            String lkey = word.getLKey();
            if (lkey != null && !lkey.isEmpty())
                tb.lemmatize(word, lkey);
            tb.link(item);
            return;
        }

        if (item instanceof BTSMarker) {
			tb.appendSeparated(stringify((BTSMarker)item));
            tb.link(item);
            return;
        }

		if (item instanceof BTSAmbivalence) {
            BTSAmbivalence ambivalence = (BTSAmbivalence)item;
            TextBuilder ambb = tb.subBuilder(LEMMA_CASE_SEPARATOR);
            ambb.append(AMBIVALENCE_START_SIGN);

            if (ambivalence.getCases() != null) {
                for (BTSLemmaCase amCase : ambivalence.getCases()) {
                    TextBuilder caseb = ambb.subBuilder(WS);
                    caseb.append(LEMMA_CASE_TERMIAL + WS);
                    if (amCase.getName() != null)
                        caseb.append(amCase.getName());
                    caseb.append(LEMMA_CASE_INTERFIX);

                    if (amCase.getScenario() != null)
                        for (BTSAmbivalenceItem citem : amCase.getScenario())
                            appendAndLink(caseb, citem);

                    caseb.finalize(amCase);
                }
            }

            ambb.append(AMBIVALENCE_END_SIGN);
            ambb.finalize(item);
            return;
        }
	}

    /* Produce string representations of elementary objects */
	private String stringify(BTSWord word) {
        String wc = word.getWChar();
		if (wc == null)
            return "";
        return wc.trim();
	}

	private String stringify(BTSMarker marker) {
        String t = marker.getType();
        if (t == null)
            return "";

        switch (t) {
            case BTSConstants.TEXT_VERS_FRONTIER_MARKER:                return BTSConstants.VERS_FRONTER_MARKER_SIGN;
			case BTSConstants.TEXT_VERS_BREAK_MARKER:                   return BTSConstants.VERS_BREAK_MARKER_SIGN;
			case BTSConstants.BROKEN_VERS_MARKER:                       return BTSConstants.BROKEN_VERS_MARKER_SIGN;
			case BTSConstants.DELETED_VERS_MARKER:                      return BTSConstants.DELETED_VERS_MARKER_SIGN;
			case BTSConstants.DISPUTABLE_VERS_MARKER:                   return BTSConstants.DISPUTALBE_VERS_MARKER_SIGN;
			case BTSConstants.MISSING_VERS_MARKER:                      return BTSConstants.MISSING_VERS_MARKER_SIGN;
			case BTSConstants.RESTORATIONOVERRASURMARKER:               return BTSConstants.RESTORATIONOVERRASURMARKER_SIGN;
			case BTSConstants.ANCIENTEXPANDEDMARKER:                    return BTSConstants.ANCIENTEXPANDEDMARKER_SIGN;
			case BTSConstants.RASURMARKER:                              return BTSConstants.RASURMARKER_SIGN;
			case BTSConstants.EMENDATIONVERSMARKER:                     return BTSConstants.EMENDATIONVERSMARKER_SIGN;
			case BTSConstants.DESTROYEDVERSFRONTIERMARKER:              return BTSConstants.DESTROYEDVERSFRONTIERMARKER_SIGN;
			case BTSConstants.PARTIALDESTROYEDVERSMARKER:               return BTSConstants.PARTIALDESTROYEDVERSMARKER_SIGN;
			case BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER:     return BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN;
			case BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER:    return BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN;
			case BTSConstants.DISPUTABLEDESTROYEDVERSMARKER:            return BTSConstants.DISPUTABLEDESTROYEDVERSMARKER_SIGN;
			case BTSConstants.DELETEDDISPUTABLEVERSMARKER:              return BTSConstants.DELETEDDISPUTABLEVERSMARKER_SIGN;
			case BTSConstants.MISSINGDISPUTABLEVERSMARKER:              return BTSConstants.MISSINGDISPUTABLEVERSMARKER_SIGN;
			case BTSConstants.DISPUTABLEDELETEDVERSMARKER:              return BTSConstants.DISPUTABLEDELETEDVERSMARKER_SIGN;
			case BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER:        return BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER_SIGN;
			case BTSConstants.DESTROYEDDELETEDVERSMARKER:               return BTSConstants.DESTROYEDDELETEDVERSMARKER_SIGN;
			case BTSConstants.DELETEDDESTROYEDVERSMARKER:               return BTSConstants.DELETEDDESTROYEDVERSMARKER_SIGN;
			case BTSConstants.DESTRUCTION_MARKER:
				return "--" + marker.getName() + "--";
            default:
                t = MARKER_START_SIGN + t;
				if (marker.getName() != null && !marker.getName().isEmpty())
					t += MARKER_INTERFIX + marker.getName();
				return t + MARKER_END_SIGN;
		}
	}
}
