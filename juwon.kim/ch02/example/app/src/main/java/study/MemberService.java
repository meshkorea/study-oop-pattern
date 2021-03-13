package study;

import java.time.LocalDate;

public class MemberService {

  public void handleRequest(Member member) {
    if (member.isMale() && member.getExpiryDate() != null &&
        member.getExpiryDate().isBefore(LocalDate.now())) {
      System.out.println(String.format("%s님은 %s에 가입 기간이 만료되어 서비스를 사용하실 수 없습니다",
          member.getName(),  member.getExpiryDate()));
    }
    if (!member.isMale() && member.getExpiryDate() != null &&
        member.getExpiryDate().isBefore(LocalDate.now().minusDays(30))) {
      System.out.println(String.format("%s님은 %s에 가입 기간이 만료되어 서비스를 사용하실 수 없습니다",
          member.getName(),  member.getExpiryDate()));
    }
  }
}
