package pattern.observer;

/**
 * 예를 들어 한 객체의 상태가 바뀔 경우 다른 객체들에게 변경됐다고 알려주는 경우를 들 수 있다.
 * 상태를 가지고 있는 주체 객체와 상태의 변경을 알아야 하는 관찰 객체(Observer Object)가 존재하며
 * 이들의 관계는 1:1이 될 수도 있고 1:N이 될 수가 있다.
 * 서로의 정보를 넘기고 받는 과정에서 정보의 단위가 클 수록, 객체들의 규모다 클 수록, 각 객체들의 관계가 복잡할 수록
 * 점점 구현하기 어려워지고 복잡성이 매우 증가할 것이다.
 * 이러한 기능을 할 수 있도록 가이드라인을 제시해 주는 것이 바로 옵저버 패턴이다.
 *
 * 출처: https://flowarc.tistory.com/entry/디자인-패턴-옵저버-패턴Observer-Pattern [Stop the World]
 */
public interface Observer {
  public void update(String title, String news);
}
