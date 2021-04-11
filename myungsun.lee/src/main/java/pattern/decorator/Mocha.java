package pattern.decorator;

class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    description = "모카";
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    // 중요한 부분
    return 0.20 + beverage.cost();
  }

  @Override
  public String getDescription() {
    // 중요한 부분
    return beverage.getDescription() + ", " + description;
  }
}
