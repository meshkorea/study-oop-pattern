package application;

import application.adpter.EnemyAttacker;
import application.adpter.EnemyRobot;
import application.adpter.EnemyRobotAdapter;
import application.adpter.EnemyTank;
import application.decorator.improved.FavoritePizza;
import application.decorator.improved.Mozzaralla;
import application.decorator.improved.Pineapple;
import application.decorator.improved.Pizza;
import application.decorator.improved.TomatoSauce;
import application.facade.BankAccountFacade;
import application.mediator.ApplicationMediator;
import application.mediator.ConcreteColleague;
import application.observer.GetTheStock;
import application.observer.StockGrabber;
import application.observer.StockObserver;
import application.proxy.AnimalImages;
import application.proxy.improved.Image;
import application.proxy.improved.ProxyImage;
import application.proxy.improved.RealImage;
import application.proxy.problem.ListUI;
import application.state.atm.ATMMachine;
import application.strategy.Animal;
import application.strategy.Bird;
import application.strategy.Dog;
import application.strategy.ItFlys;
import application.template.Hoagie;
import application.template.ItalianHoagie;
import application.template.VeggieHoagie;
import java.util.ArrayList;
import java.util.List;

public class Ch07Application {

  public static void main(String[] args) {

//    System.out.println("=========== Strategy Pattern ==========");
//    Animal sparky = new Dog();
//    Animal tweety = new Bird();
//    System.out.println("Dog: " + sparky.tryToFly());
//    System.out.println("Bird: " + tweety.tryToFly());
//    sparky.setFlyingAbility(new ItFlys());
//    System.out.println("Dog: " + sparky.tryToFly());
//
//
//
//    System.out.println("=========== Template method Pattern ============");
//    Hoagie cust12Hoagie = new ItalianHoagie();
//    cust12Hoagie.makeSandwich();
//    System.out.println();
//    VeggieHoagie cust13Hoagie = new VeggieHoagie();
//    cust13Hoagie.makeSandwich();
//
//
//
//    System.out.println("============ State Pattern =================");
//    ATMMachine atmMachine = new ATMMachine();
//    atmMachine.insertCard();
//    atmMachine.ejectCard();
//    atmMachine.insertCard();
//    atmMachine.insertPin(1234);
//    atmMachine.requestCash(2000);
//    atmMachine.insertCard();
//    atmMachine.insertPin(1234);
//
//
//
//    System.out.println("============ Decorator Pattern =================");
//    Pizza pizza = new TomatoSauce(new Mozzaralla(new Pineapple(new FavoritePizza())));
//    System.out.println(pizza.getClass().toString());
//    System.out.println(pizza.getDescription());
//    System.out.println(pizza.getCost());
//
//    System.out.println("============ Proxy Pattern =================");
//
//    ListUI ui = new ListUI();
//    ui.onScroll(0, 3);
//    System.out.println(">>>>");
//    ui.onScroll(0, 10);
//
//
//    System.out.println("improved>>>>>>>");
//
//    int size = AnimalImages.values().length;
//    List<Image> images = new ArrayList<>(size);
//    for (int i = 0; i < size; i++) {
//      if (i < 4) {
//        images.add(new RealImage(i));
//      } else {
//        images.add(new ProxyImage(i));
//      }
//    }
//
//    application.proxy.improved.ListUI newUI = new application.proxy.improved.ListUI(images);
//    newUI.onScroll(0, 9);
//
//
//    System.out.println("============ Adapter Pattern =================");
//    EnemyTank tank = new EnemyTank();
//    EnemyRobot robot = new EnemyRobot();
//    EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
//
//    System.out.println("The Robot");
//
//    robot.reactToHuman("Paul");
//    robot.walkForward();
//    robot.smashWithHands();
//
//    System.out.println("The Enemy Tank");
//
//    tank.assignDriver("Frank");
//    tank.driveForward();
//    tank.fireWeapon();
//
//    System.out.println("The Robot with Adaptor");
//    robotAdapter.assignDriver("Mark");
//    robotAdapter.driveForward();
//    robotAdapter.fireWeapon();

//    System.out.println("=============== Observer Pattern ===========");
//    StockGrabber stockGrabber = new StockGrabber();
//    StockObserver observer1 = new StockObserver(stockGrabber);
//
//    stockGrabber.setIBMPrice(197.00);
//    stockGrabber.setApplePrice(677.60);
//    stockGrabber.setGooglePrice(676.40);
//
//    StockObserver observer2 = new StockObserver(stockGrabber);
//
//    stockGrabber.setIBMPrice(197.10);
//    stockGrabber.setApplePrice(677.70);
//    stockGrabber.setGooglePrice(676.60);
//
//    stockGrabber.unregister(observer1);
//
//    Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
//    Runnable getApple = new GetTheStock(stockGrabber, 2, "APPLE", 677.70);
//    Runnable getGoogle = new GetTheStock(stockGrabber, 2, "GOOGLE", 676.60);
//
//    new Thread(getIBM).start();
//    new Thread(getApple).start();
//    new Thread(getGoogle).start();


    System.out.println("=============== Mediator Pattern ===========");
    ApplicationMediator mediator = new ApplicationMediator();
    ConcreteColleague desktop = new ConcreteColleague(mediator);
    ConcreteColleague mobile = new ConcreteColleague(mediator);
    mediator.addColleague(desktop);
    mediator.addColleague(mobile);
    desktop.send("Hello Mobile, I am desktop");
    mobile.send("Hi desktop!");


    System.out.println("=============== Facade Pattern ===========");

    BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
    accessingBank.withdrawCash(50.00);
    accessingBank.withdrawCash(900.00);
    accessingBank.depositCash(200.00);
  }

}
