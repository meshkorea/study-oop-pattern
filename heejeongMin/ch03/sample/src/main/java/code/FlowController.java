package code;

import java.nio.charset.StandardCharsets;

public class FlowController {

  public void process(SourceType sourceType) {
    byte[] data = ByteSourceFactory.getInstance().create(sourceType).read(); //생성의 책임을 분
    new FileDataWriter().write(new Encryptor().encrypt(data));
  }

  public interface ByteSource {
    byte[] read();
  }

  public static class ByteSourceFactory {
    public ByteSource create(SourceType sourceType){
      return (sourceType == SourceType.File)? new FileDataReader() : new SocketDataReader();
    }

    private static ByteSourceFactory instance = new ByteSourceFactory();
    public static ByteSourceFactory getInstance() {//싱글톤
      return instance;
    }

    private ByteSourceFactory (){ } //싱글톤이기 때문에 기본 생성자 외부에서 사용할 수 없게 한다.
  }

  public static class SocketDataReader implements ByteSource {

    @Override
    public byte[] read() {
      System.out.println("Read data from Socket");
      return new byte[]{};
    }
  }

  public static class FileDataReader implements ByteSource {

    @Override
    public byte[] read() {
      System.out.println("Read data from File");
      return new byte[]{};
    }
  }

  public static class FileDataWriter {

    public void write(byte[] encryptedData) {
      System.out.println(new String(encryptedData, StandardCharsets.UTF_8));
    }
  }

  public static class Encryptor {

    public byte[] encrypt(byte[] data) {
      return new byte[]{};
    }
  }

  public enum SourceType {
    File, Socket;
  }

}
