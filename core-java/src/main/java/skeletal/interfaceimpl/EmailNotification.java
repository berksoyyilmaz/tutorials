package main.java.skeletal.interfaceimpl;

class EmailNotification implements Notification {
  @Override
  private void start() {
    System.out.println("Start notification module");
  }

  @Override
  public void chooseChannel() {
    System.out.println("Email notification channel selected");
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
