package org.bbaw.bts.core.services.corpus.impl.services;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.MoveObjectAmongProjectDBCollectionsService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.comparator.BTSPassportEntryComparator;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.corpus.CorpusObjectDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.corpus.*;
import org.bbaw.bts.corpus.btsCorpusModel.*;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.extensions.Preference;

import javax.inject.Inject;
import java.util.*;

public class CorpusObjectServiceImpl
        extends AbstractCorpusObjectServiceImpl<BTSCorpusObject, String>
        implements CorpusObjectService, BTSObjectSearchService, MoveObjectAmongProjectDBCollectionsService {

    @Inject
    @Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
    private String lang;

    // daos
    @Inject
    private BTSAnnotationService annotationService;

    @Inject
    private BTSImageService imageService;

    @Inject
    private BTSLemmaEntryService lemmaEntryService;

    @Inject
    private BTSTCObjectService tcObjectService;

    @Inject
    private BTSTextCorpusService textCorpusService;

    @Inject
    private BTSTextService textService;

    @Inject
    private CorpusObjectDao corpusObjectDao;

    @Inject
    private BTSThsEntryService thsService;

    @Inject
    private GeneralPurposeDao generalPurposeDao;
    // services

    @Inject
    private BTSConfigurationService configService;

    @Override
    public BTSCorpusObject createNew() {
        // TODO Auto-generated method stub
        return null;
    }


    public String[] getActive_corpora(String projecPrefix) {
        List<String> arr = new ArrayList<>(4);
        for (String s : active_corpora.split(BTSCoreConstants.SPLIT_PATTERN)) {
            if (s.startsWith(projecPrefix) && s.trim().length() > 0 && !arr.contains(s)) {
                arr.add(s);

            }
        }
        return arr.toArray(new String[arr.size()]);
    }


    protected void setActive_corpora(String active_corpora) {
        this.active_corpora = active_corpora;
    }

    @Override
    public boolean save(BTSCorpusObject entity) {
        if (entity instanceof BTSImage) {
            return imageService.save((BTSImage) entity);
        } else if (entity instanceof BTSAnnotation) {
            return annotationService.save((BTSAnnotation) entity);
        } else if (entity instanceof BTSLemmaEntry) {
            return lemmaEntryService.save((BTSLemmaEntry) entity);
        } else if (entity instanceof BTSTCObject) {
            return tcObjectService.save((BTSTCObject) entity);
        } else if (entity instanceof BTSTextCorpus) {
            return textCorpusService.save((BTSTextCorpus) entity);
        } else if (entity instanceof BTSText) {
            return textService.save((BTSText) entity);
        } else if (entity instanceof BTSThsEntry) {
            return thsService.save((BTSThsEntry) entity);
        }
        return false;
    }

    @Override
    public void update(BTSCorpusObject entity) {
        if (entity instanceof BTSImage) {
            imageService.update((BTSImage) entity);
        } else if (entity instanceof BTSAnnotation) {
            annotationService.update((BTSAnnotation) entity);
        } else if (entity instanceof BTSLemmaEntry) {
            lemmaEntryService.update((BTSLemmaEntry) entity);
        } else if (entity instanceof BTSTCObject) {
            tcObjectService.update((BTSTCObject) entity);
        } else if (entity instanceof BTSTextCorpus) {
            textCorpusService.update((BTSTextCorpus) entity);
        } else if (entity instanceof BTSText) {
            textService.update((BTSText) entity);
        } else if (entity instanceof BTSThsEntry) {
            thsService.update((BTSThsEntry) entity);
        }

    }

    @Override
    public void remove(BTSCorpusObject entity) {
        if (entity instanceof BTSImage) {
            imageService.remove((BTSImage) entity);
        } else if (entity instanceof BTSAnnotation) {
            annotationService.remove((BTSAnnotation) entity);
        } else if (entity instanceof BTSLemmaEntry) {
            lemmaEntryService.remove((BTSLemmaEntry) entity);
        } else if (entity instanceof BTSTCObject) {
            tcObjectService.remove((BTSTCObject) entity);
        } else if (entity instanceof BTSTextCorpus) {
            textCorpusService.remove((BTSTextCorpus) entity);
        } else if (entity instanceof BTSText) {
            textService.remove((BTSText) entity);
        } else if (entity instanceof BTSThsEntry) {
            thsService.remove((BTSThsEntry) entity);
        }

    }

    @Override
    public BTSCorpusObject find(String key, IProgressMonitor monitor) {
        BTSCorpusObject tcObject = null;
        try {
            tcObject = corpusObjectDao.find(key, main_corpus_key);
        } catch (Exception ignored) {
        }
        if (tcObject != null) {
            return tcObject;
        }
        for (String c : getActive_corpora(main_project)) {
            try {
                tcObject = corpusObjectDao.find(key, c);
            } catch (Exception ignored) {
            }
            if (tcObject != null) {
                return tcObject;
            }
        }
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                try {
                    tcObject = corpusObjectDao.find(key, c);
                } catch (Exception ignored) {
                }
                if (tcObject != null) {
                    return tcObject;
                }
            }
        }
        return tcObject;
    }

    @Override
    public List<BTSCorpusObject> list(String objectState, IProgressMonitor monitor) {
        List<BTSCorpusObject> objects = new Vector<>();
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                if (monitor != null && monitor.isCanceled()) {
                    return objects;
                }
                try {
                    objects.addAll(corpusObjectDao.list(c, objectState));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        objects.addAll(textCorpusService.list(objectState, monitor));
        return filter(objects);
    }

    public List<BTSCorpusObject> getRootBTSCorpusObjects() {
        List<BTSCorpusObject> objects = new Vector<>();
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                objects.addAll(corpusObjectDao.getRootBTSCorpusObjects(c));
            }
        }
        return filter(objects);
    }

    public List<BTSCorpusObject> findByQueryId(String searchId, String dbPath,
                                               String objectState) {
        List<BTSCorpusObject> objects = new Vector<>();

        if (dbPath != null) {
            objects.addAll(corpusObjectDao.findByQueryId(searchId, dbPath,
                    objectState));
        } else {
            for (String p : getActiveProjects()) {
                for (String c : getActive_corpora(p)) {
                    objects.addAll(corpusObjectDao
                            .findByQueryId(searchId, c,
                                    objectState));
                }
            }
        }
        return filter(objects);
    }

    private List<BTSCorpusObject> find(BTSQueryRequest query, String objectState) {
        List<BTSCorpusObject> objects = new Vector<>();
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                objects.addAll(corpusObjectDao.query(query, c, c, objectState,
                        false));
            }
        }
        return filter(objects);
    }

    @Override
    public List<BTSCorpusObject> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
        return filter(query(query, objectState, true, monitor));

    }

    @Override
    public boolean saveMultiple(Set<BTSCorpusObject> entitys) {
        throw new UnsupportedOperationException("You have to implement saveMultiple Set... method!!!");
    }

    @Override
    public List<BTSCorpusObject> list(String dbPath, String queryId,
                                      String objectState, IProgressMonitor monitor) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BTSCorpusObject> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
                                            String objectState, IProgressMonitor monitor) {
        List<BTSCorpusObject> objects = new Vector<>();
        if (monitor != null && monitor.isCanceled()) {
            return objects;
        }
        objects.addAll(corpusObjectDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
        return filter(objects);
    }

    @Override
    public List<BTSPassportEntry> getPassportEntryProposals(
            BTSQueryRequest query) {
        List<BTSPassportEntry> result = new Vector<>();
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)
                    ) {
                result.addAll(corpusObjectDao.getPassportEntryProposals(
                        query, c, c));
            }
            result.addAll(corpusObjectDao.getPassportEntryProposals(
                    query, p + BTSCorpusConstants.THS, p
                            + BTSCorpusConstants.THS));
            result.addAll(corpusObjectDao.getPassportEntryProposals(
                    query, p + BTSCorpusConstants.WLIST, p
                            + BTSCorpusConstants.WLIST));
        }
        return selectDistinctValues(result);
    }

    private List<BTSPassportEntry> selectDistinctValues(
            List<BTSPassportEntry> result) {
        Set<String> selected = new HashSet<>(result.size());
        List<BTSPassportEntry> distinctResult = new Vector<>();

        for (BTSPassportEntry entry : result) {
            if (!selected.contains(entry.getValue())) {
                distinctResult.add(entry);
                selected.add(entry.getValue());
            }
        }
        Collections.sort(distinctResult, new BTSPassportEntryComparator());
        return distinctResult;
    }

    @Override
    public List<BTSCorpusObject> query(BTSQueryRequest query,
                                       String objectState,
                                       boolean registerQuery, IProgressMonitor monitor) {
        List<BTSCorpusObject> objects = new Vector<>();
        if (query.getDbPath() != null && query.getDbPath().endsWith(BTSCorpusConstants.THS)) {
            for (String p : getActiveProjects()) {
                try {
                    objects.addAll(corpusObjectDao.query(query, p
                                    + BTSCorpusConstants.THS, p
                                    + BTSCorpusConstants.THS, objectState,
                            registerQuery));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (monitor != null) {
                    if (monitor.isCanceled()) return filter(objects);
                    monitor.worked(20);
                }
            }
        } else if (query.getDbPath() != null && query.getDbPath().endsWith(BTSCorpusConstants.WLIST)) {
            for (String p : getActiveLemmaLists()) {
                try {
                    objects.addAll(corpusObjectDao.query(query, p
                                    + BTSCorpusConstants.WLIST, p
                                    + BTSCorpusConstants.WLIST, objectState,
                            registerQuery));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (monitor != null) {
                    if (monitor.isCanceled()) return filter(objects);
                    monitor.worked(5);
                }
            }
        } else {
            for (String p : getActiveProjects()) {
                for (String c : getActive_corpora(p)) {

                    try {
                        objects.addAll(corpusObjectDao.query(query, c, c, objectState,
                                registerQuery));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (monitor != null) {
                        if (monitor.isCanceled()) return filter(objects);
                        monitor.worked(5);
                    }
                }
            }
        }
        return filter(objects);
    }

    @Override
    public BTSCorpusObject find(String key, String path, String revision, IProgressMonitor monitor) {
        if (path != null && !"".equals(path)) {
            return corpusObjectDao.find(key, path, revision);
        }
        BTSCorpusObject tcObject = null;
        tcObject = corpusObjectDao.find(key, main_corpus_key, revision);
        if (tcObject != null) {
            return tcObject;
        }
        for (String c : getActive_corpora(main_project)) {
            tcObject = corpusObjectDao.find(key, c, revision);
            if (tcObject != null) {
                return tcObject;
            }
            if (monitor != null && monitor.isCanceled()) return tcObject;
        }
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                tcObject = corpusObjectDao.find(key, c, revision);
                if (tcObject != null) {
                    return tcObject;
                }
                if (monitor != null && monitor.isCanceled()) return tcObject;
            }
        }
        return tcObject;
    }


    @Override
    public String getNameOfServedClass() {
        return "BTSCorpusObject";
    }


    @Override
    public <T> Class<T> getServedClass() {
        return (Class<T>) BTSCorpusObject.class;
    }


    @Override
    public List<BTSCorpusObject> listRootEntries(IProgressMonitor monitor) {
        List<BTSTextCorpus> corpora = textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
        List<BTSCorpusObject> roots = new Vector<>(corpora.size());
        for (BTSTextCorpus tc : corpora) {
            if (monitor != null && monitor.isCanceled()) {
                return roots;
            }
            roots.add(tc);
        }
        return roots;
    }


    @Override
    public boolean move(BTSDBBaseObject entity, String targetDBCollectionPath, String sourceDBCollectionPath) {
        String oldrev = entity.get_rev();
        remove((BTSCorpusObject) entity, sourceDBCollectionPath, oldrev);
        entity.set_deleted(false);
        entity.set_rev(null);
        ((BTSCorpusObject) entity).setCorpusPrefix(targetDBCollectionPath);
        entity.setDBCollectionKey(targetDBCollectionPath);

        // check if object with this id already exists in new target collection
        BTSCorpusObject potentialPredecessor = null;
        try {
            potentialPredecessor = find(entity.get_id(), targetDBCollectionPath, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (potentialPredecessor != null) {
            System.out.println("potentialPredecessor " + potentialPredecessor);
        }
        // if yes, get it, update it with current entity, keep revision of existing object
        entity.eResource().setURI(null);
        entity.eResource().getContents().clear();
//		try {
//			entity.eResource().delete(null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        entity.eAdapters().clear();

        // else remove revision from entity
        boolean successful = save((BTSCorpusObject) entity);
//		if (successful)
//		{
//			remove((BTSCorpusObject) entity, sourceDBCollectionPath, oldrev);
//		}

        if (entity instanceof BTSTextCorpus) {
            throw new UnsupportedOperationException();

        }
        return successful;
    }


    private void remove(BTSCorpusObject entity, String sourceDBCollectionPath, String revision) {
        corpusObjectDao.setDeleted(entity, sourceDBCollectionPath, true);

    }

    public boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts) {
        if (object.eResource() == null || object.get_rev() == null) {
            corpusObjectDao.loadFully(object, checkForConflicts);
        }
        return false;

    }


    /* (non-Javadoc)
     * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public String findAsJsonString(String key, IProgressMonitor monitor) {
        String tcObject = null;
        try {
            tcObject = corpusObjectDao.findAsJsonString(key, main_corpus_key);
        } catch (Exception ignored) {
        }
        if (tcObject != null) {
            return tcObject;
        }
        for (String c : getActive_corpora(main_project)) {
            try {
                tcObject = corpusObjectDao.findAsJsonString(key, c);
            } catch (Exception ignored) {
            }
            if (tcObject != null) {
                return tcObject;
            }
        }
        for (String p : getActiveProjects()) {
            for (String c : getActive_corpora(p)) {
                try {
                    tcObject = corpusObjectDao.findAsJsonString(key, c);
                } catch (Exception ignored) {
                }
                if (tcObject != null) {
                    return tcObject;
                }
            }
        }
        return tcObject;
    }


    /* (non-Javadoc)
     * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
        List<String> objects = new Vector<>();

        if (query.getDbPath() != null && query.getDbPath().endsWith(BTSCorpusConstants.THS)) {
            for (String p : getActiveProjects()) {
                try {
                    objects.addAll(corpusObjectDao.queryAsJsonString(query, p
                                    + BTSCorpusConstants.THS, p
                                    + BTSCorpusConstants.THS, objectState,
                            false));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (monitor != null) {
                    if (monitor.isCanceled()) return objects;
                    monitor.worked(20);
                }
            }
        } else if (query.getDbPath() != null && query.getDbPath().endsWith(BTSCorpusConstants.WLIST)) {
            for (String p : getActiveLemmaLists()) {
                try {
                    objects.addAll(corpusObjectDao.queryAsJsonString(query, p
                                    + BTSCorpusConstants.WLIST, p
                                    + BTSCorpusConstants.WLIST, objectState,
                            false));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (monitor != null) {
                    if (monitor.isCanceled()) return objects;
                    monitor.worked(5);
                }
            }
        } else {
            for (String p : getActiveProjects()) {
                for (String c : getActive_corpora(p)) {

                    try {
                        objects.addAll(corpusObjectDao.queryAsJsonString(query, c, c, objectState,
                                false));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (monitor != null) {
                        if (monitor.isCanceled()) return objects;
                        monitor.worked(5);
                    }
                }
            }
        }
        return objects;
    }


    /* (non-Javadoc)
     * @see org.bbaw.bts.core.services.corpus.CorpusObjectService#setObjectTypePath(org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject, java.lang.String)
     */
    @Override
    public void setObjectTypePath(BTSCorpusObject object, String annotationTypePath) {
        if (annotationTypePath != null
                && !annotationTypePath.startsWith(BTSConstants.ANNOTATION)
                && !annotationTypePath.equals(BTSConstants.ANNOTATION)) {
            String[] entries = annotationTypePath.split("\\.");
            if (entries.length > 1) {
                object.setType(entries[1]);
                object.setName(entries[1]);
            }
            if (entries.length > 2) {
                object.setSubtype(entries[2]);
                object.setName(entries[2]);
            }
        }
    }


    /* (non-Javadoc)
     * @see org.bbaw.bts.core.services.corpus.CorpusObjectService#getAllPassportDataAsString(org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject)
     */
    @Override
    public String getAllPassportDataAsString(BTSCorpusObject object) {
        String dataString = "";
        if (object.getPassport() == null) return null;
        // iterate over all passport entries
        for (BTSPassportEntry c : object.getPassport().getChildren()) {
            BTSPassportEntryGroup category = (BTSPassportEntryGroup) c;
            String re = appendPassportItemData(category);
            if (re != null && !"".equals(re)) {
                dataString += getPassportConfigLabel(category.getType()) + ": \n";
                dataString += re;
            }

        }
        // iterate over all entry children ...
        if (dataString.endsWith("\n")) return dataString.substring(0, dataString.length() - 1);
        return dataString;
    }

    /**
     * @param type
     * @return
     */
    public String getPassportConfigLabel(String passportTypePath) {
        Map<String, String> cache = getPassportConfigLabelCache();
        if (cache.containsKey(passportTypePath)) return cache.get(passportTypePath);
        return passportTypePath;
    }


    /**
     * @return
     */
    private Map<String, String> getPassportConfigLabelCache() {
        Map<String, String> cache;
        Object o = context.get("passportConfigLabelmap");
        if (o != null && o instanceof Map<?, ?>) {
            cache = (Map<String, String>) o;
        } else {
            cache = new HashMap<>();
            for (BTSConfig c : configService.getPassportCategories(null)) {
                if (c instanceof BTSConfigItem) {
                    BTSConfigItem child = (BTSConfigItem) c;
                    fillCache(child, cache, child.getValue(), null);
                    cache.put(child.getValue(), child.getLabel().getTranslation(lang));
                }
            }
            context.set("passportConfigLabelmap", cache);
        }
        return cache;
    }


    /**
     * @param activePassportConfigItem
     * @param cache
     */
    private void fillCache(BTSConfigItem configItem, Map<String, String> cache,
                           String valuePath, String labelPath) {
        for (BTSConfig c : configItem.getChildren()) {
            BTSConfigItem item = (BTSConfigItem) c;
            String value = valuePath;
            if (value == null) value = item.getValue();
            else value += "org.bbaw.bts.core.services.corpus.impl/META-INF" + item.getValue();

            String label = labelPath;
            if (label == null) label = item.getLabel().getTranslation(lang);
            else label += "org.bbaw.bts.core.services.corpus.impl/META-INF" + item.getLabel().getTranslation(lang);

            cache.put(value, label);
            fillCache(item, cache, value, label);
        }
    }


    /**
     * @param category
     * @return
     */
    private String appendPassportItemData(BTSPassportEntry entry, String... pathEntries) {
        String response = "";
        String[] path = Arrays.copyOf(pathEntries, pathEntries.length + 1);
        path[path.length - 1] = entry.getType();
        if (entry instanceof BTSPassportEntryItem) {
            BTSPassportEntryItem item = (BTSPassportEntryItem) entry;
            if (item.getValue() != null && !"".equals(item.getValue().trim())) {
                // if value is set, get config items of string
                // build string representation: label>label>...>:value
                for (String s : path) {
                    response += s + "org.bbaw.bts.core.services.corpus.impl/META-INF";
                }
                response = response.substring(0, response.length() - 1);
                response = "-" + getPassportConfigLabel(response);
                return response += ":" + item.getValue() + "\n";
            }
            return null;
        } else {
            for (BTSPassportEntry cc : entry.getChildren()) {
                String re = appendPassportItemData(cc, path);
                if (re != null && !"".equals(re.trim())) {
                    response += re;
                }

            }
        }
        return response;
    }

}
