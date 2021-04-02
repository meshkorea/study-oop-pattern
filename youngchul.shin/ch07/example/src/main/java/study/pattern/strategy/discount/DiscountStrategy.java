package study.pattern.strategy.discount;

import study.pattern.strategy.Item;

public interface DiscountStrategy {

  int getDiscountPrice(Item item);
}
