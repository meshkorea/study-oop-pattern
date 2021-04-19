package study.pattern.observer;

public class SpecialStatusObserver implements StatusObserver {

  private StatusChecker statusChecker;

  public SpecialStatusObserver(StatusChecker statusChecker) {
    this.statusChecker = statusChecker;
  }

  @Override
  public void onAbnormalStatus(Status status) {
    if (statusChecker.isContinuousFault()) {
      System.out.println("Alarm siren");
    }
  }
}
