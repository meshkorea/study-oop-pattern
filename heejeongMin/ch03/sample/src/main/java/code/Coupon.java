package code;

public class Coupon {

  private int discountAmount;

  public Coupon(){}

  public Coupon(int discountAmount){
    this.discountAmount = discountAmount;
  }

  public int getDiscountAmount() {
    return discountAmount;
  }

  public int calculateDiscountedPrice(int price) {
    if(price < discountAmount) {
      return 0;
    }
    return price - discountAmount;
  }

  public static class LimitPriceCoupon extends Coupon {
    private int limitPrice;

    public LimitPriceCoupon(int limitPrice, int discountAmount) {
      super(discountAmount);
      this.limitPrice = limitPrice;
    }

    public int getLimitPrice(){
      return limitPrice;
    }

    @Override
    public int calculateDiscountedPrice(int price){
      if(price < limitPrice) { //확장한 기능을 여기서 수행하고
        return price;
      }
      return super.calculateDiscountedPrice(price); //기본 기능을 부모에게 해달라고 한다.
    }
  }
}
