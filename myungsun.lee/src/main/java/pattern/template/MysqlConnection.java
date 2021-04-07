package pattern.template;

public class MysqlConnection extends AbstractConnectionTemplate{

  @Override
  public void setDBDriver() {
    System.out.println("Mysql DB Driver setting");
  }

  @Override
  protected void execute() {
    System.out.printf("Mysql DB execute...");
  }

}
