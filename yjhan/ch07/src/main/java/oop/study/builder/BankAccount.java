package oop.study.builder;

public class BankAccount {

  private final long accountNumber;
  private final String owner;
  private final String branch;
  private final double balance;
  private final double interestRate;

  private BankAccount(Builder builder) {
    accountNumber = builder.accountNumber;
    owner = builder.owner;
    branch = builder.branch;
    balance = builder.balance;
    interestRate = builder.interestRate;
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

  public static class Builder {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public Builder(long accountNumber) {
      this.accountNumber = accountNumber;
    }

    public Builder accountNumber(long accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    public Builder owner(String owner) {
      this.owner = owner;
      return this;
    }

    public Builder branch(String branch) {
      this.branch = branch;
      return this;
    }

    public Builder balance(double balance) {
      this.balance = balance;
      return this;
    }

    public Builder interestRate(double interestRate) {
      this.interestRate = interestRate;
      return this;
    }

    public BankAccount build() {
      return new BankAccount(this);
    }
  }

}
