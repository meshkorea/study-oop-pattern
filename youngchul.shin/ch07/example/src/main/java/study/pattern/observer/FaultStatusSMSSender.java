package study.pattern.observer;

public class FaultStatusSMSSender implements StatusObserver {

  @Override
  public void onAbnormalStatus(Status status) {
    System.out.println("FaultStatusSMSSender");
  }
}
