package study.pattern.facade;

public class EmpReport {

  private Emp emp;
  private Evaluation evaluation;
  private Resume resume;

  public EmpReport(Emp emp, Evaluation evaluation, Resume resume) {
    this.emp = emp;
    this.evaluation = evaluation;
    this.resume = resume;
  }
}
