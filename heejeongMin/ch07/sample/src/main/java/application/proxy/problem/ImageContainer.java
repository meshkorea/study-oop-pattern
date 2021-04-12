package application.proxy.problem;

import application.proxy.AnimalImages;
import java.util.ArrayList;
import java.util.List;

public abstract class ImageContainer<T> {

  List<AnimalImages> loadedImages = new ArrayList<>();
  int limit;
  int startIdx;

  public void draw() {
    this.loadedImages.forEach(System.out::println);
  }

  public List<AnimalImages> getLoadedImages() {
    return this.loadedImages;
  }

  abstract T loadImages();


}
