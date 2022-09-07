package main.java.skeletal.skeletalimpl;

public class PushNotification implements Notification {
  private final AbstractNotificationDelegator delegator = new AbstractNotificationDelegator();

  @Override
  public void start() {
    delegator.start();
  }

  @Override
  public void chooseChannel() {
    delegator.chooseChannel();
  }

  @Override
  public void stop() {
    delegator.stop();
  }

  @Override
  public void process() {
    delegator.process();
  }

  private class AbstractNotificationDelegator extends AbstractNotification {

    @Override
    public void chooseChannel() {
      System.out.println("Push notification channel selected");
    }
  }
}
