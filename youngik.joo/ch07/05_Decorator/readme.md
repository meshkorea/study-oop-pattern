# 05 데코레이터(Decorator) 패턴

상속을 이용한 기능 확장 방법이 쉽긴 하지만, 다양한 조합의 기능 확장이 요구될 때 클래스가 불필요하게 증가하는 문제가 발생한다.
데코레이터 패턴은 상속이 아닌 위임을 하는 방식으로 기능을 확장해 나간다.

## 데코레이터 패턴을 적용할 때 고려할 점

데코레이터 대상이 되는 타입의 기능 개수
- 정의되어 있는 메서드가 증가하면 그 만큼 데코레이터의 구현도 복잡해진다

데코레이터 객체가 비정상적으로 동작하면 어떻게 처리할 것인가
- 중간에 문제가 발생할 경우, 계속 진행할지 멈출지 고민 
- 어디까지 트랜잭션으로 묶어야 하는가

단점
- 사용자 입장에서 데코레이터 객체와 실제 구현 객체의 구분이 되지 않기 때문에 코드만으로는 기능이 어떻게 동작하는지 이해하기 어렵다

