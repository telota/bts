package org.bbaw.bts.ui.egy.textSign.support;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.draw2d.IFigure;

public interface ElementFigure extends IFigure {

    String SENTENCE_START = "SENTENCE_START";

    String SENTENCE_END = "SENTENCE_END";

    String MARKER = "MARKER";

    String WORD = "WORD";

    String LEMMA_CASE = "LEMMA_CASE";

    String AMBIVALENCE_START = "AMBIVALENCE_START";

    String AMBIVALENCE_END = "AMBIVALENCE_END";

    int getLength();

    Object getModelObject();

    void setModelObject(Object modelObject);

    String getType();

    void setType(String type);

    List<BTSObject> getRelatingObjects();

    void addRelatingObject(BTSObject relatingObject);

    List<BTSInterTextReference> getInterTextReferences();
}
