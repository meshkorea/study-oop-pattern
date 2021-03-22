import java.util.Scanner;

public class MainController {

  public static void main(String[] args) {
    MainController mc = new MainController();

    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    mc.process(command);

  }

  private void process(String command) {
    if("list".equals(command)) {
      System.out.println("command =" + command + " 호출 되었습니다.");
    }else if("read".equals(command)){
      System.out.println("command =" + command + " 호출 되었습니다.");
    }else if("detail".equals(command)){
      System.out.println("command =" + command + " 호출 되었습니다.");
    }else{
      System.out.println("command =" + command + " 호출 되었습니다.");
    }
  }
}
