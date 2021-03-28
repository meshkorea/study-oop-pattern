package application.ocp;

public abstract class DataLoader {

  private Data data;
  abstract public Data loadData();

  public void doSomethingInCommon() {
    System.out.println("Something in common");
  }

}
