# 2  객체 지향

- 객체 지향 vs 절차 지향 ("대조되는 기법")
- 객체 지향의 핵심 <- 캡슐화 & 추상화



## 2.1  절차 지향과 객체 지향

절차 지향:

- Consists of procedures s.t. 데이터를 중심으로
- Writing code to deal with data and its procedure perhaps feels natural -- thus easy to write procedural oriented code; but is prone to changes
- Example:  procedure deals with boolean type for certain data, but the another "status" is added -- then all procedures must be changed

객체 지향:

- 데이터 & procedure를 object 단위로 묶는다
- 프로그램 규모가 작을 때는 절차 지향보다 더 복잡한 구조 & more difficult to 설계



## 2.2  객체 (Object)

객체는 객체가 제공하는 기능으로 정의된다

Interface: the set of operations that the object provides

- Note: not necesarily referring to Java's interface class



## 2.3  객체의 책임과 크기

Responsibility <-> 객체가 제공하는 기능

In OOP, it is difficult to assign responsibilities to each object (many options possible)

확실한 규칙 존재: 객체가 가지는 responsibility의 크기는 작을수록 좋다

- Extreme example: 한개의 object가 모든 기능을 제공하면 이건 그냥 절차 지향적인 구조

- 따라서, fewer responsibilities per object -> 객체 지향의 장점인 flexibility to changes -> Single Responsibility Principle

- "자연스럽게 기능의 세부 내용이 변경될 때, 변경해야 할 부분이 한 곳으로 집중된다"



## 2.4  의존

Dependency: 한 object가 다른 object를 생성하거나 method를 하출할 때

Dependency는 UML에서 dotted arrow (arrow from A to B == A depends on B)

따라서, if an object changes, then all of its "parents" are prone to changes

- ...which is another reason to avoid 순환 의존

- 순환 의존이 발생하지 않도록 하는 원칙 중의 하나로 Dependency Inversion Principle이 있다 (Chapter 5)



## 2.5  캡슐화

Encapsulation: 객체가 내부적으로 기능을 어떻게 구현하는지 감추는 것

예제:

회원 만료 관련 내용을

```java
if ((member.getExpiryDate() != null) && (someOtherCondition)) {
  // some action
}
```

식으로 여러곳에서 작성했으면, 나중에 회원 만료 기준이 바뀌면 여러곳이 수정되어야 한다. Instead, better to do

```java
if (member.isExpired()) {
  // some action
}

public class Member {
  // ...
  public boolean isExpired(...) {
    // ...
  }
}
```



Two rules:

1. Tell, don't ask

- "데이터를 물어보지 않고, 기능을 실행해 달라고 말하는 규칙"
- e.g. 회원 만료에서 데이터 관련 조건을 늘어놓지 않고 `if (member.isExpired())` 방식으로

2. Law of Demeter

- Method에서 생성한 object의 method만 호출
- Parameter로 받은 object의 method만 호출
- Field로 참조하는 object의 method만 호출

어떻게 보면 2번이 1번을 따를 수 있도록 도와준다.

2번 example:

```java
public void someMethod(Member member) {
  // Violated Rule 2, since we called .getTime()
  if (member.getDate().getTime() < ...) {
    // ...
  }
}
```



2번을 지키기 않는 젼형적인 예제:

- 연속된 get method 호출
- 임시 변수의 get 호출이 많음



## 2.6  객체 지향 설계 과정

제공해야 할 기능 찾기 -> 세분화 -> 기능에 맞는 객체에 할당

Example:

암호화 객체에서 "흐름 제어" 와 "데이터 암호화" 기능을 담당하고 있는 상태

그러면 암호화 기능을 테스트할 때 어려울수도 있기도 하고

"흐름제어 객체"를 따로 분리하면 더 좋겠다