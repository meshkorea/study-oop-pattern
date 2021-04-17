package study.pattern.facade;

import java.io.File;

public class GUIViewer {

  private EmpReportDaoFacade reportDaoFacade = new EmpReportDaoFacade();

  public void export(File file) {
    // 생략

    EmpReport empReportData = reportDaoFacade.getEmpReportData(1l);

    // Report Data를 이용해서 Display 코드 구현
  }
}
