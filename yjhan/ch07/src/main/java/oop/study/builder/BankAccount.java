package oop.study.builder;

public class BankAccount {

  private long accountNumber;
  private String owner;
  private double balance;

  public BankAccount(long accountNumber, String owner, double balance) {
    this.accountNumber = accountNumber;
    this.owner = owner;
    this.balance = balance;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public String getOwner() {
    return owner;
  }

  public double getBalance() {
    return balance;
  }

}
