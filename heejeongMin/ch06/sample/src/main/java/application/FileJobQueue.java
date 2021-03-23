package application;

import application.transcoder.JobData;
import application.transcoder.JobQueue;

public class FileJobQueue implements JobQueue {

  public FileJobQueue(){}

  @Override
  public void addJob(JobData job) {

  }

  @Override
  public JobData getJob() {
    return null;
  }
}
