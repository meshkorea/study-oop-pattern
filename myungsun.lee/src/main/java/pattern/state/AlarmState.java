package pattern.state;

public class AlarmState implements ChangeState{

  int min;
  final int ALARM_TIME=5;

  public AlarmState(){
    System.out.println("alarm 상태");
    min =0;
  }

  @Override
  public void normal(Clock clock) {
    while (min < ALARM_TIME){
      System.out.println("min :"+ min);
      min++;
    }
    clock.setState(new NormalState());
  }

  @Override
  public void alarm(Clock clock) {

  }
}
