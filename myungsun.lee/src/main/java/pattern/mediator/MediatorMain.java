package pattern.mediator;

/**
 * 모든 클래스간의 복잡한 로직(상호작용)을 캡슐화하여 하나의 클래스에 위임하여 처리하는 패턴이다.
 *
 * 즉, M:N의 관계에서 M:1의 관계로 복잡도를 떨어뜨려 유지 보수 및 재사용의 확장성에 유리한 패턴이다.
 *커뮤니케이션을 하고자 하는 객체가 있을 때 서로가 커뮤니케이션 하기 복잡한 경우 이를 해결해주고 서로 간 쉽게 해주며 커플링을 약화시켜주는 패턴이다.
 *
 *
 * 그리고 중재자가 notify한다는 의미로 옵저버 패턴과 매우 유사한데,
 *
 * 옵저버는 Subscriber이 받기만 하는데 Mediator은 서로 통신한다는 것에서 차이가 있다.
 *
 */
public class MediatorMain {

  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    Source tcp = new TcpComm();
    tcp.setMediator(mediator);
    Source system = new SystemSignal();
    system.setMediator(mediator);
    mediator.addDestination(new Display()); mediator.addDestination(new Log());
    tcp.eventOccured("connected");
    tcp.eventOccured("disconnected");
    system.eventOccured("key input");
    system.eventOccured("mouse input");
  }
}
