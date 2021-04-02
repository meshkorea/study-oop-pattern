package study.pattern;

import java.util.List;
import study.pattern.discount.DiscountStrategy;

public class Calculator {

  private final DiscountStrategy discountStrategy;

  public Calculator(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public int calculate(List<Item> items) {
    int sum = 0;
    for (Item item : items) {

      /*
      step 1. Calculator에서 if/else를 이용한 할인 금액 계산
      if (firstGuest) {
        sum += (int)(item.getPrice() * 0.9);  // 첫 손님 10% 할인
      } else if (!item.isFresh()) {
        sum += (int)(item.getPrice() * 0.8);  // 덜 신선한 것 20% 할인
      } else  {
        sum += item.getPrice();
      }
       */

      /*
      step2. 할인 정책을 이용한 할인 금액 계산
       */
      sum += discountStrategy.getDiscountPrice(item);
    }

    return sum;
  }
}
