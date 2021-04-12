package application.decorator.problem;

public class HawaiianPizza extends Pizza {

  @Override
  public void setDescription(String description) {

  }

  @Override
  public String getDescription() {
    return "Tomato Sauce, Mozzarella, Pineapple";
  }

  @Override
  public Double getCost() {
    return 8.00;
  }
}
