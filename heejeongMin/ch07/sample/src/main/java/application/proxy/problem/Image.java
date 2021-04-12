package application.proxy.problem;

import application.proxy.AnimalImages;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Image extends ImageContainer<Image>{

  public Image (int startIdx, int limit) {
    this.startIdx = startIdx;
    this.limit = limit;
  }

  public Image loadImages(){
    loadedImages =
        Stream.of(AnimalImages.values())
            .limit(limit)
            .collect(Collectors.toList());
    this.draw();
    return this;
  }
}
