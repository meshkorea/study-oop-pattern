## Chapter 5. 설계 원칙: SOLID
SOLID = 객체 지향 SW 설계 원칙
- 단일 책임 원칙 (Single responsibility principle; SRP)
- 개방-폐쇄 원칙 (Open-closed principle; OCP)
- 리스코프 치환 원칙 (Liskov substitution principle; LSP)
- 인터페이스 분리 원칙 (Interface segregation principle; ISP)
- 의존 역전 원칙 (Dependency inversion principle; DIP)

### 1. 단일 책임 원칙 (Single responsibility principle)
"클래스는 단 한 개의 책임을 가져야 한다."
#### 1.1 단일 책임 원칙 위반이 불러오는 문제점
데이터 제공하는 서버가 http 프로토콜에서 소캣 기반 프로토콜 변경되었을때(String에서 byte 배열 제공) 
연쇄적인 변화 발생  
-> 책임의 개수가 많아질수록 한 책임의 기능 변화가 다른 책임에 주는 영향은 비례해서 증가
```java
public class DataViewer {
    
    public void display() {
        String data = loadHtml();
        updateGui(data);
    }

    public String loadHtml() {
        HttpClient client = new HttpClient();
        client.connect(url);
        return client.getResponse();
    }

    private void updateGui(String data) {
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(String data) {
        // 파싱 처리 코드
    }
    // 기타 필등 등 다른 코드
}
```
> [그림 5.1] 한 책임의 변화가 다른 책임의 코드에 영향을 주는 현상  
> [그림 5.2] 책임을 분리하면 변경의 여파를 줄일수 있다.

한편, SRP 지치지 않는다면 `재사용`도 어려움
> [그림 5.3] 책임이 분리되어 있지 않아 필요하지 않은 패캐지까지 필요하다.  
> [그림 5.4] 단일 책임 원칙을 준수하면 재 사용성을 높일 수 있다.

#### 1.2 책임이란 변화에 대한 것
- 책임의 단위는 변화되는 부분과 관련
- 각각의 책임은 *서로 다른 이유로 변경*되고, 서로 다른 비율로 변경되는 특징
> [그림 5.5] 단일 책임 원칙을 지키는지 확인할 때에는 사용자를 확인해본다.
  
### 2. 개방-폐쇄 원칙 (Open-closed principle)
"확장에는 열려 있어야 하고, 변경에는 닫혀 있어야 한다."
- 기능을 변경하거나, 확장할 수 있으면서
- 그 기능을 사용하는 코드는 수정하지 않는다.

**개방-폐쇄 원칙을 구현하는 방법(1): 추상화**  
확장(변경)되는 부분을 추상화해서 표현하면, 사용하는 클래스(e.g.Flow Controller) 입장에서는 메소드 고정 가능
> [그림 5.6] 추상화를 이용한 개방 폐쇄 원치 구현  

**개방-폐쇄 원칙을 구현하는 방법(2): 상속**  
상위 클래스 기능 그대로 사용하면서, 하위 클래스 일부 구현을 오버라이딩
```java
public class ResponseSender {
    private Data data;
    public ResponseSender(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void send() {
        sendHeader();
        sendBody();
    } 

    protected void sendHeader() {
        // 헤더 데이터 전송
    }
    protected void sendBody() {
        // 텍스트로 데이터 전송
    }
}
```
ResponseSender 클래스가 제공하는 기존 기능에 '압축전송'하는 기능을 추가 (확장, 기존코드 변경x)
```java
public class ZippedResponseSender extends ResponseSender {
    public ZippedResponseSender(Data data) {
        super(data);
    }
    
    @Override
    protected void sendBody() {
        // 데이터 압축 처리
    }
}
```
#### 2.1 개방 폐쇄 원칙이 깨질 때의 주요 증상
추상화와 다형성 지켜지지 않는 코드는 OCP를 위반

**OCP 위반하는 코드 특징(1): 다운 캐스팅을 한다**
> [그림 5.7] 각자 그리는 기능을 제공하는 코드
```java
public void drawCharacter(Character character) {
    if (character instanceof Missile) { // 타입확인
        Missile missile = (Missile) character; // 타입 다운 캐스팅
        missile.drawSpecific();
    } else {
        character.draw();
    }
}
```
별도 처리하는 drawSpecific() 메서드는 Character 클래스 확장될때 함께 수정 필요(즉, 변경에 닫혀 있지 않음)  
한편, `instanceof`와 같은 타입 확인 연산자 사용될 경우 OCP 위반할 가능성 높아서, 타입 다운 캐스팅 후 실행하는 메서드가 변경 대상인지 확인 필요
(객체들마다 다르게 동작할 가능성이 높다면, 이 메서드는 알맞게 추상화해서 Character 타입에 추가 필요)

**OCP 위반하는 코드 특징(2): 비슷한 if-else 블록이 존재**
```java
public class Enemy extends Chararter {
    private int pathPattern;
    public Enemy(int pathPattern) {
        this.pathPattern = pathPattern;
    }
    public void draw() {
        if (pathPattern == 1) {
            x += 4;
        } else if (pathPattern == 2) {
            y += 10;
        } else if (pathPattern == 4) {
            x += 4;
            y += 10;
        }
        // 그려 주는 코드
    }
}
```
> [그림 5.8] 이동 경로 계산에 개방 폐쇄 원칙을 적용한 결과

