package application.proxy.problem;

import application.proxy.AnimalImages;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DynamicLoadingImage extends ImageContainer<DynamicLoadingImage> {

  public DynamicLoadingImage(int startIdx, int limit) {
    this.startIdx = startIdx;
    this.limit = 5;
  }

  @Override
  public DynamicLoadingImage loadImages() {
    this.loadedImages =
        IntStream.range(startIdx, 5)
            .mapToObj(i -> AnimalImages.values()[i])
            .collect(Collectors.toList());

    this.draw();

    startIdx += limit;
    return this;
  }

}
