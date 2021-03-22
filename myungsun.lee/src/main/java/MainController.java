import java.util.Scanner;

public class MainController {

  public static void main(String[] args) {
    MainController mc = new MainController();

    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    mc.process(command);

  }

  private void process(String command) {
    ICommand cmd = null;
    if("list".equals(command)) {
      //System.out.println("command =" + command + " 호출 되었습니다.");
      cmd = new ListCommand();
      cmd.process("List Message");
    }else if("read".equals(command)){
      cmd = new ReadCommand();
      cmd.process("Read Message");
    }else if("detail".equals(command)){
      System.out.println("command =" + command + " 호출 되었습니다.");
    }else{
      System.out.println("command =" + command + " 호출 되었습니다.");
    }
  }
}
