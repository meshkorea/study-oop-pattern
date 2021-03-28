package application.srp;

import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class DataLoader {

  private Data data;

  public Data loadData(Protocol protocol)  {
    return (protocol == Protocol.HTTP)? byHttp() : bySocket();
  }

  public Data byHttp() {
    HttpClient client = HttpClient.newBuilder().build();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://foo.com/")).build();
//    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return new Data().convertAndSetData("from ");
  }

  public Data bySocket() {
    Socket socket = new Socket();
//    socket.connect(new InetSocketAddress("127.0.0.1", 8080));
    return new Data().convertAndSetData("from socket".getBytes());
  }

  enum Protocol {
    HTTP, SOCKET;
  }
}
