package org.bbaw.bts.ui.main.widgets;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.text.Collator;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class ObjectSelectionProposalProvider implements IContentProposalProvider {

    private final GeneralBTSObjectController generalObjectController;
    private BTSConfig configItem;
    private List<BTSObject> list;
    @Inject
    private Comparator<IContentProposal> comparator = new Comparator<IContentProposal>() {
            @Override
            public int compare(IContentProposal left, IContentProposal right) {
                if (left == null || right == null)
                    return 0;
                String labelLeft = left.getLabel();
                if (labelLeft == null)
                    return 0;
                return left.getLabel().compareTo(right.getLabel());
            }
        };

    private final BTSObject object;

    public ObjectSelectionProposalProvider(
            GeneralBTSObjectController passportEditorController,
            BTSConfig configItem,
            BTSObject object) {
        this.generalObjectController = passportEditorController;
        this.setConfigItem(configItem);
        this.object = object;
    }

    @Override
    public IContentProposal[] getProposals(String contents, int position) {
        if (contents.length() > 1) {
            list = loadList(contents);
        }

        List<ContentProposal> partialList = new Vector<>();
        if (list != null && !list.isEmpty()) {
            for (BTSObject o : list) {
                if (o.getName() != null && o.getName().startsWith(contents)
                        || o.get_id().equals(contents)) {
                    String desc = o.getName() + "\n" + o.get_id() + "\n" + o.getDBCollectionKey();
                    ContentProposal p = new ContentProposal(o.get_id(), o.getName(), desc);
                    partialList.add(p);
                }
            }

            Collections.sort(partialList, comparator);
        }
        return partialList.toArray(new IContentProposal[partialList.size()]);
    }

    private List<BTSObject> loadList(final String contents) {
        return generalObjectController.getObjectProposalsFor(
                (BTSConfigItem) configItem, contents, object, null);

    }

    public void setConfigItem(BTSConfig configItem) {
        this.configItem = configItem;
    }

}
