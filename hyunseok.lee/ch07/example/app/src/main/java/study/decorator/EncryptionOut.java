package study.decorator;

public class EncryptionOut extends Decorator {
    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptedData = encrypt(data);
        super.doDelegate(encryptedData);
    }

    private byte[] encrypt(byte[] data) {
        return null;
    }
}
