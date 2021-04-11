package pattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {
  private boolean isAdmin;
  private CommandExecutor executor;

  public CommandExecutorProxy(String user, String pwd) {
    if ( "seotory".equals(user) && "pw".equals(pwd) ) {
      isAdmin = true;
    }
    executor = new CommandExcutorImpl();
  }

  @Override
  public void runCommand(String cmd) throws Exception {
    if (isAdmin) {
      executor.runCommand(cmd);
    } else {
      if (cmd.trim().startsWith("rm")) {
        throw new Exception("rm is only admin");
      } else {
        executor.runCommand(cmd);
      }
    }
  }
}
