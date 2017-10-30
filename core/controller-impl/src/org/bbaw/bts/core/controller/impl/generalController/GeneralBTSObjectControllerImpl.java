package org.bbaw.bts.core.controller.impl.generalController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.eclipse.core.runtime.IProgressMonitor;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;

public class GeneralBTSObjectControllerImpl implements GeneralBTSObjectController {

    @Inject
    private BTSConfigurationController configurationController;

    @Inject
    private BTSProjectService projectService;

    @Inject
    private GeneralBTSObjectService objectService;

    private List<BTSObject> getTypedObjectProposalsFor(String text, String className, IProgressMonitor monitor) {
        BTSQueryRequest query = new BTSQueryRequest(text);
        query.setQueryBuilder(QueryBuilders.boolQuery()
                .must(QueryBuilders.matchPhrasePrefixQuery("name", text)));
        // try and lookup objects by id first
        query.setIdQuery(true);
        List<BTSObject> result = queryObjects(query, BTSConstants.OBJECT_STATE_ACTIVE,
                false, className, monitor);
        if (result != null && !result.isEmpty()) {
            return result;
        } else {
            // if id lookup fails, query object names
            query.setIdQuery(false);
            result = queryObjects(query, BTSConstants.OBJECT_STATE_ACTIVE,
                    false, className, monitor);
            if (result != null) {
                return result;
            }
        }
        return new Vector<>(0);
    }

    @Override
    public List<BTSObject> getObjectProposalsFor(
            BTSConfigItem configItem, String text, BTSObject object, IProgressMonitor monitor) {
        List<BTSObject> list = new Vector<>();

        /* TODO: (performance) Sanitize autocompletion lookup

           This entire thing is slow as hell. The elasticsearch query itself that computes the list of objects matching
           the search query takes a few hundred milliseconds, and then the thing goes ahead and fetches each object
           from couchDB individually, returning everything in one big, honking list. =]
           This list is then returned, and one or two stack frames upwards here everything but the index (i.e. corpus)
           name, the object name and object ID is thrown away. These three are then plainly pasted into a completion
           result thingy without any legend or formatting to aid the poor human using this thing in understanding what's
           happening.
           Also, two stack frames upwards of here the result list is prefix-filtered yet again since apparently just
           making the correct elasticsearch query in the first place is too hard.

           One way to improve this:
            * Directly query elasticsearch with one, nicely formatted prefix query and fetch just the information that
              is going to be displayed in the end (_id, name, corpus). Pass this information to the proposal thingy.
           I (Sebastian) did not implement this right away as I don't want to work around this BTSQueryRequest stuff
           quite yet.

           The remaining problem is that this method gets the configItem describing the relation to generate proposals
           for, but does not get any hint as to what object types might be sensible here. This is a problem for any
           relation that can be used for both lemmas and corpus objects such as partOf.
         */
        if (configItem != null && !configItem.getOwnerTypesMap().isEmpty()) {
            if (configurationController.objectMayReferenceToThs(object, configItem)) {
                list.addAll(getTypedObjectProposalsFor(text, "BTSThsEntry", monitor));
            }
            if (configurationController.objectMayReferenceToWList(object, configItem)) {
                list.addAll(getTypedObjectProposalsFor(text, "BTSLemmaEntry", monitor));
            }
            if (configurationController.objectMayReferenceToCorpus(object, configItem)) {
                BTSQueryRequest query = new BTSQueryRequest(text);
                query.addRequestField("name");
                list.addAll(queryObjects(query, BTSConstants.OBJECT_STATE_ACTIVE,
                        false, "BTSCorpusObject", monitor));
            }
        }
        return list;
    }

    @Override
    public List<BTSObject> queryObjects(BTSQueryRequest query,
                                        String objectState, boolean registerQuery, String className, IProgressMonitor monitor) {
        return objectService.queryObjects(query,
                objectState, registerQuery, className, monitor);

    }


    private List<FilterBuilder> makeFilterList(BTSConfigItem configItem, BTSObject object) {
        Set<String> referenceTypes = configurationController.getReferenceTypesSet(object, configItem);
        List<FilterBuilder> filters = new ArrayList<>();
        for (String ref : referenceTypes) {
            if (ref.contains(BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR)) {
                String[] split = ref.split("\\.");
                if (split.length == 2) {
                    filters.add(FilterBuilders.termFilter("type", ref));
                } else if (split.length == 3) {
                    filters.add(FilterBuilders.termFilter("subtype", ref));
                }
            }
        }
        return filters;
    }

    @Override
    public String getDisplayName(String id) {

        return objectService.getDisplayName(id, null);

    }

    @Override
    public BTSObject findObject(String id, String className, IProgressMonitor monitor) {
        return objectService.findObject(id, className, monitor);

    }
}
