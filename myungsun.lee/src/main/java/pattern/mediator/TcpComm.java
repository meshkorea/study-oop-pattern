package pattern.mediator;

public class TcpComm implements Source{

  Mediator mediator;
  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void eventOccured(String event) {
    mediator.onEvent("Tcp Comm", event);
  }
}
