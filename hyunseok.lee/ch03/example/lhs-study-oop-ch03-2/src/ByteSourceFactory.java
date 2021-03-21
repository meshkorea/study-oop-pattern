public class ByteSourceFactory {
    public ByteSource create() {
        if (useFile())
            return new FileDataReader();
        else
            return new SocketDataReader();
    }

    private boolean useFile() {
        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }

    private static ByteSourceFactory instance = new ByteSourceFactory();
    public static ByteSourceFactory getInstance() {
        return instance;
    }

    private ByteSourceFactory() {}
}
