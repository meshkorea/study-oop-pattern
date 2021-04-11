package pattern.template;

/**
 * Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.
 *
 * Java8 의 AbstractMap(K,V) 클래스를 보면 템플릿 패턴 적용
 * 즉 변하지 않은 기능은 상위 클래스에서 만들고, 자주 변경되며 확장할 기능은 서브 클래스에서 구현
 *
 * AbstractMap의 hashCode는 상위 클래스 사용
 * get() 등 은 하위 클래스에서 구현
 */
public abstract class AbstractConnectionTemplate {

  public void run(){
    setDBDriver();
    connection();
    execute();
    closed();
  }

  protected abstract void setDBDriver();

  protected abstract void execute();

  private void connection(){
    System.out.println("DB Connection ....");
  }

  private void closed(){
    System.out.println("DB Conneciton closed");
  }

}
