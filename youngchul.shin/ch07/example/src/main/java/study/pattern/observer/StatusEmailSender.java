package study.pattern.observer;

public class StatusEmailSender implements StatusObserver {

  @Override
  public void onAbnormalStatus(Status status) {
    sendEmail(status);
  }

  private void sendEmail(Status status) {
    System.out.println("이메일을 전송합니다");
  }
}
