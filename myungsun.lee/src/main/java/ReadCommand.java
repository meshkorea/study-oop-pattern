public class ReadCommand implements ICommand{

  @Override
  public String process(String message) {
    return "ReadCommand =" + message + " 호출 되었습니다.";
  }
}
