package code;

import code.Application.Component;

class Ch01Application {

  public static void main(String[] args) {


    Application app = new Application();
    app.clicked(new Component("menu1"));
    app.clicked(new Component("button1"));
    app.clicked(new Component("button2"));
    app.clicked(new Component("menu2"));
    app.clicked(new Component("button1"));
    app.clicked(new Component("button2"));

    System.out.println();

    ApplicationImproved appImproved = new ApplicationImproved();
    appImproved.clicked(new code.ApplicationImproved.Component("menu1"));
    appImproved.clicked(new code.ApplicationImproved.Component("button1"));
    appImproved.clicked(new code.ApplicationImproved.Component("button2"));
    appImproved.clicked(new code.ApplicationImproved.Component("menu2"));
    appImproved.clicked(new code.ApplicationImproved.Component("button1"));
    appImproved.clicked(new code.ApplicationImproved.Component("button2"));


  }
}