package org.bbaw.bts.ui.commons.corpus.events;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.widgets.Event;

public class BTSTextSelectionEvent extends Event {
	
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(4);
	private List<BTSModelAnnotation> textAnnotations = new Vector<BTSModelAnnotation>(4);
	
	private List<BTSInterTextReference> interTextReferences = new Vector<BTSInterTextReference>(4);
	
	private List<BTSIdentifiableItem> selectedItems = new Vector<BTSIdentifiableItem>(4);
	
	private String startId;
	
	private String endId;
	private TypedEvent originalEvent;
	
	private BTSObject parentObject;

    public BTSTextSelectionEvent(CaretEvent evt, BTSObject parent) {
        this((TypedEvent)evt, parent);
        x = evt.caretOffset;
        y = evt.caretOffset;
    }

    public BTSTextSelectionEvent(SelectionEvent evt, BTSObject parent) {
        this((TypedEvent)evt, parent);
        x = evt.x;
        y = evt.y;
        text = evt.text;
    }

    public BTSTextSelectionEvent(TextSelection sel, BTSObject parent) {
		parentObject = parent;
        x = sel.getOffset();
        y = x + sel.getLength();
        text = sel.getText();
	}

	public BTSTextSelectionEvent(TypedEvent evt, BTSObject parent) {
		originalEvent = evt;
		display = evt.display;
		widget = evt.widget;
		time = evt.time;
		parentObject = parent;
    }

	public List<BTSObject> getRelatingObjects() {
		return relatingObjects;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	public List<BTSModelAnnotation> getTextAnnotations() {
		return textAnnotations;
	}

	public void setTextAnnotations(List<BTSModelAnnotation> textAnnotations) {
		this.textAnnotations = textAnnotations;
	}

	public List<BTSInterTextReference> getInterTextReferences() {
		return interTextReferences;
	}

	public void setInterTextReferences(
			List<BTSInterTextReference> interTextReferences) {
		this.interTextReferences = interTextReferences;
	}

	public List<BTSIdentifiableItem> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<BTSIdentifiableItem> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public String getStartId() {
		return startId;
	}

	public void setStartId(String startId) {
		this.startId = startId;
	}

	public String getEndId() {
		return endId;
	}

	public void setEndId(String endId) {
		this.endId = endId;
	}

	public TypedEvent getOriginalEvent() {
		return originalEvent;
	}

	public void setOriginalEvent(TypedEvent originalEvent) {
		this.originalEvent = originalEvent;
	}

	public BTSObject getParentObject() {
		return parentObject;
	}

	public void setParentObject(BTSObject parentObject) {
		this.parentObject = parentObject;
	}
	
}
