package application;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DataViewer {

  public void display() throws IOException, InterruptedException {
    String data = loadHtml();
    updateGui(data);
  }

  public String loadHtml() throws IOException, InterruptedException {
    HttpClient client = HttpClient.newBuilder().build();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://foo.com/")).build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    return response.body();
  }

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
