package study;

import java.time.LocalDate;
import java.util.Date;

public class App {
  public static void main(String[] args) {
    // 2020-03-01에 만료된 여성 회원
    Member janeDoe = new Member("Jane Doe", LocalDate.parse("2021-03-01"), false);
    MemberService service = new MemberService();
    service.handleRequest(janeDoe);
  }
}
