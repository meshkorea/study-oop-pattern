package study;

public class App {
  public static void main(String[] args) {
    Application app = new Application();
    app.clicked(new Menu("menu1"));
    app.clicked(new Button("button1"));
    app.clicked(new Menu("menu2"));
    app.clicked(new Button("button1"));
  }
}
