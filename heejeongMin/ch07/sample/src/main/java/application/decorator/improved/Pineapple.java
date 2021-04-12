package application.decorator.improved;

public class Pineapple extends ToppingDecorator{

  public Pineapple(Pizza tempPizza) {
    super(tempPizza);

    System.out.println("Adding Pineapple");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Pineapplee";
  }

  public double getCost() {
    return tempPizza.getCost() + 1.0;
  }
}
