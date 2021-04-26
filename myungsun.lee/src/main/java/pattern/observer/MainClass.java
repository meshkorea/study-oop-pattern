package pattern.observer;

/**
 * 하나는 Publisher의 역할, 또 하나는 Observer의 역할이다.
 * 일단 이들의 인터페이스를 정의한 후 이를 implement한 클래스들을 이용한다.
 * Publisher라는 인터페이스는 Observer들을 관리하는 Method를 가지고 있을 것이다.
 * 구독을 원하는 Observer를 받아 등록시키고(add), 명단에서 제외하고(delete), 등록된 Observer들에게
 * 정보를 알려주는(notifyObserver) 이렇게 3가지의 Method를 정의할 수 있다
 *
 */
public class MainClass {

  public static void main(String[] args) {
    NewsMachine newsMachine = new NewsMachine();
    AnnualSubscriber as = new AnnualSubscriber(newsMachine);
    EventSubscriber es = new EventSubscriber(newsMachine);
    newsMachine.setNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
    // 삭제
    newsMachine.delete(as);
    //
    es.withdraw();

    newsMachine.setNewsInfo("벛꽃 축제합니다", "다같이 벚꽃보러~");

  }
}
