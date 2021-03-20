package application;

import application.transcoder.JobData;
import application.transcoder.JobQueue;

public class DbJobQueue implements JobQueue {

  @Override
  public void addJob(JobData job) {

  }

  @Override
  public JobData getJob() {
    return null;
  }
}
