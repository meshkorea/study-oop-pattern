package study.paperboy;

public class Customer {

  String name;
  Wallet wallet;

  public Customer(String name, Wallet wallet) {
    this.name = name;
    this.wallet = wallet;
  }

  public Customer() {
  }

  public String getName() {
    return name;
  }

  public Wallet getWallet() {
    return wallet;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", wallet=" + wallet +
        '}';
  }
}
