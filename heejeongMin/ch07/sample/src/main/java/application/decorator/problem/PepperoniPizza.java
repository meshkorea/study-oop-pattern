package application.decorator.problem;

public class PepperoniPizza extends Pizza{

  @Override
  public void setDescription(String description) {

  }

  @Override
  public String getDescription() {
    return "Tomato Sauce, Mozzarella, Pepperoni";
  }

  @Override
  public Double getCost() {
    return 8.50;
  }
}
