package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSReferenceAnnotation extends BTSModelAnnotation {
    /* Just forward the constructors */
    public BTSReferenceAnnotation(String type, BTSIdentifiableItem model) {
        super(type, model);
	}

	public BTSReferenceAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSObject relatingObject) {
        super(model, interTextReference, relatingObject);
	}

	public BTSReferenceAnnotation(String type, IXtextDocument document, Issue issue, BTSIdentifiableItem modelObject) {
        super(type, document, issue, modelObject);
	}
}
