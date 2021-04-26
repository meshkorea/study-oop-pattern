package application.state.coffee;

/*
- 유저의 행동을 생각해보자.
1. CoffeeMachine의 전원을 켠다 - onMachine
2. 원두를 넣는다. - addBeans
3. 물을 넣는다.  - addWater
4. 분쇄버튼을 누른다.  - grindBeans
5. extract 한다. - extractCoffee

  Context(Account) : CoffeeMachine
    --> CoffeeMachine이 현재 상태를 나타낸다.

  State :

  Concrete State : CoffeeState
executeAdjustments
 */
public class CoffeeMachine {

  CoffeeState onMachine;
  CoffeeState hasBeans;
  CoffeeState hasWater;

  CoffeeState coffeeState;

  //CoffeeState makeCexecuteAdjustmenoffee;


}
