package pattern.mediator;

public class Log implements Destination{

  @Override
  public void receiveEvent(String from, String event) {
    System.out.println("Log : from " + from + " event : " + event);
  }
}
