package pattern.strategy;

public class Bus implements Moveable{

  @Override
  public void move() {
    System.out.println("도로를 통해 이동");
  }
}
