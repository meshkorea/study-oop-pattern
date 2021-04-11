package pattern.decorator;

/**
 * 객체의 타입과 호출 가능한 메소드를 그대로 유지하면서 객체에 새로운 책임을 추가할 때 사용한다.
 * 탈부착 가능한 책임을 정의할 때 사용한다.
 * 상속을 통해 서브클래스를 계속 만드는 방법이 비효율적일 때 사용한다.
 *
 * 구현할 때 고려할 점들
 * Component는 장식을 추가할 베이스가 되는 역할이므로 작고 가볍게 정의하도록 한다
 * 상속 구조를 통해 Decorator와 Component가 같은 인터페이스를 갖게 해야 한다
 * 코드를 수정하지 않고도 준비된 Decorator을 조합해 기능을 추가할 수 있도록 생각해서 구현한다.
 *
 *
 * 헤드 퍼스트 디자인 패턴의 예제
 *
 * java.io 패키지에서 데코레이터 패턴을 사용한다.
 * InputStream  (추상 component 역할)
 *  FilterInputStream (추상 decorator 역할)
 *
 *
 *  데코레이터(Decorator) 패턴에서는 객체에 행동을 추가하지만, 프록시(Proxy)패턴에서는 접근을 제어합니다.
 */
public class DecoratorTest {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage);

    beverage = new Mocha(beverage);
    System.out.println(beverage);

    Beverage beverage2 = new HouseBlend();
    System.out.println(beverage2);

    beverage2 = new Mocha(beverage2);
    System.out.println(beverage2);
  }

}
