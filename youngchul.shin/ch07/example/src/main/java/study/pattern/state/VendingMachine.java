package study.pattern.state;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import study.pattern.state.states.NoCoinState;
import study.pattern.state.states.State;

public class VendingMachine {

  // SOLDOUT을 구현하려면 Product 추가/판매 기능 추가 및 연관된 재고 정보를 가지고 있어야한다
  private Map<Integer, Product> products = new HashMap<>();

  private State state;

  private int coin;

  public VendingMachine(Product... products) {
    this.state = new NoCoinState();

    Arrays.stream(products)
        .forEach(p -> this.products.put(p.getId(), p));
  }

  public void insertCoin(int coin) {
    state.increaseCoin(coin, this);
  }

  public void select(int productId) {
    state.select(productId, this);
  }

  public void increaseCoin(int coin) {
    this.coin += coin;
  }

  public void decreaseCoin(int coin) {
    this.coin -= coin;
  }

  public void returnCoin() {
    coin = 0;
  }

  public void changeState(State state) {
    this.state = state;
  }

  public void provideProduct(int productId) {
    System.out.println(productId + "제품을 제공합니다");
  }

  public boolean hasNoCoin() {
    return coin == 0;
  }

  public int getProductPrice(int productId) {
    Product product = products.get(productId);
    return product.getPrice();
  }
}
