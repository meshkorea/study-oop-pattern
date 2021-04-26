package pattern.facade;

public class Turntable implements Switch{

  @Override
  public void on() {
    System.out.println("Turntable이 움직입니다");

  }

  @Override
  public void off() {
    System.out.println("Turntable이 멈췄습니다");

  }
}
