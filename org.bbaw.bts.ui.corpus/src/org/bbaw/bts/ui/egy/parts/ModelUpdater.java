package org.bbaw.bts.ui.egy.parts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLinkageAnnotation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/** Update data model from parsed text and annotations
 *
 * This class encapsulates some rather involved logic that is used to synchronize text changes from the text editor back
 * into the data model.
 *
 * Every BTS object (word, sentence etc.) that is maninfest in the text displayed in the text editor is linked to its
 * text location with a BTSLinkageAnnotation on the text's AnnotationModel. These annotations "follow" their linked
 * text with changes. Insertion of a word shifts all later annotations to the right, change of a word's length changes
 * the length of the corresponding annotation etc. This change tracking is all done by jface, which means it is a rather
 * simple way to avoid using a full-blown diff algorithm here. This seems a bit of an abuse to jface's annotation system
 * to me (Sebastian) but I'd say that is justified by the decrease in complexity it brings.
 *
 * This class contains logic that will re-synchronize the "model" object tree back to the changes of the user in the
 * text editor. This is done in several steps. First, in mapFromAnnotationModel the ranges and objects for all
 * BTSLinkageAnnotations are extracted and stored in HashMap amap.
 *
 * Second, the old object tree is completely deleted with the objects living on in amap.
 * 
 * Third, synchronize iterates over the grammar parse tree re-constructing the bts object tree. Here, if a token can be
 * linked to an object from the old object tree the old object is re-used and perhaps changed. If no object from the old
 * tree can be found, a new one is created instead and inserted into the new tree. In this case, a new
 * BTSLinkageAnnotation is added to the model.
 *
 * Fourth and lastly, any BTSLinkageAnnotations that have become superfluous are removed.
 *
 * FIXME Update this doc
 * TODO rework all of this to use plain jface document positions instead of annotations. Positions provide all that is
 * needed here since linkage annotations are never rendered anyway.
 */
public class ModelUpdater {
	private final static Pattern lemmaPattern = Pattern.compile("(?:case\\s+)([^:]+)(?::\\s*)");
	private final static Pattern destructionMarkerPattern = Pattern.compile("--([^-]+)--");

    /* Note: Position is a misnomer. It is rather a range of format (offx, length) */
	private HashMap<Position, BTSLinkageAnnotation> amap = new HashMap<>(100);
	private HashMap<Position, BTSSentenceAnnotation> smap = new HashMap<>(10);
    private TextUpdater.LinkageData ld;

    public ModelUpdater(TextUpdater.LinkageData ld) {
        this.ld = ld;
    }

	public void synchronize(BTSTextContent target, TextContent parsed) {
        /* Cache annotations from am to amap. In the process remove any obvious inconsistencies (zero-length and
         * duplicate annotations with the same offset and length) */
		cacheObjects(ld.amLinkage, amap);
		cacheObjects(ld.amSentence, smap);

        /* Re-use the target object to keep its ID and other fields, but re-construct the object tree contained by it. */
        target.getTextItems().clear();
        int idx = 0;
        for (TextItem gitem : parsed.getItems()) {
            Sentence gsent = (Sentence)gitem; /* There are no TextItems but Sentences */

            /* Workaround: If one enters only one sentence, xtext adds a second one without items.
             * This is probably caused by a grammar bug.
             *
             * Here, we prematurely abort the loop on the last sentence if it is empty.
             */
            boolean lastSentence = idx == parsed.getItems().size()-1;
            boolean emptySentence = gsent.getItems().isEmpty();
            if (lastSentence && emptySentence)
                break;
            idx++;
            /* End of workaround */

            /* Lookup cached object from annotations. If none can be found, create a new one and link it into the
             * document via the annotation model */
            BTSSenctence msent = (BTSSenctence)fetchObjectForNode(gsent, BTSSenctence.class);
            if (msent == null) {
                if (emptySentence) /* TODO why? */
                    continue;
                msent = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
                linkSentence(gsent, msent);
            }

            /* Same as above for target, keep the object but re-construct the content tree. */
            msent.getSentenceItems().clear();
            for (SentenceItem sent_gitem : gsent.getItems())
                /* Recursively descend into the syntax tree */
                msent.getSentenceItems().add(updateItem(sent_gitem));

            target.getTextItems().add(msent);
        }

        /* Remove any annotations that were not used during reconstruction of the object tree. The objects they contain
         * have already been unlinked from the object tree above.
         *
         * amap and smap are updated in fetchObjectForNode. */
        for (BTSLinkageAnnotation a : amap.values())
            ld.amLinkage.removeAnnotation(a);
        for (BTSSentenceAnnotation a : smap.values())
            ld.amSentence.removeAnnotation(a);
	}

