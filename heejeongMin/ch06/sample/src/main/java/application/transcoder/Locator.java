package application.transcoder;

public class Locator {
  private static Locator instance;
  private JobQueue jobQueue;
  private Transcoder transcoder;

  public Locator(JobQueue jobQueue, Transcoder transcoder){
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public JobQueue getJobQueue() {
    return this.jobQueue;
  }

  public Transcoder getTranscoder(){
    return this.transcoder;
  }

  public static void init(Locator locator){
    Locator.instance = locator;
  }

  public static Locator getInstance(){
    return instance;
  }
}
