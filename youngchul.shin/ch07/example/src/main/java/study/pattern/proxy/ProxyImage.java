package study.pattern.proxy;

public class ProxyImage implements Image {

  private String path;
  private RealImage image;

  public ProxyImage(String path) {
    this.path = path;
  }

  @Override
  public void draw() {
    if (image == null) {
      image = new RealImage(path);
    }

    image.draw();
  }
}
