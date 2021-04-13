package study.pattern.decorator;

public class DecoratorClient {

  public void writeFile() {
    FileOut delegate = new FileOutImpl();
    FileOut fileOut = new EncryptionOut(delegate);
    fileOut.write("Test".getBytes());
  }
}
