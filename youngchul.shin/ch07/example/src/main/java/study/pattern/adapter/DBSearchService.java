package study.pattern.adapter;

public class DBSearchService implements SearchService {

  @Override
  public SearchResult search(String keyword) {
    System.out.println("DB에서 검색했습니다");
    return new SearchResult();
  }
}
