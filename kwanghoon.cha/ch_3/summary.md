# 다형성과 추상타입

## 상속 개요
`상속`은 한 타입을 그대로 사용하면서 구현을 추가할 수 있도록 해주는 방법을 제공하는 것 

**부모 클래스를 지칭하는 용어**</br>
super, parent 클래스

**자식 클래스를 지칭하는 용어**</br>
sub, child 클래스

일반적으로 대부분의 프로그래밍 언어들은 private 범위를 갖는 메서드나 필드를 제외한 나머지를 물려 받을 수 있도록 하고있다.

**재정의**</br>
하위 클래스는 필요에 따라 상위 클래스에 정의된 메서드를 새롭게 구현 가능

</br>

## 다형성과 상속
`다형성`은 한 객체가 여러 가지(poly) 모습(morph)를 갖는다는 것을 의미
즉, `다형성`이란 한 객체가 여러 타입을 가질 수 있다는 것을 뜻한다.


### 인터페이스 상속과 구현 상속
- 인터페이스 상속 : 타입 정의만을 상속 받는 것 (다중상속을 지원하지 않는 언어에서 인터터페이스를 통해 갹체가 다형을 갖게됨)
- 구현 상속 : 클래스 상속을 통해 이루어짐, 보통 상위 클래스에 정의된 기능을 재사용 하기 위한 목적 

### 추상타입과 유연함

**추상화**</br>
데이터나 프로세스등을 의미가 있는 개념이나 표현으로 정의하는것

추상화된 타입은 오퍼레이션의 시그니쳐만 정의할 뿐 실제 구현을 제공하지는 못함

**재사용**</br>
하위수준의 상세구현보다는 변하지 않는 상위 수준의 로직을 재사용 할 수 있도록 설계하는것이 중요

### 변화되지 않는 부분 추상화 하기
변화되는 부분을 추상화 하게 되면 향후 변경에 유연하게 대처할 수 있는 가능성이 높아진다.

**인터페이스에 대고 프로그래밍 하기**
실제 구현을 제공하는 콘크리트 클래스를 사용하지 말고, 기능을 정의한 인터페이스를 사용해서 프로그래밍 해라 

</br>

## 추상 타입과 유연함


# DI(Dependency Injection)
실제 구현을 제공하는 콘크리트 클래스를 사용하지 말고, 기능을 정의한 인터페이스를 사용해서 프로그래밍 하는것을 지향

기존 코드를 건드리지 않으면서 콘크리트 클래스를 교체할 수 있는 유연함이 장점

테스트시에 실제 구현체가 없어도 Mock객체를 사용함으로써 테스트가 용이하다.