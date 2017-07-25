package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.core.runtime.IProgressMonitor;

public class CompareObjectsControllerImpl implements CompareObjectsController {


    private static final int MAX_REV_COUNTS = 25;
    @Inject
    private GeneralBTSObjectService objectService;

    @Override
    public List<BTSDBBaseObject> listConflictingVersions(BTSDBBaseObject object, IProgressMonitor monitor) {
        List<String> conflicts = object.getConflictingRevs();
        List<BTSDBBaseObject> conflictObjects = new Vector<>();
        for (String rev : conflicts) {
            BTSDBBaseObject o = null;
            try {
//				String className = getSuperTypeName(object);
                o = objectService.find(object.get_id(), object.getDBCollectionKey(), object, rev, monitor);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (o != null) {
                conflictObjects.add(o);
            }
        }
        return conflictObjects;
    }

//	//FIXME classname managing fixing
//	private String getSuperTypeName(BTSDBBaseObject object) {
//		String name = object.getClass().getName();
//		if (name.contains(".")){
//		String[] ss = name.split("\\.");
//		name = ss[ss.length-1];
//		if (name.contains("Impl"))
//		{
//			name = name.replace("Impl", "");
//		}
//		}
//		return name;
//	}

    @Override
    public boolean removeRevision(BTSDBBaseObject object, String revision) {
        return objectService.removeRevision(object, revision);
    }

    @Override
    public void reloadConflicts(BTSDBBaseObject object) {
        objectService.reloadConflicts(object);

    }

    @Override
    public List<BTSDBBaseObject> listAvailableVersions(BTSDBBaseObject object,
                                                       boolean fetchFromRemote, IProgressMonitor monitor) {
        List<DBRevision> revisions = objectService.listAvailableRevisions(object, fetchFromRemote, monitor);
        List<BTSDBBaseObject> availableRevisions = new Vector<>();
        int counter = 0;
        for (DBRevision rev : revisions) {
            BTSDBBaseObject o = null;
            switch (rev.getLocation()) {
                case DBRevision.LOCAL: {
                    try {
                        o = objectService.find(object.get_id(), object.getDBCollectionKey(), object, rev.getRevision(), monitor);
                        if (o != null) {
                            availableRevisions.add(o);
                            counter++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case DBRevision.REMOTE: {
                    try {
                        o = objectService.find(object.get_id(), object.getDBCollectionKey(), rev.getRevision(), object, true, monitor);
                        if (o != null) {
                            availableRevisions.add(o);
                            counter++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
            if (counter > MAX_REV_COUNTS) break;
        }
        return availableRevisions;
    }

    @Override
    public BTSDBBaseObject replaceCurrentWithRevision(
            BTSDBBaseObject current, BTSDBBaseObject revision) {
        return objectService.replaceCurrentWithRevision(current, revision);
    }

}