	private BTSSentenceItem updateItem(SentenceItem item) {
		if (item instanceof Word)
			return updateWord((Word)item);
		if (item instanceof AbstractMarker)
			return updateMarker((AbstractMarker)item);
		if (item instanceof Ambivalence)
			return updateAmbivalence((Ambivalence)item);
        throw new IllegalArgumentException(String.format("Invalid type %s for updateItem.", item.getClass().toString()));
	}

	private BTSAmbivalence updateAmbivalence(Ambivalence gambi) {
		BTSAmbivalence mambi = (BTSAmbivalence)fetchObjectForNode(gambi, BTSAmbivalence.class);
		if (mambi == null) {
			mambi = BtsCorpusModelFactory.eINSTANCE.createBTSAmbivalence();
            link(gambi, mambi);
        }

		mambi.getCases().clear();
		for (Case gcase : gambi.getCases()) {
			BTSLemmaCase mcase = (BTSLemmaCase)fetchObjectForNode(gcase, BTSLemmaCase.class); 
			if (mcase == null) {
				mcase = BtsCorpusModelFactory.eINSTANCE.createBTSLemmaCase();
                link(gcase, mcase);
            }

			mcase.setName(extractLemmaCaseName(gcase.getName()));
			mcase.getScenario().clear();
			for (SentenceItemNoAmbivalence gitem : gcase.getItems())
                /* Casting bonanza! */
				mcase.getScenario().add((BTSAmbivalenceItem)updateItem((SentenceItem)gitem));

            mambi.getCases().add(mcase);
		}

		return mambi;
	}

	private BTSWord updateWord(Word gword) {
		BTSWord mword = (BTSWord)fetchObjectForNode(gword, BTSWord.class);
		if (mword == null) {
			mword = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
            link(gword, mword);
        }

		INode node = NodeModelUtils.getNode(gword);
        mword.setWChar(node.getText());

		return mword;
	}

	private BTSMarker updateMarker(AbstractMarker gmark) {
		BTSMarker mmark = fetchObjectForNode(gmark, BTSMarker.class);
		if (mmark == null) {
			mmark = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
            link(gmark, mmark);
        }

		if (gmark instanceof Marker) {
			Marker m = (Marker)gmark;
			if (m.getType() == null) {
                mmark.setType(null);
                return mmark;
            }

            String type = m.getType();
            type = type.substring(1, type.length()-1); /* strip delimiters */
            String[] parts = type.split(":");
            mmark.setType(parts[0]);
            if (parts.length > 0)
                mmark.setName(parts[1].trim());
			
		} else if (gmark instanceof VersbreakMarker)               { mmark.setType(BTSConstants.TEXT_VERS_BREAK_MARKER);
		} else if (gmark instanceof VersFrontierMarker)            { mmark.setType(BTSConstants.TEXT_VERS_FRONTIER_MARKER);
		} else if (gmark instanceof BrokenVersbreakMarker)         { mmark.setType(BTSConstants.BROKEN_VERS_MARKER);
		} else if (gmark instanceof DestroyedVersMarker)           { mmark.setType(BTSConstants.DESTROYED_VERS_MARKER);
		} else if (gmark instanceof DisputableVersMarker)          { mmark.setType(BTSConstants.DISPUTABLE_VERS_MARKER);
		} else if (gmark instanceof DeletedVersMarker)             { mmark.setType(BTSConstants.DELETED_VERS_MARKER);
		} else if (gmark instanceof MissingVersMarker)             { mmark.setType(BTSConstants.MISSING_VERS_MARKER);
		} else if (gmark instanceof DestroyedVersMarker)           { mmark.setType(BTSConstants.DESTROYEDVERSMARKER);
		} else if (gmark instanceof DeletedVersMarker)             { mmark.setType(BTSConstants.DELETEDVERSMARKER);
		} else if (gmark instanceof DisputableVersMarker)          { mmark.setType(BTSConstants.DISPUTABLEVERSMARKER);
		} else if (gmark instanceof RestorationOverRasurMarker)    { mmark.setType(BTSConstants.RESTORATIONOVERRASURMARKER);
		} else if (gmark instanceof AncientExpandedMarker)         { mmark.setType(BTSConstants.ANCIENTEXPANDEDMARKER);
		} else if (gmark instanceof RasurMarker)                   { mmark.setType(BTSConstants.RASURMARKER);
		} else if (gmark instanceof EmendationVersMarker)          { mmark.setType(BTSConstants.EMENDATIONVERSMARKER);
		} else if (gmark instanceof DestroyedVersFrontierMarker)   { mmark.setType(BTSConstants.DESTROYEDVERSFRONTIERMARKER);
		} else if (gmark instanceof PartialDestroyedVersMarker)    { mmark.setType(BTSConstants.PARTIALDESTROYEDVERSMARKER);
		} else if (gmark instanceof DestructionMarker) {
            mmark.setType(BTSConstants.DESTRUCTION_MARKER);

			Matcher m = destructionMarkerPattern.matcher(((DestructionMarker) gmark).getType());
			if (m.find())
				mmark.setName(m.group(1));
		}

		return mmark;
	}

