package oop.study.builder;

public class BankAccount {

  private long accountNumber;
  private String owner;
  private String branch;
  private double balance;
  private double interestRate;

  public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
    this.accountNumber = accountNumber;
    this.owner = owner;
    this.branch = branch;
    this.balance = balance;
    this.interestRate = interestRate;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public String getOwner() {
    return owner;
  }

  public String getBranch() {
    return branch;
  }

  public double getBalance() {
    return balance;
  }

  public double getInterestRate() {
    return interestRate;
  }

}
