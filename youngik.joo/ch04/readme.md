# 재사용: 상속보단 조립

## 책 내용 정리

### 1. 상속과 재사용

상속을 통한 재사용의 단점
- 상위 클래스 변경의 어려움
- 클래스의 불필요한 증가
- 상속의 오용

### 2. 조립을 이용한 재사용

재사용의 단점은 상대적으로 런타임 구조가 복잡해진다는 점.
상속보다 구현이 더 어렵다.

하지만 장기적 관점에서 구현/구조의 복잡함보다 변경의 유연함을 확보하는데서 오는 장점이 더 크다.

#### 상속은 언제 사용하나?

재사용의 관점이 아닌 기능의 확장이라는 관점에서 사용
- 명확한 IS-A 관계에서 점진적으로 상위 클래스의 기능을 확장해 나갈 때
- 이후에 클래스의 개수가 불필요하게 증가하는 문제가 발생하거나 상위 클래스의 변경이 어려워지는 등 상속의 단점이 발견되면 조립으로 전환하는 것을 고려해야 한다.



