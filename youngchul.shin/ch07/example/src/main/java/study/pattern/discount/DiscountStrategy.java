package study.pattern.discount;

import study.pattern.Item;

public interface DiscountStrategy {

  int getDiscountPrice(Item item);
}
