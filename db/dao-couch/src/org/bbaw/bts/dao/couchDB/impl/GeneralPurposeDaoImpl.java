package org.bbaw.bts.dao.couchDB.impl;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.SearchHit;

public class GeneralPurposeDaoImpl extends CouchDBDao<BTSDBBaseObject, String> implements GeneralPurposeDao {

    @Override
    public List<SearchHit> queryNonBTSObjects(BTSQueryRequest query,
                                              String indexName, String indexType) {
        if (query.getSearchRequestBuilder() == null) {
            SearchResponse response = connectionProvider
                    .getSearchClient(Client.class)
                    .prepareSearch(indexName)
                    .setTypes(indexType)
                    .setSearchType(SearchType.QUERY_AND_FETCH)
                    .setQuery(query.getQueryBuilder())
                    .setFrom(0).setSize(60).setExplain(true).execute()
                    .actionGet();
            List<SearchHit> result = new Vector<>();
            for (SearchHit hit : response.getHits()) {
                result.add(hit);
            }

            return result;
        } else {
            SearchResponse response = query.getSearchRequestBuilder()
                    .setIndices(indexName).setTypes(indexType)
                    .setSearchType(SearchType.QUERY_AND_FETCH).execute()
                    .actionGet();
            List<SearchHit> result = new Vector<>();
            for (SearchHit hit : response.getHits()) {
                result.add(hit);
            }

            return result;
        }
    }

}
