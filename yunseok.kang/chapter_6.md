# Chapter 6  DI & 서비스 로케이터

소프트웨어를 두개의 영역으로 구분할 수 있다:

- 고수준 정책 및 저수준 구현을 포함한 어플리케이션 영역
- 어플리케이션이 동작하도록 각 객체들을 연결해 주는 메인 영역

이번 chapter는 메인 영역에서 객체를 연결하기 위해 사용되는 방법인 DI (dependency injection; 의존성 주입) 와 서비스 로케이터에 대한 내용이다.



## 6.1  어플리케이션 영역과 메인 영역

메인 영역은:

- 이플리케이션 영역에서 사용될 객체를 생성한다
- 각 객체 간의 의존 관계를 설정한다
- 어플리케이션을 실행한다



> 서비스 로케이터 방식은 로케이터를 통해서 필요로 하는 객체를 직접 찾는 방식인데, 이 방식에는 몇 가지 단점이 존재한다. 그래서, 서비스 로케이터를 사용하기보다는 외부에서 사용할 객체를 주입해 주는 DI 방식을 사용하는 것이 일반적이다.



## 6.2  DI를 사용한 의존 객체 사용

사용할 객체를 직접 생성할 경우, concrete class에 대한 의존이 발생함:

```java
public class Worker {
  public void run() {
    JobQueue jobQueue = new FileJobQueue(); // DIP 위반
  }
}
```

Above violates DIP (의존 역전 원칙), and consequently violates 확장 폐쇄 원칙

Better:

```java
public class Worker {
  private JobQueue jobQueue;
  private Transcoder transcoder;
  
  // 외부에서 사용할 객체를 전달받을 수 있는 방법
  public Worker(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public void run() {
    // do not need to create concrete class
  }
}
```



Main 클래스가 조립기의 역할을 할 수 있지만, 별도로 분리하면 향후에 조립기 구현 변경의 유연함을 얻을 수 있다 (e.g. `Assembler` class)

>  Spring framework가 바로 객체를 생성하고 조립해 주는 기능을 제공하는 DI 프레임워크이다.



DI 방식 두개가 존재:

1. 생성자 방식
2. 설정 메소드 방식



설정 메소드 방식에서, method chaining이 가능하도록 `setJobQueue(JobQueue jobQueue)` 같은 함수에서 리턴 타입을 void에서 Worker로 변경할 수 있음



생성자 방식:

- 객체를 생성하는 시점에서 의존 객체가 정상인지 확인 가능
- 실수로 의존 객체 설정을 안하여 NullPointerException이 발생하는 것을 방지



설정 메소드 방식:

- 어떤 이유로 인해 의존할 객체가 나중에 생성된다면 유용함
- 의존할 객체가 많을 경우 코드 가독성을 높여 주는 효과가 있음



DI & Interface & Mock을 사용하면 테스트가 쉽다.

