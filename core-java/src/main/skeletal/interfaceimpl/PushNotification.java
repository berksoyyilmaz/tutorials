package main.skeletal.interfaceimpl;

class PushNotification implements Notification {
  @Override
  public void start() {
    System.out.println("Start notification module");
  }

  @Override
  public void chooseChannel() {
    System.out.println("Push notification channel selected");
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
