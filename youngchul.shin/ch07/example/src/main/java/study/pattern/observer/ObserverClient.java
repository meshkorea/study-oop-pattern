package study.pattern.observer;

public class ObserverClient {

  public void check() {
    StatusChecker checker = new StatusChecker();
    checker.add(new StatusEmailSender());
    checker.add(new FaultStatusSMSSender());
    checker.add(new SpecialStatusObserver(checker));
  }
}
