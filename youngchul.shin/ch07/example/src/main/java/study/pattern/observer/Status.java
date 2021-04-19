package study.pattern.observer;

public class Status {

  private StatusItem value;

  public Status(StatusItem value) {
    this.value = value;
  }

  public boolean isNotNormal() {
    return StatusItem.isNotNormal(value);
  }
}
