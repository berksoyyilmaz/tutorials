package skeletal.abstractimpl;

abstract class AbstractNotification {
  private void start() {
    System.out.println("Start notification module");
  }

  abstract void chooseChannel();

  private void stop() {
    System.out.println("Stop notification module");
  }

  void process() {
    start();
    chooseChannel();
    stop();
  }
}
