package study.pattern.facade;

public class ExcelExporter {

  EmpDao empDao;
  EvaluationDao evaluationDao;
  ResumeDao resumeDao;

  public ExcelExporter(EmpDao empDao, EvaluationDao evaluationDao, ResumeDao resumeDao) {
    this.empDao = empDao;
    this.evaluationDao = evaluationDao;
    this.resumeDao = resumeDao;
  }

  public void display() {
    // 생략

    Emp emp = empDao.select(1);
    Evaluation evaluation = evaluationDao.select(1);
    Resume resume = resumeDao.select(1);

    // 조합해서 Display
  }
}
