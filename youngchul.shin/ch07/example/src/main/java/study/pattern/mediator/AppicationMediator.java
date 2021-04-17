package study.pattern.mediator;

import java.util.ArrayList;

public class AppicationMediator implements Mediator {

  private ArrayList<Colleague> colleagues;

  public AppicationMediator(ArrayList<Colleague> colleagues) {
    this.colleagues = colleagues;
  }

  @Override
  public void send(String message, Colleague originator) {
    colleagues.stream()
        .filter(c -> c != originator)
        .forEach(c -> c.receive(message));
  }
}
