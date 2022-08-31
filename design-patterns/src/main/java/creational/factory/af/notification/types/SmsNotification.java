package creational.factory.af.notification.types;

import creational.factory.af.notification.NotificationComponentFactory;

public class SmsNotification extends Notification {
  NotificationComponentFactory componentFactory;

  public SmsNotification(NotificationComponentFactory componentFactory) {
    name = "SMS Notification";
    this.componentFactory = componentFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dataFormat = componentFactory.prepareDataFormat();
    environment = componentFactory.prepareEnvironment();
  }
}
