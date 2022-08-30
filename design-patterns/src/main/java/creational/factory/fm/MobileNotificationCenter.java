package creational.factory.fm;

import creational.factory.fm.types.MobileEmailNotification;
import creational.factory.fm.types.MobilePushNotification;
import creational.factory.fm.types.MobileSMSNotification;
import creational.factory.fm.types.Notification;

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