    /* Cache linkage or sentence annotations and positions from an annotation model. If two or more annotations with the
     * same position (offset and length) are found, keep the first and remove the rest. Remove any zero-length
     * annotations from the model.
     */
	private <E extends BTSModelAnnotation> void cacheObjects(AnnotationModel am, HashMap<Position, E> outmap) {
		Iterator<Annotation> it = am.getAnnotationIterator();
		while (it.hasNext()) {
			Annotation a = it.next();
			if (!(a instanceof BTSLinkageAnnotation))
                continue;
            E an = (E)a;

            BTSIdentifiableItem mod = an.getModel();
            Position pos = am.getPosition(an);

            if (pos.getLength() == 0)
                am.removeAnnotation(an);

            /* Workaround for the first sentence in the document whose offset is mysteriously wrong */
            if ((mod instanceof BTSSenctence) && pos.getOffset() == 1)
                pos = new Position(0, pos.getLength());

            if (outmap.containsKey(pos))
                am.removeAnnotation(an);
            else
                outmap.put(pos, an);
		}
	}

    /* Lookup whether an object is cached in an annotation for the given position. The annotation is removed from amap
     * or smap to mark it "used".
     *
     * If no object is found or what is found is of the wrong type, return null.
     */
	private <E> E fetchObjectForNode(EObject grammarObj, Class<E> clazz) {
        INode node = NodeModelUtils.getNode(grammarObj);
		int offx = node.getOffset(), len = node.getLength();
		Position pos = new Position(offx, len);

		BTSModelAnnotation found = amap.get(pos);
        amap.remove(pos);

        if (found == null)
            found = smap.get(pos);
        smap.remove(pos);

        if (found == null)
            return null;

        /* FIXME the following should not be used as a fallback */
        /* FIXME should this be here at all? */
		//if (found == null && (grammarObj instanceof Marker)) // cut away Marker beginnings and endings
        //    found = amap.get(new Position(offx+1, len-1));

        Object obj = found.getModel();
        if (clazz.isInstance(obj))
            return (E)obj;
        return null;
	}

    private void link(EObject grammarObj, BTSIdentifiableItem item) {
        /* Create a new BTSLinkageAnnotation to link a newly created BTS object to its text region.
         *
         * This is a bit more tricky than it sounds. We're effectively duplicating the function of
         * BTSTextEditorControllerImpl.TextBuilder.link here. This is problematic as that not only creates
         * BTSLinkageAnnotations but also lemma annotations and annotations for inter-text references such as comments.
         * Luckily, we can ignore the latter two here since newly created words are not yet lemmatized by default and
         * any inter-text reference including this text location would already have grown due to the magic of jface.
         */
        INode node = NodeModelUtils.getNode(grammarObj);
        ld.amLinkage.addAnnotation(new BTSLinkageAnnotation(item), new Position(node.getOffset(), node.getLength()));
    }

    private void linkSentence(EObject grammarObj, BTSSenctence sent) {
        /* Same as link, but for sentence annotations */
        INode node = NodeModelUtils.getNode(grammarObj);
        ld.amSentence.addAnnotation(new BTSSentenceAnnotation(sent), new Position(node.getOffset(), node.getLength()));
    }

	private String extractLemmaCaseName(String name) {
        name = name.trim();

		Matcher m = lemmaPattern.matcher(name);
		if (m.matches())
			return m.group(1);

		return name;
	}
}
