package creational.factory.af.notification.types;

import creational.factory.af.notification.NotificationComponentFactory;

public class PushNotification extends Notification {
  NotificationComponentFactory componentFactory;

  public PushNotification(NotificationComponentFactory componentFactory) {
    name = "Push Notification";
    this.componentFactory = componentFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dataFormat = componentFactory.prepareDataFormat();
    environment = componentFactory.prepareEnvironment();
  }
}
