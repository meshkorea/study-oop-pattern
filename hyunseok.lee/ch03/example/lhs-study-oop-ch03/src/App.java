public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(5000);
        Coupon coupon = new Coupon(3000);
        int price = coupon.calculateDiscountedPrice(product.getPrice());

        System.out.println(price);
    }
}
