package application.ui;

import application.transcoder.JobData;
import application.transcoder.JobQueue;
import application.transcoder.Locator;

public class JobCLI {
  private JobQueue jobQueue;

  public JobCLI (JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }

  public void interact() {
    printInputSourceMessage();
    String source = getSourceFromConsole();
    printInputTargeMessage();
    String target = getTargetFromConsole();

    JobQueue jobQueue = Locator.getInstance().getJobQueue();
    jobQueue.addJob(new JobData());
  }

  public void printInputSourceMessage() {

  }

  public void printInputTargeMessage() {

  }

  public String getSourceFromConsole() {
    return "";
  }

  public String getTargetFromConsole() {
    return "";
  }

}
