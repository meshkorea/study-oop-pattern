package pattern.proxy;

import java.io.IOException;

public class CommandExcutorImpl implements CommandExecutor {
  @Override
  public void runCommand(String cmd) throws IOException {
    // 뭔가 높은 cost의 작업이 필요함.
    Runtime.getRuntime().exec(cmd);
    System.out.println("cmd: " + cmd);
  }
}
