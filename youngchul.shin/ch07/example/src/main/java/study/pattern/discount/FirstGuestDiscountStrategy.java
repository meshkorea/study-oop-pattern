package study.pattern.discount;

import study.pattern.Item;

public class FirstGuestDiscountStrategy implements DiscountStrategy {

  @Override
  public int getDiscountPrice(Item item) {
    return (int)(item.getPrice() * 0.9);
  }
}
