package study.pattern.state.states;

import study.pattern.state.VendingMachine;

public interface State {

  void increaseCoin(int coin, VendingMachine vendingMachine);

  void select(int productId, VendingMachine vendingMachine);

  boolean isSelectable();
}
