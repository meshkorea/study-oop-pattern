package pattern.state;

public class StateTest {

  public static void main(String[] args) {
    Clock clock = new Clock();
    clock.normal();
    clock.alarm();
    clock.normal();
  }
}
