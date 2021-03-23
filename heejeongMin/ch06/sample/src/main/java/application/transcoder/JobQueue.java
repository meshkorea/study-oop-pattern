package application.transcoder;

public interface JobQueue {
  void addJob(JobData job);
  JobData getJob();

}
