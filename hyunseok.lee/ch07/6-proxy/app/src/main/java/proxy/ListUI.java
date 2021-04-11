package proxy;

import java.util.List;

public class ListUI {
    private List<Image> images;

    public ListUI(List<Image> images) {
        this.setImages(images);
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void onScroll(int start, int end) {
        for(int i = start; i <= end ; i++) {
            Image image = images.get(i);
            image.draw();
        }
    }
}
