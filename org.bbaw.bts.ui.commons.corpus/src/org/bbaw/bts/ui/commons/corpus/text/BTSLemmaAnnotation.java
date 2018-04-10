package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;

public class BTSLemmaAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";

	public BTSLemmaAnnotation(String type, BTSIdentifiableItem model) {
		super(type, model);
	}

	public BTSLemmaAnnotation(BTSIdentifiableItem model) {
		super(TYPE, model);
	}

	public BTSLemmaAnnotation(BTSIdentifiableItem model, BTSLemmaEntry lemma) {
		super(TYPE, model);
        setRelatingObject(lemma);
	}
}
