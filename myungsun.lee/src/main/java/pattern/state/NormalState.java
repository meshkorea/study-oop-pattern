package pattern.state;

public class NormalState implements ChangeState{

  private Clock clock;
  public NormalState(){
    System.out.println("Normal 상");
  }
  @Override
  public void normal(Clock clock) {
    System.out.println("normal normal method 호");
  }

  @Override
  public void alarm(Clock clock) {
    System.out.println("normal alarm method 호출");
    System.out.println("alarm 울리다");
    clock.setState(new AlarmState());
  }
}
