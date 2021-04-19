package application.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

  private int startTimee;
  private String stock;
  private double price;

  private Subject stockGrabber;
  public GetTheStock(Subject stockGrabber, int newStartTme, String newStock, double newPrice){
    this.stockGrabber = stockGrabber;
    startTimee = newStartTme;
    stock = newStock;
    price = newPrice;
  }

  @Override
  public void run() {
    for(int i=1; i<=20; i++){
      try{
        Thread.sleep(2000);

      }catch (InterruptedException e){

      }

      double randNum = (Math.random() * (.06)) - .03; //랜덤한 음수
      DecimalFormat df = new DecimalFormat("#.##");
      price = Double.valueOf(df.format(price + randNum));

      switch (stock){
        case "IBM" :((StockGrabber)stockGrabber).setIBMPrice(price); break;
        case "APPLE" :((StockGrabber)stockGrabber).setApplePrice(price); break;
        case "GOOGLE" : ((StockGrabber)stockGrabber).setGooglePrice(price); break;
      }

      System.out.println(stock + ": " + df.format(price+randNum) + " " + df.format(randNum));

      System.out.println();
    }
  }
}
