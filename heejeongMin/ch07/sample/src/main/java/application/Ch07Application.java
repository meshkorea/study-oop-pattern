package application;

import application.state.ATMMachine;
import application.strategy.Animal;
import application.strategy.Bird;
import application.strategy.Dog;
import application.strategy.ItFlys;
import application.template.ItalianHoagie;
import application.template.VeggieHoagie;

public class Ch07Application {

  public static void main(String[] args){

    System.out.println("=========== Strategy Pattern ==========");

    Animal sparky = new Dog();
    Animal tweety = new Bird();

    System.out.println("Dog: " + sparky.tryToFly());

    System.out.println("Bird: " + tweety.tryToFly());

    // This allows dynamic changes for flyingType

    sparky.setFlyingAbility(new ItFlys());

    System.out.println("Dog: " + sparky.tryToFly());



    System.out.println("=========== Template method Pattern ============");

    ItalianHoagie cust12Hoagie = new ItalianHoagie();
    cust12Hoagie.makeSandwich();

    System.out.println();

    VeggieHoagie cust13Hoagie = new VeggieHoagie();
    cust13Hoagie.makeSandwich();

    System.out.println("============ State Pattern =================");
    ATMMachine atmMachine = new ATMMachine();

    atmMachine.insertCard();

    atmMachine.ejectCard();

    atmMachine.insertCard();

    atmMachine.insertPin(1234);

    atmMachine.requestCash(2000);

    atmMachine.insertCard();

    atmMachine.insertPin(1234);
  }

}
