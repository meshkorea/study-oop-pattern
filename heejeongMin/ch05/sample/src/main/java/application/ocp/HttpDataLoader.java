package application.ocp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class HttpDataLoader extends DataLoader {

  @Override
  public Data loadData()  {
    HttpClient client = HttpClient.newBuilder().build();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://foo.com/")).build();
//    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return new Data().convertAndSetData("from ");
  }


  /*
  TODO
  HttpDataLoader 에서만 필요할 것이고, 변경될 것이라고 예측 되지 않는다면 HttpDataLoader에만 작성하고,
  타입 캐스팅을 통해서 사용해야하는데 이것인 OCP를 어긴다고 나오는데, 이런 경우도 공통화를 해야하는가 ? 대안은 ?
   */
  public void performingHttpDataLoaderSpecificOperation(){
    System.out.println("Only for HttpDataLoader");
  }
}
