package oop.study.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

  @Test
  @DisplayName("객체 생성")
  public void makeNewObjects() {
    BankAccount bankAccount = new BankAccount(456L, "Marge", "Springfield", 100.00, 2.5);

    assertEquals(456L, bankAccount.getAccountNumber());
    assertEquals("Marge", bankAccount.getOwner());
    assertEquals("Springfield", bankAccount.getBranch());
    assertEquals(100.00, bankAccount.getBalance());
    assertEquals(2.5, bankAccount.getInterestRate());
  }

  @Test
  @DisplayName("잘못된 사용의 예")
  public void wrongUseExamples() {
    BankAccount bankAccount = new BankAccount(789L, "Homer", null, 2.5, 100.00);

    assertEquals(789L, bankAccount.getAccountNumber());
    assertEquals("Homer", bankAccount.getOwner());
    assertNull(bankAccount.getBranch());
    assertEquals(100.00, bankAccount.getBalance());
    assertEquals(2.5, bankAccount.getInterestRate());
  }

}
