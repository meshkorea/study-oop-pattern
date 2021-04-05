package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public class NoCoinState implements State {

  @Override
  public void increaseCoin(int coin, VendingMachine vendingMachine) {
    vendingMachine.increaseCoin(coin);
    /*
    vendingMachine.changeState(new SelectableState());
     */
  }

  @Override
  public void select(int productId, VendingMachine vendingMachine) {
    System.out.println("Beep!");
  }

  @Override
  public boolean isSelectable() {
    return false;
  }
}
