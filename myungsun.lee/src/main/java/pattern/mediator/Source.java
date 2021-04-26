package pattern.mediator;

public interface Source {
  public void setMediator(Mediator mediator);
  public void eventOccured(String event);
}
