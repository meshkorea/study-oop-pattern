public class ListCommand implements ICommand{

  @Override
  public String process(String message) {
    return "ListCommand =" + message + " 호출 되었습니다.";
  }
}
