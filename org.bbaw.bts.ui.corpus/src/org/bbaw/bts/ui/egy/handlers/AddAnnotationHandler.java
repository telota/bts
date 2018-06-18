package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class AddAnnotationHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event,
			@Optional @Named("annotationTypePath") String annotationTypePath,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			CorpusNavigatorController corpusNavigatorController,
			IEclipseContext context) {
			BTSObject dbbaseObject = (BTSObject) event.data;
		
			if (dbbaseObject != null)
			{
				final BTSAnnotation object = corpusNavigatorController
						.createNewAnnotation((BTSCorpusObject) dbbaseObject, annotationTypePath);
				BTSRelation rel = null;
				if (object.getRelations().isEmpty())
				{
					rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
				}
				else
				{
					rel = object.getRelations().get(0);
				}
	
				rel.setObjectId(dbbaseObject.get_id());
				object.getRelations().add(rel);
				BTSInterTextReference ref = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
				ref.setBeginId(event.getStartId());
				ref.setEndId(event.getEndId());
				rel.getParts().add(ref);

				IEclipseContext child = context.createChild();
				child.set(BTSObject.class, (BTSObject)object);
				child.set(Shell.class, shell);
				PassportEditorDialog dialog = ContextInjectionFactory.make(
						PassportEditorDialog.class, child);
				dialog.setEditable(true);
				int res = dialog.open();
				if (res == SWT.DEFAULT || res == 1) {
					// if cancelled, annotation does not get saved.
				} else {
					// passport editor does the saving already.
					//corpusNavigatorController.save(object);
				}
				child.dispose();

			}
			// FIXME eventBroker.post("model_add/BTSAnnotation", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event) {
		return (!event.getSelectedItems().isEmpty());
	}

}