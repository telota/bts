package org.bbaw.bts.ui.commons.corpus.text;

import org.apache.commons.lang.WordUtils;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSCommentAnnotation extends BTSReferenceAnnotation {

	private BTSComment comment;

	public BTSCommentAnnotation(BTSIdentifiableItem item, BTSInterTextReference ref, BTSComment com) {
		super(item, ref, com);
		this.setComment(com);
	}

	public BTSCommentAnnotation(IXtextDocument doc, Issue issue, BTSIdentifiableItem item, BTSComment com) {
		super(CorpusUtils.getTypeIdentifier(com), doc, issue, item);
		this.setComment(com);
	}


	public BTSComment getComment() {
		return comment;
	}

    public BTSObject getRelatingObject() {
        return comment;
    }

	public void setComment(BTSComment comment) {
		this.comment = comment;
	}

	@Override
	public String getText() {
		if (comment != null)
		{
			String text = "";
			if (comment.getName() != null)
			{
				text=  comment.getName() + "\n";
			}
			if (comment.getComment() != null && !"".equals(comment.getComment()))
			{
				text += WordUtils.wrap(comment.getComment(), 60);
			}
			return text;
		}
		return super.getText();
	}
}
