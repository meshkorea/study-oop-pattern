package study.pattern.strategy.discount;

import study.pattern.strategy.Item;

public class NonFreshItemDiscountStrategy implements DiscountStrategy {

  @Override
  public int getDiscountPrice(Item item) {
    return (int)(item.getPrice() * 0.8);
  }
}