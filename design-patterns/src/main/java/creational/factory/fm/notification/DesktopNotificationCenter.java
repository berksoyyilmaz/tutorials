package creational.factory.fm.notification;

import creational.factory.fm.notification.types.DesktopEmailNotification;
import creational.factory.fm.notification.types.DesktopPushNotification;
import creational.factory.fm.notification.types.DesktopSMSNotification;
import creational.factory.fm.notification.types.Notification;

public class DesktopNotificationCenter extends NotificationCenter {
  @Override
  Notification createNotification(String type) {
    if (type.equalsIgnoreCase("sms")) {
      return new DesktopSMSNotification();
    } else if (type.equalsIgnoreCase("email")) {
      return new DesktopEmailNotification();
    } else if (type.equalsIgnoreCase("push")) {
      return new DesktopPushNotification();
    } else return null;
  }
}
