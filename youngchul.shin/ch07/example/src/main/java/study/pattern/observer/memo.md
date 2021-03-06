### 구현시 주의할 점
1. 통지기능 실행 주체
   - 하나의 주제 객체의 상태가 변경될 때마다 통보해야 한다면 주제 객체에서 직접 통지 기능을 실행하는게 좋다
   - 여러 주제 객체에서 연속적인 상태변경 이후에 옵저버에게 통지해야 한다면 주재 객체가 아닌 주제 객체의 상태를 변경하는 코드에서 통지 기능을 수행하는 것이 좋다
2. 인터페이스 개수
   - 주제 객체가 통지할 수 있는 상태 변경 내역의 종류가 다양할 경우에는 각 종류 별로 옵저버 인터페이스를 분리해서 구현하는 것이 좋다
3. 올바르지 않은 상태를 통보
   - 잘못된 시점에 상태를 통보하게 되면 옵저버 객체는 완전히지 못한 상태의 값을 조회하게 된다
   - 상속 구조라면 템플릿 메서드 패턴을 통해서 하위 클래스에서는 내부 상태 변경에 대해서만 처리하고, 상위 클래스에서 통보 기능의 흐름을 컨트롤 하도록 막을 수 있다
4. 옵저버 메서드의 실행 제한에 대한 기준
   - 예: 수 초 이내에 응답이 되어야 한다. 긴 작업일 경우 별도 스레드로 실행한다
   
### 발행 구독 패턴의 차이점
- 옵저버 패턴에서는 주제 객체가 옵저버를 알고 있다
- Pub/Sub 패턴에서는 중간에 이벤트 브로커가 있어서 이벤트 브로커에 메시지를 보내기만 하면 된다
- 옵저버 패턴을 동기 방법으로 주로 사용되고, pub/sub 패턴은 비동기 방식으로 처리 될 수 있다

### 제로 페이로드
- Header 정보만 보내고
- 수신 측에서 다시 get을 호출해서 데이터를 가져오는 방식


