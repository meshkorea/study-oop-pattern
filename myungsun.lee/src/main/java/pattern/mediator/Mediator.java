package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

  List<Destination> list = new ArrayList<Destination>();
  public void addDestination(Destination destination){
    list.add(destination);
  }
  public void onEvent(String from, String event){
    for(Destination each : list){
      // 이벤트의 전송
      each.receiveEvent(from, event);
    }
  }

}
