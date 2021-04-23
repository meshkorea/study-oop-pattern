package pattern.builder;

/**
 * 빌더 패턴을 적용 시에는 다음의 효과를 기대할 수 있습니다.
 *
 * 1) 불필요한 생성자 제거
 * 2) 데이터의 순서에 상관없이 객체 생성 가능
 * 3) 명시적 선언으로 이해하기 쉬움.
 *
 */
public class BuilderTest {

  public static void main(String[] args) {
    UserInfo userInfo = new UserInfo("테스터", 25, "서울시 강남구");
    System.out.println(userInfo.getUserInfo());

    UserInfoBuilder userInfoBuilder = new UserInfoBuilder();
    UserInfo userInfo3 = userInfoBuilder
        .setName("테스터3")
        .setAddr("주소")
        .setAge(26)
        .build();

    System.out.println(userInfo3.getUserInfo());
  }

}
