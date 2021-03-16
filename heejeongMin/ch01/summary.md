#1.지저분해지는 코드

확장성이 없는 코드는 변경된 요구사항이 들어오는경우 반복적인 코드 및 오류를 유발할수 있는 상황을 만들 수 있다. 
다음 코드에서 메뉴 혹은 버튼이 늘어나게 되면 각각 if-else문을 복붙을 해야 하는 상황이 오고, 개수가 많아지게 되면
코드가 길어질 뿐만 아니라 휴먼에러로 이어지기 쉽다. 
``` JAVA
  private Menu menu1 = new Menu("menu1");
  private Menu menu2 = new Menu("menu2");
  private Button button1 = new Button("button1");
  private Button button2 = new Button("button2");

  private String currentMenu = null;

  public Application() {
    menu1.setOnClickListener(this);
    menu2.setOnClickListener(this);
    button1.setOnClickListener(this);
    button2.setOnClickListener(this);
  }

  public void clicked(Component eventSource) {
    if (eventSource.getId().equals("menu1")) {
      changeUIToMenu1();
    } else if (eventSource.getId().equals("menu2")) {
      changeUIToMenu2();
    } else if (eventSource.getId().equals("button1")) {
      if (currentMenu == null) {
        return;
      }
      if (currentMenu.equals("menu1")) {
        processButton1WhenMenu1();
      } else if (currentMenu.equals("menu2")) {
        processButton1WhenMenu2();
      }
    } else if (eventSource.getId().equals("button2")) {
      if (currentMenu == null) {
        return;
      }
      if (currentMenu.equals("menu1")) {
        processButton2WhenMenu1();
      } else if (currentMenu.equals("menu2")) {
        processButton2WhenMenu2();
      }
    }
  }
```

#2. 수정하기 좋은 구조를 가진 코드

위의 코드를 객체지향적인 방법으로 확장성 있게 구현해야한다.
1. 공통 코드는 추상화한다. 
  : 메뉴를 클릭하면 화면 변경, button 클릭시 액션 취하는 두 가지 공통된 작업을 추상화 할 수 있다.
2. 서로 다른 기능은 분리한다.
  : 메뉴와 버튼은 서로 다른 작업을 진행함으로 둘을 서로 분리한다. 
  
``` JAVA
public ApplicationImproved() {
    menu1.setOnClickListener(new MenuListener());
    menu2.setOnClickListener(new MenuListener());
    button1.setOnClickListener(new ButtonListener());
    button2.setOnClickListener(new ButtonListener());
  }

  public void clicked(Component component){
    if(component.getId().contains("menu")) {
      new MenuListener().clicked(component);
    } else {
      new ButtonListener().clicked(component);
    }
  }

  interface OnClickListener {
    void clicked(Component eventSource);
  }

  class MenuListener implements OnClickListener {

    @Override
    public void clicked(Component eventSource) {
      String sourceId = eventSource.getId();
      if (eventSource.getId().equals("menu1")) {
        currentMenu = new Menu1ScreenUI();
        currentMenu.show();
      } else if (eventSource.getId().equals("menu2")) {
        currentMenu = new Menu2ScreenUI();
        currentMenu.show();
      }
    }
  }

  class ButtonListener implements OnClickListener {
    @Override
    public void clicked(Component eventSource){
      if (eventSource.getId().equals("button1")) {
        if (currentMenu == null) {
          return;
        }
        currentMenu.handleButtonClick();
      } else if (eventSource.getId().equals("button2")) {
        if (currentMenu == null) {
          return;
        }
        currentMenu.handleButtonClick();
      }
    }
  }
```