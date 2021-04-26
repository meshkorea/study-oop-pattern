package pattern.facade;

/**
 * 퍼사드 패턴 (Facade Pattern) = 어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공
 * 퍼사드란, 프랑스어 Façade 에서 유래된 단어로 건물의 외관이라는 뜻을 가지고 있습니다. 건물의 외벽에서 보면 안의 구조는 보이지 않습니다.
 * 퍼사드 패턴은 많은 서브시스템(내부 구조)을 거대한 클래스(외벽)로 만들어 감싸서 편리한 인터페이스를 제공해 줍니다.
 *
 * 쿨러 :  전자레인지의 열을 식혀준다.
 * 마그네트론 :  마이크로파를 발생시킨다
 * 턴테이블 : 조리할 음식을 회전시킨다
 * 타이머 : 시간이 되면 전자레인지를 끈다.
 *
 *
 * ++ 최소 지식 원칙 (데메테르의 원칙, Law of Demeter) : 정말 관련있는 객체와만 관계를 맺어라!
 *
 * 객체자체
 * 메소드에 매개변수로 전달된 객체
 * 그 메소드에서 생성하거나 인스턴스를 만든 객체
 * 그 객체에 속하는 구성요소
 *
 * 출처: https://javaengine.tistory.com/entry/디자인패턴-퍼사드-패턴-Facade-Pattern [nalaolla]
 */
public class User {
  public static void main(String[] args) {
    MicrowaveFacade microwave = new MicrowaveFacade(new Mode());
    microwave.on();
    try {
      Thread.sleep(2000);
      microwave.off();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
