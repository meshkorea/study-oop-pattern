package pattern.mediator;

public class Display implements Destination{

  @Override
  public void receiveEvent(String from, String event) {
    System.out.println("Display : from " + from + " event : " + event);
  }
}
