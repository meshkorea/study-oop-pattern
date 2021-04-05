package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public class SelectableState implements State {

  @Override
  public void increaseCoin(int coin, VendingMachine vendingMachine) {
    vendingMachine.increaseCoin(coin);
  }

  @Override
  public void select(int productId, VendingMachine vendingMachine) {
    vendingMachine.provideProduct(productId);
    vendingMachine.decreaseCoin(vendingMachine.getProductPrice(productId));

    /*
    if (vendingMachine.hasNoCoin()) {
      vendingMachine.changeState(new NoCoinState());
    }
     */
  }

  @Override
  public boolean isSelectable() {
    return true;
  }
}
