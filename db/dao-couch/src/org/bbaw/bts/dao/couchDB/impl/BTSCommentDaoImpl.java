package org.bbaw.bts.dao.couchDB.impl;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSCommentDaoImpl extends CouchDBDao<BTSComment, String> implements BTSCommentDao {

    @Override
    public boolean removeBTSComment(BTSComment comment, String path) {
        super.remove(comment, path);
        return true;
    }

    @Override
    public List<BTSComment> query(BTSQueryRequest query, String indexName,
                                  String indexType, String objectState, boolean registerQuery) {
        // TODO Auto-generated method stub
        return super.query(query, indexName, indexType, objectState, registerQuery);
    }


}
