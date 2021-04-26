package application.state.atm;

public interface ATMState {

  void insertCard();

  void ejectCard();

  void insertPin(int pinEntered);

  void requestCash(int cashToWithdraw);

}
