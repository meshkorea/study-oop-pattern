package pattern.state;

public class Clock {
  private ChangeState state;

  public Clock(){
    state = new NormalState();
  }

  public void setState(ChangeState state){
    this.state = state;
  }
  public void normal(){
    state.normal(this);
  }

  public void alarm(){
    state.alarm(this);
  }
}
