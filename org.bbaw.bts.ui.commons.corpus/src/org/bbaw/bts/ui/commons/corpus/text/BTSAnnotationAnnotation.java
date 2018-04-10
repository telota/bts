package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSAnnotationAnnotation extends BTSReferenceAnnotation {

	
	public BTSAnnotationAnnotation(IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSAnnotation anno) {
		super(CorpusUtils.getTypeIdentifier(anno), document, issue, modelObject);
		setRelatingObject(anno);
        if ("rubrum".equalsIgnoreCase(anno.getType()))
            setText("org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum");
	}

	public BTSAnnotationAnnotation(BTSIdentifiableItem item,
			BTSInterTextReference interTextReference, BTSAnnotation relatingObject) {
		super(item, interTextReference, relatingObject);
	}
	
	@Override
	public String getType() {
		return super.getType();
	}
}
