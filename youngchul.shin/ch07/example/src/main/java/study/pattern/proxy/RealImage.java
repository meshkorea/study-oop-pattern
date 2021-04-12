package study.pattern.proxy;

public class RealImage implements Image {

  private String path;

  public RealImage(String path) {
    this.path = path;
  }

  @Override
  public void draw() {
    System.out.println("진짜 그림을 그립니다");
  }
}
