package study;

public class Item {
    private int price;

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
    public boolean isFresh() {
        return false;
    }
}
