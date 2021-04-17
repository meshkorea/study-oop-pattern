package study.pattern.mediator;

public class MediatorClient {

  public void demo() {
    AppicationMediator mediator = new AppicationMediator();
    Colleague desktop = new DesktopColleague(mediator);
    Colleague mobile = new MobileColleague(mediator);
    desktop.send("Hello Desktop World");
    mobile.send("Hello Mobile World");
  }
}
