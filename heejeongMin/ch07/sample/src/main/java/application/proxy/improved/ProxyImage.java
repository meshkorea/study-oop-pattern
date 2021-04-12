package application.proxy.improved;

public class ProxyImage implements Image {

  private int index;
  private RealImage image;

  public ProxyImage(int index){
    this.index = index;
  }

  public void draw(){
    if(image == null) {
      image = new RealImage(index);
    }
    image.draw();
  }
}
