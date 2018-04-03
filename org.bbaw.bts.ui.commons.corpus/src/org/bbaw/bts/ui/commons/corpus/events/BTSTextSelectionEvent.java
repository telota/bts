package org.bbaw.bts.ui.commons.corpus.events;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
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
	private List<BTSSentenceItem> selectedItems = new Vector<BTSSentenceItem>(4);
	private List<BTSSenctence> selectedSentences = new Vector<BTSSenctence>(4);
    private List<BTSModelAnnotation> relatedObjectAnnotations = new Vector<BTSModelAnnotation>(4);
	private String startId;
	private String endId;
	private TypedEvent originalEvent;
	private BTSObject parentObject;
    private BTSSentenceItem start;
    private BTSSentenceItem end;

    public BTSTextSelectionEvent(CaretEvent evt, BTSObject parent) {
        this((TypedEvent)evt, parent);
        /* We're offsetting the event's positions since xtext seems to use one-based indexing for annotation
         * offsets while the selection's offset is zero-based. In xtext, an annotation at the location left of the
         * first character has the index 1. The corresponding selection has the start offset ("x") 0. Internally,
         * we use xtext's frame of reference here since we're handling lots of xtext offsets and only one
         * selection.
		 *
         * TODO I don't quite understand just *why* things are this way. - Sebastian
		 */
        x = evt.caretOffset+1;
        y = evt.caretOffset+1;
    }

    public BTSTextSelectionEvent(SelectionEvent evt, BTSObject parent) {
        this((TypedEvent)evt, parent);
        /* See above constructor for comment on offset */
        x = evt.x+1;
        y = evt.y+1;
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

    public String toString() {
        return String.format("<BTSTextSelectionEvent parent=%s, x=%d, y=%d, start=%s, end=%s, text=\"%s\">", parentObject.toString(), x, y, startId, endId, text);
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

    /** Returns the items selected in this event. Note that this is empty unless it was first populated by someone.
     * 
     * The items are in transliterated sentence order. Note that the result is a flattened list, i.e. as illustrated below with the selected part being the
     * part between both '!', you will end up with the following selectedItems.
     *
     * in: [foo, Ambivalence(case1=foo !bar, case2=bar baz), frob, Ambivalence(case1=frob, case2=narf) blep! frob]
     * out: [frob Ambivalence(case1=frob, case2=narf) blep]
     */
	public List<BTSSentenceItem> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<BTSSentenceItem> selectedItems) {
		this.selectedItems = selectedItems;
	}

    /* Returns the sentences selected in this event. */
    public List<BTSSenctence> getSelectedSentences() {
		return selectedSentences;
	}

	public void setSelectedSentences(List<BTSSenctence> selectedSentences) {
		this.selectedSentences = selectedSentences;
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

    public BTSSentenceItem getStart() {
        return start;
    }

    public void setStart(BTSSentenceItem start) {
        this.start = start;
    }
    
    public BTSSentenceItem getEnd() {
        return end;
    }

    public void setEnd(BTSSentenceItem end) {
        this.end = end;
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

    public List<BTSModelAnnotation> getRelatedObjectAnnotations() {
        return relatedObjectAnnotations;
    }

    public void setRelatedObjectAnnotations(List<BTSModelAnnotation> foo) {
        relatedObjectAnnotations = foo;
    }

    public boolean isCursorEvent() {
        /* HACK */
        return x == y;
    }
}
