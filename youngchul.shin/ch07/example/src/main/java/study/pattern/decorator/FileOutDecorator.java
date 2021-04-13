package study.pattern.decorator;

public abstract class FileOutDecorator implements FileOut {

  private FileOut delegate;

  public FileOutDecorator(FileOut delegate) {
    this.delegate = delegate;
  }

  protected void doDelegate(byte[] data) {
    delegate.write(data);
  }
}
