package oop.study.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

  @Test
  @DisplayName("객체 생성")
  public void makeNewObjects() {
    BankAccount bankAccount = new BankAccount(123L, "Bart", 100.00);

    assertEquals(123L, bankAccount.getAccountNumber());
    assertEquals("Bart", bankAccount.getOwner());
    assertEquals(100.00, bankAccount.getBalance());
  }

}
