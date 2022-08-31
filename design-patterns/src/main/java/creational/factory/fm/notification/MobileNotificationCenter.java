package creational.factory.fm.notification;

import creational.factory.fm.notification.types.MobileEmailNotification;
import creational.factory.fm.notification.types.MobilePushNotification;
import creational.factory.fm.notification.types.MobileSMSNotification;
import creational.factory.fm.notification.types.Notification;

public class MobileNotificationCenter extends NotificationCenter {
  @Override
  Notification createNotification(String type) {
    if (type.equalsIgnoreCase("sms")) {
      return new MobileSMSNotification();
    } else if (type.equalsIgnoreCase("email")) {
      return new MobileEmailNotification();
    } else if (type.equalsIgnoreCase("push")) {
      return new MobilePushNotification();
    } else return null;
  }
}
