package study.pattern.facade;

import java.io.File;

public class GUIViewer {

  EmpDao empDao;
  EvaluationDao evaluationDao;
  ResumeDao resumeDao;

  public GUIViewer(EmpDao empDao, EvaluationDao evaluationDao, ResumeDao resumeDao) {
    this.empDao = empDao;
    this.evaluationDao = evaluationDao;
    this.resumeDao = resumeDao;
  }

  public void export(File file) {
    // 생략

    Emp emp = empDao.select(1);
    Evaluation evaluation = evaluationDao.select(1);
    Resume resume = resumeDao.select(1);

    // 조합해서 Display
  }
}
