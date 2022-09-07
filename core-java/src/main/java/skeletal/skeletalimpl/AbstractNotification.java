package main.java.skeletal.skeletalimpl;

abstract class AbstractNotification implements Notification {
  @Override
  private void start() {
    System.out.println("Start notification module");
  }

  @Override
  private void stop() {
    System.out.println("Stop notification module");
  }

  @Override
  public void process() {
    start();
    chooseChannel();
    stop();
  }
}
