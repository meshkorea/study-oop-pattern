package application.proxy.improved;

import application.proxy.AnimalImages;

public class RealImage implements Image {

  private int index;
  private Image image;

  public RealImage(int index) {
    this.index = index;
  }

  @Override
  public void draw() {
    System.out.println(AnimalImages.values()[index]);
  }
}
