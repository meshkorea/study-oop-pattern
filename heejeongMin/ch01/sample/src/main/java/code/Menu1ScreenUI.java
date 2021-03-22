package code;

public class Menu1ScreenUI implements ScreenUI{

  @Override
  public void show() {
    System.out.println("메뉴1 화면으로 전환");
  }

  @Override
  public void handleButtonClick() {
    System.out.println("메뉴 1 화면의 버튼 처리");
  }
}
