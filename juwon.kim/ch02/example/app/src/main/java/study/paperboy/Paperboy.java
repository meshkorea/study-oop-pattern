package study.paperboy;

public class Paperboy {

  public int collectPaperSubscriptionFrom(Customer customer, int subscriptionPrice) {
    final Wallet wallet = customer.getWallet();
    if (wallet == null) {
      throw new NotEnoughMoneyException(customer.getName() + "님은 지금 지갑이 없습니다");
    }
    if (wallet.getTotalMoney() >= subscriptionPrice) {
      wallet.subtractMoney(subscriptionPrice);
      return subscriptionPrice;
    }

    throw new NotEnoughMoneyException(String.format("%s님의 지갑에 돈이 부족합니다: 신문값 %d, 지갑잔액 %d",
        customer.getName(), subscriptionPrice, wallet.getTotalMoney()));
  }
}
