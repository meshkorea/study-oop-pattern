package study.pattern.decorator;

public class EncryptionOut extends FileOutDecorator {

  public EncryptionOut(FileOut delegate) {
    super(delegate);
  }
  @Override
  public void write(byte[] data) {
    byte[] encryptedData = encrypt(data);
    doDelegate(encryptedData);
  }

  private byte[] encrypt(byte[] originalData) {
    return originalData;
  }
}
