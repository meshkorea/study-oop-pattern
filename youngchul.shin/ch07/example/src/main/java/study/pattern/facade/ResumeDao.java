package study.pattern.facade;

public class ResumeDao {

  public Resume select(long id) {
    return new Resume(id);
  }
}
