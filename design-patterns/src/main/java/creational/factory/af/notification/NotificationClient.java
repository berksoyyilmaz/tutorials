package creational.factory.af.notification;

import creational.factory.af.notification.types.Notification;
import creational.factory.af.notification.types.center.DesktopNotificationCenter;
import creational.factory.af.notification.types.center.MobileNotificationCenter;
import creational.factory.af.notification.types.center.NotificationCenter;

public class NotificationClient {
  public static void main(String[] args) {
    notifyMobile();
    notifyDesktop();
  }

  private static void notifyMobile() {
    NotificationCenter mobileCenter = new MobileNotificationCenter();

    Notification mobileSmsNotification = mobileCenter.notifyUser("SMS");
    System.out.println(mobileSmsNotification);

    Notification mobileEmailNotification = mobileCenter.notifyUser("email");
    System.out.println(mobileEmailNotification);
  }

  private static void notifyDesktop() {
    NotificationCenter desktopCenter = new DesktopNotificationCenter();

    Notification desktopSmsNotification = desktopCenter.notifyUser("SMS");
    System.out.println(desktopSmsNotification);

    Notification desktopEmailNotification = desktopCenter.notifyUser("push");
    System.out.println(desktopEmailNotification);
  }
}
