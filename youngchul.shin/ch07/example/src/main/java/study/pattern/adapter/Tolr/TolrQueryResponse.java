package study.pattern.adapter.Tolr;

import study.pattern.adapter.SearchResult;

public class TolrQueryResponse {

  public SearchResult toSearchResult() {
    return new SearchResult();
  }
}
