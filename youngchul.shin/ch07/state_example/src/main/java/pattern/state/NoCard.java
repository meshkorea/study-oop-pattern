package pattern.state;

public class NoCard implements ATMState {

  ATMMachine atmMachine;

  // 이거 그냥 추상 클래스로 중간 계층을 두는게 더 좋을 듯.
  public NoCard(ATMMachine newATMMachine) {
    atmMachine = newATMMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Please Enter a PIN");
    atmMachine.setATMState(atmMachine.getYesCardState());
  }

  @Override
  public void ejectCard() {
    System.out.println("Enter a Card First");
  }

  @Override
  public void insertPin(int pinEntered) {
    System.out.println("Enter a Card First");
  }

  @Override
  public void requestCash(int cashToWithdraw) {
    System.out.println("Enter a Card First");
  }
}
