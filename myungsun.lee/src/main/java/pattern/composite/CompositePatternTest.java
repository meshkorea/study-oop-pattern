package pattern.composite;

/**
 * 컴포지트(Composite) 란?
 * OOP 에서 컴포지트(Composite) 는 하나 이상의 유사한 객체를 구성으로 설계된 객체로 모두 유사한 기능을 나타낸다.
 * 이를 통해 객체 그룹을 조작하는 것처럼, 단일 객체를 조작할 수 있다
 *
 * 컴포지트 패턴은 클라이언트가 복합 객체(group of object) 나 단일 객체를 동일하게 취급하는 것을 목적으로 한다.
 *
 * 여기서 컴포지트의 의도는 트리 구조로 작성하여, 전체-부분(whole-part) 관계를 표현하는 것이다
 *
 *
 *
 */
public class CompositePatternTest {

  public static void main(String[] args) {
    Ellipse ellipse1 = new Ellipse();
    Ellipse ellipse2 = new Ellipse();
    Ellipse ellipse3 = new Ellipse();
    Ellipse ellipse4 = new Ellipse();
    //Initialize three composite graphics
    CompositeGraphic graphic = new CompositeGraphic();
    CompositeGraphic graphic1 = new CompositeGraphic();
    CompositeGraphic graphic2 = new CompositeGraphic();
    //Composes the graphics
    graphic1.add(ellipse1); // children - leaf
    graphic1.add(ellipse2); // children - leaf
    graphic1.add(ellipse3); // children - leaf
    graphic2.add(ellipse4); // children - leaf
    graphic.add(graphic1); // children - composite
    graphic.add(graphic2); // children - composite
    // Prints the complete graphic (Four times the string "Ellipse").
    graphic.print();

  }
}
