package study.pattern.adapter.Tolr;

public class TolrClient {

  public TolrQueryResponse query(TolrQuery query) {
    System.out.println("Query를 시도합니다");

    return new TolrQueryResponse();
  }
}
