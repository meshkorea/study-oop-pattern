package study.pattern.facade;

public class EmpReportDaoFacade {

  private EmpDao empDao = new EmpDao();
  private EvaluationDao evaluationDao = new EvaluationDao();
  private ResumeDao resumeDao = new ResumeDao();

  public EmpReport getEmpReportData(Long id) {

    Emp emp = empDao.select(1);
    Evaluation evaluation = evaluationDao.select(1);
    Resume resume = resumeDao.select(1);

    return new EmpReport(emp, evaluation, resume);
  }
}
