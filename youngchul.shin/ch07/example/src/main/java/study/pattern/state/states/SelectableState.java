package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public class SelectableState implements State {

  @Override
  public void increaseCoin(int coin, VendingMachine vendingMachine) {
    /*
    increaseCoin(coin);
     */

    vendingMachine.increaseCoin(coin);
  }

  @Override
  public void select(int productId, VendingMachine vendingMachine) {
    /*
    provideProduct(productId);
    decreaseCoin(getProductPrice(productId));
    if (hasNoCoin()) {
      state = State.NOCOIN;
    }
     */

    vendingMachine.provideProduct(productId);
    vendingMachine.decreaseCoin(vendingMachine.getProductPrice(productId));

    if (vendingMachine.hasNoCoin()) {
      vendingMachine.changeState(new NoCoinState());
    }
  }
}
