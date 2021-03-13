package study;

import java.time.LocalDate;

public class Member {
  String name;
  LocalDate expiryDate;
  private boolean male;

  public Member(String name, LocalDate expiryDate, boolean male) {
    this.name = name;
    this.expiryDate = expiryDate;
    this.male = male;
  }

  public Member() {
  }

  public String getName() {
    return name;
  }

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public boolean isMale() {
    return male;
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", expiryDate=" + expiryDate +
        ", male=" + male +
        '}';
  }
}
