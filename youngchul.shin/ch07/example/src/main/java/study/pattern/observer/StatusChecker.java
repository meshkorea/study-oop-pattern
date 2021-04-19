package study.pattern.observer;

public class StatusChecker extends StatusSubject {

  public void check() {
    Status status = loadStatus();

    if (status.isNotNormal()) {
      super.notifyStatus(status);
    }
  }

  public Status loadStatus() {
    return new Status(StatusItem.NG);
  }

  public boolean isContinuousFault() {
    return true;
  }
}
