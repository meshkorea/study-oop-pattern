package code;

public class Menu2ScreenUI implements ScreenUI{

  @Override
  public void show() {
    System.out.println("메뉴2 화면으로 전환");
  }

  @Override
  public void handleButtonClick() {
    System.out.println("메뉴 2 화면의 버튼 처리");
  }
}
