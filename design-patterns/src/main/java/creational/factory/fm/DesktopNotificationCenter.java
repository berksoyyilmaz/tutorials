package creational.factory.fm;

import creational.factory.fm.types.DesktopEmailNotification;
import creational.factory.fm.types.DesktopPushNotification;
import creational.factory.fm.types.DesktopSMSNotification;
import creational.factory.fm.types.Notification;

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
