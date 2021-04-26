package pattern.mediator;

public interface Destination {
  public void receiveEvent(String from, String event);
}
