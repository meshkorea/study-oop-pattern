package application.isp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class HttpDataLoader extends DataLoader implements DataLoaderHelper<HttpDataLoader>{

  @Override
  public Data loadData()  {
    HttpClient client = HttpClient.newBuilder().build();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://foo.com/")).build();
//    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return new Data().convertAndSetData("from ");
  }


  @Override
  public HttpDataLoader helpLoadingData() {
    System.out.println("I am helper for HttpDataLoader");
    return this;
  }
}
