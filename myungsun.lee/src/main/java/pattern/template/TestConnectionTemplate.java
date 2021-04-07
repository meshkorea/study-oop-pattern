package pattern.template;

public class TestConnectionTemplate {

  public static void main(String[] args) {
    System.out.println("Mysql Test");
    AbstractConnectionTemplate mysql = new MysqlConnection();
    mysql.run();
    System.out.println("oracle Test");
    AbstractConnectionTemplate oracle = new OracleConnection();
    oracle.run();

  }
}
