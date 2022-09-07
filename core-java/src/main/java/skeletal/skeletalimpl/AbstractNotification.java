package skeletal.skeletalimpl;

abstract class AbstractNotification implements Notification {
  @Override
  public void start() {
    System.out.println("Start notification module");
  }

  @Override
  public void stop() {
    System.out.println("Stop notification module");
  }

  @Override
  public void process() {
    start();
    chooseChannel();
    stop();
  }
}
