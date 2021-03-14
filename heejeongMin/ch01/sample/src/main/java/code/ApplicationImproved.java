package code;

import code.Application.Component;
import java.util.Comparator;

public class ApplicationImproved implements OnClickListener {

  private Menu menu1 = new Menu("menu1");
  private Menu menu2 = new Menu("menu2");
  private Button button1 = new Button("button1");
  private Button button2 = new Button("button2");

  private ScreenUI currentMenu = null;

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

  class Menu {

    String name;
    OnClickListener onClickListener;

    public Menu(String name) {
      this.name = name;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
      this.onClickListener = onClickListener;
    }
  }

  class Button {

    String name;
    OnClickListener onClickListener;

    public Button(String name) {
      this.name = name;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
      this.onClickListener = onClickListener;
    }

  }

  static class Component {

    String id;

    public Component(String id) {
      this.id = id;
    }

    public String getId() {
      return this.id;
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

}