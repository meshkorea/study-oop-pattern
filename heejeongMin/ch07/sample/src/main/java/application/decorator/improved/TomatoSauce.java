package application.decorator.improved;

public class TomatoSauce extends ToppingDecorator {

  public TomatoSauce(Pizza tempPizza) {
    super(tempPizza);

    System.out.println("Adding Tomato Sauce");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Tomato Sauce";
  }

  public double getCost() {
    return tempPizza.getCost() + .30;
  }
}
