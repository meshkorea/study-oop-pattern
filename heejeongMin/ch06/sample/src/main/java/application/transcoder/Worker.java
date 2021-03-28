package application.transcoder;

public class Worker {
  private JobQueue jobQueue;
  private Transcoder transcoder;

  public Worker(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public void run(){
    boolean someCondition = true;
    while(someCondition){
      JobData jobData = jobQueue.getJob();
      transcoder.transcode(jobData.getSource(), jobData.getTarget());
      someCondition = false;
    }
  }

}
