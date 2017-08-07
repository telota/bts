package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RestoreHandler2 {
    @Execute
    public void execute(
            @Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
            EditingDomainController editingDomainController, @Optional @Active MPart activePart) {
        System.out.println("restore");
        if (selection instanceof EObject) {
            EditingDomain ed = editingDomainController
                    .getEditingDomain(selection);
            if (ed != null) {
                Command command = SetCommand.create(ed, selection,
                        BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE,
                        BTSConstants.OBJECT_STATE_ACTIVE);
                ed.getCommandStack().execute(command);

            } else {
                ((AdministrativDataObject) selection)
                        .setState(BTSConstants.OBJECT_STATE_ACTIVE);
            }

            // General Command Controller... save!
            if (activePart != null) {

                Object o = activePart.getObject();
                if (o instanceof StructuredViewerProvider) {
                    StructuredViewerProvider viewerProvider = (StructuredViewerProvider) o;
                    viewerProvider.getActiveStructuredViewer().refresh();
                }
            }
        }
    }

    @CanExecute
    public boolean canExecute(
            @Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection,
            @Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_DELETE) Boolean mayDelete) {
        return mayDelete != null && mayDelete.booleanValue() && selection != null;
    }
}