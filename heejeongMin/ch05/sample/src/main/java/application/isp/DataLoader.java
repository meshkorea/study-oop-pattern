package application.isp;

public abstract class DataLoader {

  abstract public Data loadData();

  public void doSomethingInCommon() {
    System.out.println("Something in common");
  }

}
