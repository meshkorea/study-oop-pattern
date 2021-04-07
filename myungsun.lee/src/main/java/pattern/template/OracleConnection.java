package pattern.template;

public class OracleConnection extends AbstractConnectionTemplate{

  @Override
  protected void setDBDriver() {
    System.out.println("Oracle DB setting..");
  }

  @Override
  protected void execute() {
    System.out.println("Oracle DB execute...");
  }
}
