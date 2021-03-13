package study;

public class Application implements OnClickListener {

//  private Menu menu1 = new Menu("menu1");
//  private Menu menu2 = new Menu("menu2");
//  private Button button1 = new Button("button1");
//  private Button button2 = new Button("button2");

  private ScreenUI currentScreen = null;

  public Application() {
//    menu1.setOnClickListener(this);
//    menu2.setOnClickListener(this);
//    button1.setOnClickListener(this);
//    button2.setOnClickListener(this);
  }

  @Override
  public void clicked(Component eventSource) {
    String sourceId = eventSource.getId();
    if (sourceId.equals("menu1")) {
      currentScreen = new Menu1ScreenUI();
      currentScreen.show();
    } else if (sourceId.equals("menu2")) {
      currentScreen = new Menu2ScreenUI();
      currentScreen.show();
    } else if (sourceId.equals("button1")) {
      if (currentScreen == null) {
        return;
      }
      // 메뉴1인지 메뉴2인지 상관없이 currentScreen의 메서드를 실행
      currentScreen.handleButton1Click();
    }
  }
}
