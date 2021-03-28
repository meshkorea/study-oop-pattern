package application;

import application.transcoder.JobQueue;
import application.transcoder.Transcoder;
import application.transcoder.Worker;
import application.ui.JobCLI;

public class Ch06Application {

  public static void main(String[] args) {

    Assembler assembler = new Assembler();
    assembler.createAndWire();

    final Worker worker = assembler.getWorker();
    JobCLI jobCLI = assembler.getJobCLI();

    new Thread(() -> worker.run());
  }

  public static class Assembler {

    private Worker worker;
    private JobCLI jobCLI;

    public void createAndWire() {
      JobQueue jobQueue = new FileJobQueue();
      Transcoder transcoder = new FfmpegTranscoder();
      this.worker = new Worker(jobQueue, transcoder);
      this.jobCLI = new JobCLI(jobQueue);
    }

    public Worker getWorker() {
      return this.worker;
    }

    public JobCLI getJobCLI() {
      return this.jobCLI;
    }
  }
}
