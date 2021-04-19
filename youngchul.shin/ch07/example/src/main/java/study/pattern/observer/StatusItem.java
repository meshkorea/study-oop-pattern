package study.pattern.observer;

public enum StatusItem {
  OK,
  NG;

  public static boolean isNotNormal(StatusItem item) {
    return item == StatusItem.NG;
  }
}
