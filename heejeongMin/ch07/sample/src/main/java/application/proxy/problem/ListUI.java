package application.proxy.problem;

public class ListUI {

  private Image image;
  private DynamicLoadingImage dynamicLoadingImage;

  public ListUI() {
  }

  public void onScroll(int startIdx, int limit){
    if(limit < 5 && startIdx == 0 ) {
      this.image = new Image(startIdx, limit).loadImages();
    } else {
      this.dynamicLoadingImage = new DynamicLoadingImage(startIdx, limit).loadImages();
    }
  }
}
