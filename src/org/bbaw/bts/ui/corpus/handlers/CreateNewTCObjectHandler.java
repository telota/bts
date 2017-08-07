package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewTCObjectHandler {

    @Execute
    public void execute(CorpusNavigatorController corpusNavigatorController, EventBroker eventBroker,
                        @Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection) {
        BTSTCObject object = corpusNavigatorController.createNewTCObject(selection);
        object.setName("Object1");
        eventBroker.post("model_new/asyncEvent", object);
    }

    @CanExecute
    public boolean canExecute(
            @Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection) {
        return (selection instanceof BTSCorpusObject && !(selection instanceof BTSAnnotation));
    }

}