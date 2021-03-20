package javastudy.coupon;

public class CouponRunner {

  public static void main(String[] args) {
    final Coupon coupon = new Coupon(3000);
    final int price = coupon.calculateDiscountedPrice(5000);
    System.out.println("Discounted price: " + price);
  }
}
