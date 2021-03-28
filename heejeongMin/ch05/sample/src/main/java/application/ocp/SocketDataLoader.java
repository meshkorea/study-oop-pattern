package application.ocp;

import java.net.Socket;

public class SocketDataLoader extends DataLoader{

  @Override
  public Data loadData() {
    Socket socket = new Socket();
//    socket.connect(new InetSocketAddress("127.0.0.1", 8080));
    return new Data().convertAndSetData("from socket".getBytes());
  }

  @Override
  public void doSomethingInCommon(){
    System.out.println("I don't have anything in Common for this operation.");
  }
}
