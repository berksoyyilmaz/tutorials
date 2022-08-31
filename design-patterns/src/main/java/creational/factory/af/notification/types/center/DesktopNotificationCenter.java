package creational.factory.af.notification.types.center;


import creational.factory.af.notification.DesktopNotificationComponentFactory;
import creational.factory.af.notification.NotificationComponentFactory;
import creational.factory.af.notification.types.EmailNotification;
import creational.factory.af.notification.types.Notification;
import creational.factory.af.notification.types.PushNotification;
import creational.factory.af.notification.types.SmsNotification;

public class DesktopNotificationCenter extends NotificationCenter {
  @Override
  Notification createNotification(String type) {
    NotificationComponentFactory componentFactory = new DesktopNotificationComponentFactory();
    if (type.equalsIgnoreCase("sms")) {
      return new SmsNotification(componentFactory);
    } else if (type.equalsIgnoreCase("email")) {
      return new EmailNotification(componentFactory);
    } else if (type.equalsIgnoreCase("push")) {
      return new PushNotification(componentFactory);
    } else return null;
  }
}
