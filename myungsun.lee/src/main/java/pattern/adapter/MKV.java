package pattern.adapter;

public class MKV implements MediaPackage{

  @Override
  public void playFile(String fileName) {
    System.out.println("Playing MKV File :"+fileName);
  }
}
