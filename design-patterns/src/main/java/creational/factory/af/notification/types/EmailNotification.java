package creational.factory.af.notification.types;

import creational.factory.af.notification.NotificationComponentFactory;

public class EmailNotification extends Notification {
  NotificationComponentFactory componentFactory;

  public EmailNotification(NotificationComponentFactory componentFactory) {
    name = "Email Notification";
    this.componentFactory = componentFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dataFormat = componentFactory.prepareDataFormat();
    environment = componentFactory.prepareEnvironment();
  }
}
