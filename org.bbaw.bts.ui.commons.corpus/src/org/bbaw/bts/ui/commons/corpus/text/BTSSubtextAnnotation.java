package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSSubtextAnnotation extends BTSReferenceAnnotation {

	public BTSSubtextAnnotation(BTSIdentifiableItem model, BTSInterTextReference ref, BTSText subtext) {
		super(model, ref, subtext);
		this.setRelatingObject(subtext);
	}

	public BTSSubtextAnnotation(IXtextDocument doc, Issue issue, BTSIdentifiableItem item, BTSText subtext) {
		super(CorpusUtils.getTypeIdentifier(subtext), doc, issue, item);
		this.setRelatingObject(subtext);
	}
}
