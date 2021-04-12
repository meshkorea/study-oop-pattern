package study.pattern.adapter;

import study.pattern.adapter.Tolr.TolrClient;
import study.pattern.adapter.Tolr.TolrQuery;
import study.pattern.adapter.Tolr.TolrQueryResponse;

public class SearchServiceTolrAdapter implements SearchService {

  private TolrClient tolrClient = new TolrClient();

  @Override
  public SearchResult search(String keyword) {
    // keyword를 정해진 query 양식으로 변경
    TolrQuery query = new TolrQuery(keyword);

    // 정해진 쿼리 양식을 client를 이용해서 호출
    TolrQueryResponse response = tolrClient.query(query);

    return response.toSearchResult();
  }
}
