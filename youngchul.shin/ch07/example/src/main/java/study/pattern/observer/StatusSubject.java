package study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StatusSubject {

  private List<StatusObserver> observers = new ArrayList<>();

  public void add(StatusObserver observer) {
    observers.add(observer);
  }

  public void remove(StatusObserver observer) {
    observers.remove(observer);
  }

  public void notifyStatus(Status status) {
    observers.stream().forEach(o -> o.onAbnormalStatus(status));
  }
}
