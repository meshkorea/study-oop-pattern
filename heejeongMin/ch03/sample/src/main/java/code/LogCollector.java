package code;

public interface LogCollector {

  public void collect();

  class FtpLogFileDownloader implements LogCollector {

    @Override
    public void collect() {
      System.out.println("FtpLogFileDownloader created");
    }
  }

  class SocketLogReader implements LogCollector {

    @Override
    public void collect() {
      System.out.println("SocketLogReader created");
    }
  }

  class DbTableLogGateway implements LogCollector {

    @Override
    public void collect() {
      System.out.println("DbTableLogGateway created");
    }
  }

  enum LogCollectorType {
    File,
    Socket,
    Db;
  }

}


