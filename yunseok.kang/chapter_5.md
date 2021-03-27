# Chapter 5  설계 원칙: SOLID

SOLID: 변화에 유연하게 대처할 수 있는 설계 원칙



## 5.1  Single responsibility principle

> 클래스는 단 한 개의 책임을 가져야 한다.

어려움 -- 한 개의 책임에 대해 정의가 명확하지 않고, 책임을 도출하기 위해 다양한 경험이 필요

SRP를 지키지 않았을 때, 한 책임의 구현 변경에 의해 다른 책임과 관련된 코드가 변경될 가능성이 높아진다



## 5.2  Open-closed principle

> 확장에는 열려 있어야 하고, 변경에는 닫혀 있어야 한다.

OCP를 지키기 위해 확장되는 부분 (i.e. 변화되는 부분)을 (interface class를 사용해서) 추상화 할 수 있다 (변경에는 닫혀있음).

기능을 추가해야 할 경우, interface class 를 상속받는 클래스를 구현함으로서 기능 추가가 가능하다 (확장에는 열려있음).



OCP를 구현하는 또 다른 방법은 상속을 이용하는 것

상위 클래스의 기능을 그대로 사용하면서 하위 클래스에서 일부 구현을 override

> sendHeader() 메서드와 sendBody 메서드는 protected 공개 범위를 갖고 있기 때문에, 하위 클래스에서 이 두 메서드를 오버라이딩 할 수 있다.

상속받은 클래스에서 기능이 바뀐다고 해서 상위 클래스가 변경되지는 않는다 (thus obeys OCP)



OCP가 깨질 때의 주요 증상

- Downcasting을 한다
- 비슷한 if-else 블록이 존재한다



기존 기능을 `확장` 하기 위해 기존 코드를 수정해야 하면, 새로운 기능을 추가하는 것이 점점 힘들어짐

변화가 예상되는 것을 추상화해서 변경의 유연함을 얻도록 해줌



## 5.3  Liskov substitution principle

> 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 동작해야 한다.

LSP를 설명할 때 자주 사용되는 예제는 직사각형 - 정사각형 문제

> Rectangle 클래스를 상속받아 Square 클래스를 구현하는 것이 합리적으로 보일 수 있으나, 실제 프로그램에서는 이 둘을 상속 관계로 묶을 수 없는 것이다.



LSP는 기능의 계약에 대한 내용

기능 실행의 계약과 관련해서 흔히 발생하는 위반 사례:

- 명시된 명세에서 벗어난 값을 리턴
- 명시된 명세에서 벗어난 exception
- 명시된 명세에서 벗어난 기능을 수행



LSP를 어기면 OCP를 어길 가능성이 높다. Example: 쿠폰 / 할인

Bad:

```java
public class Coupon {
  public int calculateDiscountAmount(Item item) {
    if (item instanceof Specialitem) {
      return 0;
    }
    return item.getPrice() * discountRate;
  }
}
```

Better:

```java
public class Coupon {
  public int calculateDiscountAmount(Item item) {
    if (!item.isDiscountAvailable()) {
      return 0;
    }
    return item.getPrice() * discountRate;
  }
}

public class Item {
  public boolean isDiscountAvailable() {
    return true;
  }
}

public class Specialitem extends Item {
  @Override
  public boolean isDiscountAvailable() {
    return false;
  }
}
```



## 5.4  Interface segregation principle

> 인터페이스는 그 인터페이스를 사용하는 클라이언트를 기준으로 분리해야 한다.
>
> Or, equivalently,
>
> 클라이언트는 자신이 사용하는 메서드에만 의존해야 한다.



각 클라이언트가 사용하는 기능을 중심으로 인터페이스를 분리함으로써, 클라이언트로부터 발생하는 인터페이스 변경의 여파가 다른 클라이언트에 미치는 영향이 최소화된다.



##  5.5  Dependency inversion principle

> 고수준 모듈은 저수준 모듈의 구현에 의존해서는 안 된다. 저수준 모듈이 고준 모듈에서 정의한 추상 타입에 의존해야 한다.



> 의존 역전 원칙은 [...] 저수준 모듈이 고수준 모듈을 의존하게 만들어서 해결한다.
>
> 고수준 모듈에서 저수준 모듈을 사용한다는 것은 고수준 모듈을 저수준 모듈에 의존한다는 의미인데, 어떻게 저수준 모듈이 고수준 모듈을 의존하게 만든다는 걸까?
>
> 답은 추상화에 있다.

​                                                                                                                                                                                                                                                                                                                                                                                             소스 코드 의존 vs 런타임 의존

