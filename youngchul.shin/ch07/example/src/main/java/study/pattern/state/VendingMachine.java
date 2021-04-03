package study.pattern.state;

public class VendingMachine {
  public static enum State { NOCOIN, SELECTABLE, SOLDOUT }

  private State state = State.NOCOIN;

  private int coin;

  public void insertCoin(int coin) {
    switch (state) {
      case NOCOIN:
        increaseCoin(coin);
        state = State.SELECTABLE;
        break;
      case SELECTABLE:
        increaseCoin(coin);
        break;
      case SOLDOUT:
        returnCoin();
    }
  }

  public void select(int productId) {
    switch (state) {
      case NOCOIN:
        break;
      case SELECTABLE:
        provideProduct(productId);
        decreaseCoin(getProductPrice(productId));
        if (hasNoCoin()) {
          state = State.NOCOIN;
        }
        break;
      case SOLDOUT:
        // do nothing
    }
  }

  private void increaseCoin(int coin) {
    this.coin += coin;
  }

  private void decreaseCoin(int coin) {

  }

  private void returnCoin() {
    coin = 0;
  }

  private void provideProduct(int productId) {
    System.out.println(productId + "제품을 제공합니다");
  }

  private int getProductPrice(int productId) {
    return 10;  // 임시 코드
  }

  private boolean hasNoCoin() {
    return coin == 0;
  }

}
