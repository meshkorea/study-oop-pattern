package pattern.factory;

/**
 * 팩토리 메서드 패턴
 *    조건에 따른 객체 생성을 팩토리 클래스로 위임하여, 팩토르 클래스에서 객체를 생성하는 패턴 ( 링크 )
 * 추상 팩토리 패턴
 *    서로 관련이 있는 객체들을 통째로 묶어서 팩토리 클래스로 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
 *
 * 추상 팩토리 패턴은 어떻게 보면, 팩토리 메서드 패턴을 좀 더 캡슐화한 방식이라고 볼 수 있음
 *
 */
public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {
    //get shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    //get an object of Shape Rectangle
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    //call draw method of Shape Rectangle
    shape1.draw();
    //get an object of Shape Square
    Shape shape2 = shapeFactory.getShape("SQUARE");
    //call draw method of Shape Square
    shape2.draw();
    //get shape factory
    AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
    //get an object of Shape Rectangle
    Shape shape3 = shapeFactory1.getShape("RECTANGLE");
    //call draw method of Shape Rectangle
    shape3.draw();
    //get an object of Shape Square
    Shape shape4 = shapeFactory1.getShape("SQUARE");
    //call draw method of Shape Square
    shape4.draw();
  }
}
