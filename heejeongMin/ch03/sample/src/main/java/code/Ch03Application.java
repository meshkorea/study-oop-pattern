package code;

import code.Coupon.LimitPriceCoupon;
import code.LogCollector.DbTableLogGateway;
import code.LogCollector.FtpLogFileDownloader;
import code.LogCollector.LogCollectorType;
import code.LogCollector.SocketLogReader;

class Ch03Application {

  public static void main(String[] args) {

    Product product = new Product(10000);

    Coupon coupon = new Coupon(3000);
    int price = coupon.calculateDiscountedPrice(product.getPrice());
    System.out.println(price);

    Coupon limiteCoupon = new LimitPriceCoupon(90000, 2000);
    int price2 = limiteCoupon.calculateDiscountedPrice(product.getPrice());
    System.out.println(price2);


    LogCollector logCollector = createLogCollector(LogCollectorType.Socket);
    logCollector.collect();


  }

  public static class Product {
    private int price ;

    public Product(int price){
      this.price = price;
    }

    public int getPrice(){
      return this.price;
    }
  }

  public static LogCollector createLogCollector(LogCollectorType type) {
    return (type == LogCollectorType.File) ? new FtpLogFileDownloader() :
        (type == LogCollectorType.Socket) ? new SocketLogReader() : new DbTableLogGateway();
  }


}