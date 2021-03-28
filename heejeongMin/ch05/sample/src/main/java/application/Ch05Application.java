package application;

import application.isp.Data;
import application.isp.DataLoader;
import application.isp.HttpDataLoader;
import application.isp.SocketDataLoader;

public class Ch05Application {
  public static void main(String[] args) {
    System.out.println();
    loadData(new HttpDataLoader().helpLoadingData());
    loadData(new SocketDataLoader());

    System.out.println();
    System.out.println("======using assembler======");
    Assembler assembler = new Assembler();
    assembler.createAndWire(args[0]);
    loadData(assembler.getDataLoader());
  }

  public static Data loadData(DataLoader dataLoader){
    dataLoader.doSomethingInCommon();
    return dataLoader.loadData();
  }

  public static class Assembler {

    private DataLoader dataLoader;

    public void createAndWire(){
      this.dataLoader = new SocketDataLoader();
    }

    public void createAndWire(String type) {
      if (type.equals(LoadType.HTTP.name())) {
        this.dataLoader = new HttpDataLoader();
      } else {
        createAndWire();
      }
    }

    public DataLoader getDataLoader(){
      return this.dataLoader;
    }

    enum LoadType {
      HTTP, SOCKET;
    }
  }

}
