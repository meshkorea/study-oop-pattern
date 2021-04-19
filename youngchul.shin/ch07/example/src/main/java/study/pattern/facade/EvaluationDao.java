package study.pattern.facade;

public class EvaluationDao {

  public Evaluation select(long id) {
    return new Evaluation(id);
  }
}
