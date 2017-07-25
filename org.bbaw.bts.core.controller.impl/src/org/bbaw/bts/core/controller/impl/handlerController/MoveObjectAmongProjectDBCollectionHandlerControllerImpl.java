package org.bbaw.bts.core.controller.impl.handlerController;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.controller.handlerController.MoveObjectAmongProjectDBCollectionHandlerController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.GeneralMoveObjectAmongProjectsService;
import org.eclipse.e4.core.services.log.Logger;

public class MoveObjectAmongProjectDBCollectionHandlerControllerImpl implements
        MoveObjectAmongProjectDBCollectionHandlerController {

    @Inject
    private GeneralMoveObjectAmongProjectsService generalMoveService;

    @Inject
    private BTSProjectService projectService;

    @Inject
    private PermissionsAndExpressionsEvaluationController permissionController;

    @Inject
    private Logger logger;

    @Override
    public TreeNodeWrapper getMoveOptionsRootNode(Object selection) {

        // get projects
        List<BTSProject> allProjects = projectService.list(BTSConstants.OBJECT_STATE_ACTIVE, null);

        TreeNodeWrapper rootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();

        BTSFilter moveDBCollectionFilter = generalMoveService.getMoveDBCollectionFilter(selection);
        logger.info("Move Object among projects, number of projects: " + allProjects.size());
        for (BTSProject project : allProjects) {
            TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
                    .createTreeNodeWrapper();
            tn.setObject(project);
            boolean add = false;
            for (BTSProjectDBCollection coll : project.getDbCollections()) {
                logger.info("Move Object among projects. db collection: " + coll.getCollectionName());

                if (moveDBCollectionFilter != null && moveDBCollectionFilter.select(coll)
                        && permissionController.authenticatedUserMayAddToDBCollection(coll)) {
                    logger.info("Move Object among projects. available and allowed target db collection: " + coll.getCollectionName());

                    add = true;
                    TreeNodeWrapper tn2 = BtsviewmodelFactory.eINSTANCE
                            .createTreeNodeWrapper();
                    tn2.setObject(coll);
                    tn.getChildren().add(tn2);
                    tn2.setParent(tn);
                }
            }
            if (add) {
                rootNode.getChildren().add(tn);
                tn.setParent(rootNode);
            }

        }
        return rootNode;
    }

    @Override
    public boolean move(BTSDBBaseObject object, String targetDBCollectionPath, String sourceDBCollectionPath) {
        return generalMoveService.move(object, targetDBCollectionPath, sourceDBCollectionPath);
    }

    @Override
    public BTSFilter getMoveDBCollectionFilter(BTSDBBaseObject selection) {
        // get filter from move service
        return generalMoveService.getMoveDBCollectionFilter(selection);
    }
}
