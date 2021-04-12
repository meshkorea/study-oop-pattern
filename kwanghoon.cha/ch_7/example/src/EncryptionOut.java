public class EncryptionOut extends Decorator{
    private final String encryptionAlg = "MD5";

    public EncryptionOut(FileOut delegate){
        super(delegate);
    }

    @Override
    public void write(String data) {
        String encryptedData = encrypt(data);
        super.doDelegate(encryptedData);
    }

    private String encrypt(String data){
        return "Encrypted("+ encryptionAlg+ ") "+ data;
    }
}
