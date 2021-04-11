package pattern.state;

/**
 *
 */
public interface ChangeState {
  public void normal(Clock clock);
  public void alarm(Clock clock);
}
