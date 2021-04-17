package study.pattern.facade;

public class EmpDao {

  public Emp select(long id) {
    return new Emp(id);
  }
}
