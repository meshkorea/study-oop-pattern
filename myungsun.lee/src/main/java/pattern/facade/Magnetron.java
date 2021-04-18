package pattern.facade;

public class Magnetron implements Switch{

  @Override
  public void on() {
    System.out.println("마이크로파 발생기 켜짐.. 작동중");
  }

  @Override
  public void off() {
    System.out.println("마이크로파 발생기 꺼짐..");
  }
}
