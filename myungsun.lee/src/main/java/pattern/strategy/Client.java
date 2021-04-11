package pattern.strategy;

public class Client {

  /**
   * 만약 택시, 자가용, 오토바이 등 운송 수단이 추갈 생긴다면?
   * @param args
   */
  public static void main(String[] args) {
//    Moveable train = new Train();
//    Moveable bus = new Bus();
//
//    train.move();
//    bus.move();
    Moving train = new Train();
    Moving bus = new Bus();

    train.setMovableStrategy(new RailLoadStrategy());
    bus.setMovableStrategy(new LoadStrategy());

    train.move();
    bus.move();
    
    //
    bus.setMovableStrategy(new RailLoadStrategy());
    bus.move();
  }
}
