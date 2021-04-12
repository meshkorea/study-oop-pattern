package study.pattern.decorator;

public class FileOutImpl implements FileOut {

  @Override
  public void write(byte[] data) {
    System.out.println("파일을 출력합니다");
  }
}
