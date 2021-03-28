package application.isp;

public class DataDisplayer {

  public void updateGui(String data){
    GuiData guiModel = parseDataToGuiData(data);
//    tableUI.changeData(guiModel);
  }
  private GuiData parseDataToGuiData(String data){
    return new GuiData();
  }

  public static class GuiData {
  }

}
