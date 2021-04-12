public class MockByteSource implements ByteSource {
    public byte[] read() {
        byte[] data = new byte[128];
        return data;
    }
}
