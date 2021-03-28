# Chapter 3  다형성과 추상 타입



## 3.1  상속 개요

`LimitedPriceCoupon extends Coupon`

Coupon: super (상위) / parent class

LimitedPriceCoupon: sub (하위) / child class



Important: 상위 클래스에서 접근 범위가 private이면 하위 클래스에서 접근할 수 없음



## 3.2  다형성과 상속

Polymorphism = 한 객체가 여러 타입을 가질 수 있다

```java
public class Plane {
    public void fly() {
        // fly
    }
}

public interface Turbo {
    public void boost();
}

public class TurboPlane extends Plane implements Turbo {
    public void boost() {
        // boost
    }
}
```

Turboplane 타입의 객체를 Plane 타입 또는 Turbo 타입에 할당하는 것도 가능함:

```
Plane p = new TurboPlane();
```



구현 상속 vs 인터페이스 상속

"구현 상속은 보통 상위 클래스에 저의된 기능을 재사용하기 위한 목적으로 사용된다."



Question: what's the point of interface then? Not so clear why this can be useful... (e.g. `public interface Turbo` )



## 3.3  추상 타입과 유연함

"Concrete class를 직접 사용해도 문제가 없는데, 왜 추상 타입을 사용하는 것일까?"

```java
// This
LogCollector collector = createLogCollect();
// versus
SocketLogReader reader = new SocketLogReader();
```



"추상화는 변경의 유연함을 증가시켜 준다"



변화되는 부분을 추상화하려고 노력

이렇게 되면 향후 변경에 유연하게 대처할 수 있는 가능성이 높아짐



추상화가 되어 있지 않은 코드는 주로 동일 구조를 가지는 if-else block으로 드러난다.

Example:

At the beginning:

```java
public class FlowController {
  public void process() {
    FileDataReader reader = new FileDataReader();
    // more processing
  }
}
```

Then, a new requirement comes in:

```java
public class FlowController {
  public void process() {
    // lack of abstraction leads to an if-else blcok
    if (useFile) {
      FileDataReader fileReader = new FileDataReader();
      data = fileReader.read();
    } else {
      SocketDataReader socketReader = new SocketDataReader();
      data = sockerReader.read();
    }
    // more processing
  }
}
```

Better:

```java
public class FlowController {
  public void process() {
    ByteSource source = ByteSourceFactory.getInstance().create();
    byte[] data = source.read();
    // more processing
  }
}

public class ByteSourceFactor {
  public ByteSource create() {
    if (useFile()) {
      return new FileDataReader();
    } else {
      return new SocketDataReader();
    }
  }

  private boolean useFile() {
		// etc.
  }

  // Apparently this is an example of "Singleton pattern" -- what does this mean?
  private static ByteSourceFactory instance = new ByteSourceFactory();
  public static ByteSourceFactory getInstance() {
    return instance;
  }
}
```



객체 지향의 유명한 규칙이란다:

> 인터페이스에 대고 프로그래밍하기 (program to inferface)



> 변화 가능성이 높은 콘크리트 클래스 대신 이를 추상화한 인터페이스를 사용하면 (다소 구조는 복잡해지지만) 변경의 유연함이라는 효과를 얻을 수 있지만, 변경 가능성이 매우 희박한 클래스에 대해 인터페이스를 만든다면 오히려 프로그램의 구조만 복잡해지고 유연함의 효과는 누릴 수 없는 그런 상황이 발생하게 된다.



Interface를 사용하면 테스트를 할 때도 유용할 수 있다.

Example:

```java
public void testProcess() {
  ByteSource mockSource = new MockByteSource();
  // etc.
}

class MockByteSource implements ByteSource {
  // etc.
}
```

책의 저자는 이런 상황에서 Mockito도 자주 사용한단다.

