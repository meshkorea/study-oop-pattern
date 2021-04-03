package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public class NoCoinState implements State {

  @Override
  public void increaseCoin(int coin, VendingMachine vendingMachine) {
    /*
    increaseCoin(coin);
    state = State.SELECTABLE;
     */

    vendingMachine.increaseCoin(coin);
    vendingMachine.changeState(new SelectableState());
  }

  @Override
  public void select(int productId, VendingMachine vendingMachine) {
    /*
    no thing
     */
    System.out.println("Beep!");
  }
}
