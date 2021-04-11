package pattern.proxy;

/**
 * 프록시는 실제로 액션을 취하는 객체를 대신해서 대리자 역활을 해준다.
 * 프록시 패턴을 사용하게 되면 프록시 단계에서 권한을 부여할 수 있는 이점이 생기고 필요에 따라 객체를 생성시키거나
 * 사용하기 때문에 메모리를 절약할 수 있는 이점도 생긴다.
 * 프록시 패턴이 하는 일은 한마디로 자신이 보호하고 있는 객체에 대한 액세스 권한을 제어하는 것이다.
 *
 * 가상 프록시
 *    높은 cost 객체 대신 스켈레톤 객체(인터페이스만 존재하고 실제로 인스턴스를 생성하지 않는 객체)를 사용하여 실질적으로 객체가
 *    필요할때까지 높은 cost의 객체 생성을 지연시켜 메모리를 절약할 수 있다.
 * 원격 프록시
 *    서로 다른 머신에 있는 객체에 대해 제공할 수 있다(또는 객체를 사용할 수 있다). 일반적인 예는 JAVA의 RMI이다.
 *    http://www.informit.com/articles/article.aspx?p=1398608&seqNum=3
 * 보호 프록시
 *    객체에 대해 액세스 할 수있는 권한을 부여할 수 있다.
 * 정교한 참조
 *    프록시 객체에 정교한 작업을 부여할 수 있다. 예를들어 객체를 생성할 때 카운팅 기능을 추가적으로 작업할 수 있다.
 *
 *
 * 어뎁터 패턴
 *    어뎁터 패턴은 실제 오브젝트와 다른 인터페이스를 제공하여 실제 오브젝트를 사용할 수 있도록 도와준다.
 *    그러나 프록시 패턴은 실제 오브젝트와 동일한 인터페이스를 제공한다.
 * 데코레이터 패턴
 *    데코레이터 패턴은 런타임에 실제 객체에 동작을 추가한다.
 *    그러나 프록시는 동작을 제어하지 않고 동작을 변경하지 않는다.
 */
public class ProxyPatternTest {
  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("seotory", "is_not_pw");
    try {
      executor.runCommand("ls -al");
      executor.runCommand("rm -rf *"); // proxy 클래스에 의해 에러가 날 것이다.
    } catch (Exception e) {
      System.out.println("Exception Message: " + e.getMessage());
    }
  }
}
