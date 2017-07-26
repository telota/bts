package org.bbaw.bts.core.services.corpus;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface BTSThsEntryService extends
        GenericCorpusObjectService<BTSThsEntry, String> {

    BTSAnnotation createNewAnnotationRelationPartOf(BTSCorpusObject annotatedObject);


}
