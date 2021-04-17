package study.pattern.facade;

public class ExcelExporter {

  private EmpReportDaoFacade reportDaoFacade = new EmpReportDaoFacade();

  public void display() {
    // 생략

    EmpReport empReportData = reportDaoFacade.getEmpReportData(1l);

    // Report Data를 이용해서 Display 코드 구현
  }
}
