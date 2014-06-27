package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class AnnotationAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotation";

	public static final String TYPE_RUBRUM = "org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum";

	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.annotation.highlighted";;

	private String type = TYPE;
	private BTSAnnotation annotation;

	private String cachedType;

	public AnnotationAnnotation(IXtextDocument document, Issue issue,
			Object modelObject, BTSAnnotation btsAnnotation) {
		super(TYPE, document, issue, modelObject);
		this.setAnnotation(btsAnnotation);
	}

	public AnnotationAnnotation(IXtextDocument document, String type,
			Issue issue, Object modelObject, BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setAnnotation(btsAnnotation);
	}

	@Override
	public String getType() {
		if (super.getType() == null)
		{
			return TYPE_RUBRUM;
		}
		return super.getType();
	}

	public BTSAnnotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(BTSAnnotation annotation) {
		this.annotation = annotation;
	}

	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		// // TODO Auto-generated method stub
		// super.paint(gc, canvas, bounds);
	}

	@Override
	public void setHighlighted(boolean highlighted) {
		if (highlighted)
		{
			cachedType = this.type;
			setType(TYPE_HIGHLIGHTED);
		}
		else
		{
			setType(cachedType);
		}
		
	}
}
