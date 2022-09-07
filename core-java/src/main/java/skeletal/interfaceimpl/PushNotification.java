package main.java.skeletal.interfaceimpl;

class PushNotification implements Notification {
  @Override
  private void start() {
    System.out.println("Start notification module");
  }

  @Override
  public void chooseChannel() {
    System.out.println("Push notification channel selected");
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
