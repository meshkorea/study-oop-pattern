package study.adapter;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceTolrAdapter implements SearchService {
    private TolrClient tolrClient = new TolrClient();

    public SearchResult search(String keyword) {
        TolrQuery tolrQuery = new TolrQuery(keyword);
        QueryResponse response = tolrClient.query(tolrQuery);
        SearchResult result = convertToResult(response);
        return result;
    }

    private SearchResult convertToResult(QueryResponse response) {
        List<TolrDocument> tolrDocs = response.getDocumentList().getDocuments();
        List<SearchDocument> docs = new ArrayList<SearchDocument>();
        for(TolrDocument tolrDoc : tolrDocs) {
            docs.add(new SearchDocument(tolrDoc.getId()));
        }
        return new SearchResult(docs);
    }
}
