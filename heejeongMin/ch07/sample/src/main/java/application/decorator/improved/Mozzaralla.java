package application.decorator.improved;

public class Mozzaralla extends ToppingDecorator {

  public Mozzaralla(Pizza tempPizza) {
    super(tempPizza);

    System.out.println("Adding Mozzarella");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Mozzarella";
  }

  public double getCost() {
    return tempPizza.getCost() + .50;
  }
}
