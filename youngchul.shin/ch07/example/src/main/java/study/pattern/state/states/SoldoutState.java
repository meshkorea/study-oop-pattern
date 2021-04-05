package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public class SoldoutState implements State {

  @Override
  public void increaseCoin(int coin, VendingMachine vendingMachine) {
    vendingMachine.returnCoin();
  }

  @Override
  public void select(int productId, VendingMachine vendingMachine) {
    // do nothing
  }

  @Override
  public boolean isSelectable() {
    return false;
  }
}
