package application.decorator.improved;

public class FavoritePizza implements Pizza{

  @Override
  public String getDescription() {
    return "Thin Dough";
  }

  @Override
  public double getCost() {
    return 4.00;
  }
}
