public class FlowController {
    private boolean useFile;

    public FlowController(boolean useFile) {
        this.useFile = useFile;
    }

    public void process() {
        ByteSource source = null;

        if(useFile) {
            source = new FileDataReader();
        } else {
            source = new SocketDataReader();
        }

        byte[] data = source.read();
        
        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);
    }
}
