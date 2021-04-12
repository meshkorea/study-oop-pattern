package application.proxy.improved;

import application.proxy.AnimalImages;
import java.util.ArrayList;
import java.util.List;

public class ListUI {

  private List<Image> images;

  public ListUI(List<Image> images) {
    this.images = images;
  }

  public void onScroll(int start, int end){
    for(int i = start; i<=end; i++){
      Image image = images.get(i);
      image.draw();
    }
  }
}
