package application.dip.application;

import application.dip.Data;

public abstract class DataLoader {

  private Data data;
  abstract public Data loadData();

  public void doSomethingInCommon() {
    System.out.println("Something in common");
  }

  public Data getData() {
    return data;
  }
}
