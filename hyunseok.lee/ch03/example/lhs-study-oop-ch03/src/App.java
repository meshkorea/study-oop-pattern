public class App {
    public static void main(String[] args) throws Exception {
        Product cheapProduct = new Product(4900);
        Product expensiveProduct = new Product(10000);
        
        LimitPriceCoupon lpCoupon = new LimitPriceCoupon(5000, 1000);
        int discountAmount = lpCoupon.getDiscountAmount();
        int limitPrice = lpCoupon.getLimitPrice();

        System.out.println("할인액:" + discountAmount);
        System.out.println("기준금액:" + limitPrice);

        System.out.println(lpCoupon.calculateDiscountedPrice(cheapProduct.getPrice()));

        System.out.println(lpCoupon.calculateDiscountedPrice(expensiveProduct.getPrice()));
    }
}
