package study.pattern.mediator;

import java.util.ArrayList;

public class AppicationMediator implements Mediator {

  private ArrayList<Colleague> colleagues = new ArrayList<>();

  public void addColleague(Colleague colleague) {
    if (colleagues.contains(colleague)) {
      return;
    }

    colleagues.add(colleague);
  }

  @Override
  public void send(String message, Colleague originator) {
    colleagues.stream()
        .filter(c -> c != originator)
        .forEach(c -> c.receive(message));
  }
}
