package pattern.strategy;

public class Train implements Moveable{

  @Override
  public void move() {
    System.out.println("선로를 통해 이동");
  }
}
