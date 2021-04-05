package pattern.strategy;

public class Client {

  public static void main(String[] args) {
    Moveable train = new Train();
    Moveable bus = new Bus();

    train.move();
    bus.move();
  }
}