Enemy 클래스에 새로운 경로 패턴을 추가해야 할 경우 draw() 메서드에 새로운 if 블록 추가 (변경에 닫혀 있지 않음)
경로 패턴을 추상화하고 Enemy 클래스에서 추상화 타입을 사용하는 구조로 변경
```java
public class Enemy extends Chararter {
    
    private PathPattern pathPattern;
    
    public Enemy(int pathPattern) {
        this.pathPattern = pathPattern;
    }
    
    public void draw() {
        int x = pathPattern.nextX();
        int y = pathPattern.nextY();
        // 그려 주는 코드
    }
}
```
#### 2.2 개방 폐쇄 원칙은 유연함에 대한 것
- OCP는 변경의 유연함과 관련된 원칙
- 변화되는 부분을 `추상화`함으로써 사용자 입장에서 변화를 고정시키거나,
- `상속`을 이용해서 변화되는 부분을 고정시켜두고, 오버라이딩해서 기존 기능을 확장
 
### 3. 리스코프 치환 원칙 (Liskov substitution principle)
"상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 동작해야 한다."  
LSP 지켜지지 않으면, 다형성에 기반한 OCP 역시 지켜지지 않음
```java
public void someMethod(SuperClass sc) {
    sc.someMethod();
}
```
```java
someMethod( new SubClass() );
```
SubClass 클래스가 SuperClass 클래스의 하위 타입일때, someMethod() 정상 동작해야 함.
#### 3.1 리스코프 치환 원칙을 지키지 않을 때의 문제
**개념적으로 상속 관계에 있는 것처럼 보이나, 실제 구현에서 별개의 타입으로 구현해야 하는 경우: 직사각형-정사격형 문제**
```java
public class Rectangle {
    private int width;
    private int height;
    
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    } 
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
}
```
정사각형을 직사각형의 특수한 경우로 보고, Square 클래스를 Rectangle 클래스에서 상속받도록 구현
```java
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);        
        super.setWidth(height);
    } 
}
``` 
Rectangle 클래스를 사용하는 코드에서 높이를 길게 만들어주는 기능(increseHeight) 제공한다고 할때, Square 클래스의 경우 실행하지 않아야 하고 `instanceof` 연산자를 사용하면서 LSP 위반  
(이는 increseHeight 메서드가 Rectangle 클래스 확장에 열려있지 않다는 의미)
```java
public void increseHeight(Rectangle rec) {
    if (rec instanceof Square) {
        throw new CantSupportSquareException();
    }
    if (rec.getHeight() <= rec.getWidth()) {
        rec.setHeight(rec.getHeight() + 10);
    }
}
```
**하위 타입의 리턴 값이 상위 타입에서 지정한 리턴 값의 범위에 해당되지 않는 경우**
```java
public void CopyUtil() {
    public static void copy(InputStream in, OutputStream out) {
        byte[] data = new byte[512];
        int len = -1;

        // InputStream.read() 메서드는 스트림의 끝에 도달하면 -1 리턴
        while ((len = is.read(data)) != -1) {
            out.write(data, 0, len);
        }
    }
}
```
InputStream 클래스를 상속한 하위 타입에서 read() 메서드를 다르게 구현하는 경우 문제가 발생할 수 있음
```java
public class SatanInputStream implements InputStream {
    public int read(byte[] data) {
        ...
        return 0; // 데이터가 없을 때 0을 리턴하도록 구현
    }
}
```
```java
InputStream is = new SatanInputStream(someData);
OutputStream out = new FileOutStream(filePath);
CopyUtil.copy(is, out);
```
CopyUtil.copy() 메서드 종료조건 만족하지 못해서 무한루프  
SatanInputStream 타입의 객체가 상위 타입인 InputStream을 올바르게 대체하지 않기 때문에 문제

#### 3.2 리스코프 치환 원칙은 계약과 확장에 대한 것
LSP는 기능의 명세(또는 계약)에 대한 내용 (하위 타입은 상위 타입에서 정의한 명세를 벗어난지 않는 범위에서 구현해야 함)  

기능 실행의 계약과 관련해서 흔히 발생하는 위반 사례:
- 명시된 명세에서 벗어난 값을 리턴한다.
- 명시된 명세에서 벗어난 익센션을 발생한다.
- 명시된 명세에서 벗어난 기능을 수행한다.

```java
public class Coupon {
    public int calculateDiscountAmount(Item item) {
        if (item instanceof SpecialItem) { // LSP 위반 발생
            return 0;
        } 
        return item.getPrice() * discountRate;
    }
}
```
한편 SpecialItem 클래스와 같이 새로운 종류의 하위 타입이 생길때 마다 상위 타입을 사용하는 코드를 수정해줘야 할 가능성이 높을떄 LSP 위반 발생
(그 이유는 Item 클래스에 대한 추상화가 덜 되었기 때문)
```java
public class Item {
    // 변화되는 기능을 상위 타입에 추가
    public boolean isDiscountAvailable () {
        return true;
    }
    ...
}

public class SpecialItem extends Item {
    // 하위 타입에서 알맞게 오버라이딩
    @Override 
    public boolean isDiscountAvailable() {
        return false;
    }     
}
```
Item 클래스에 가격 할인 가능 여부를 판단하는 기능을 추가하고, SpecialItem 클래스는 이 기능에 맞게 재정의
그 결과 `instanceof` 연산자를 사용하는 코드를 Item 클래스만 사용하도록 구현 가능
```java
public class Coupon {
    public int calculateDiscountAmount(Item item) {
        if (! item.isDiscountAvailable()) { // instanceof 연산자 사용 제거
            return 0;
        } 
        return item.getPrice() * discountRate;
    }
}
```

---
##### 4. 인터페이스 분리 원칙 (Interface segregation principle)
##### 5. 의존 역전 원칙 (Dependency inversion principle)
