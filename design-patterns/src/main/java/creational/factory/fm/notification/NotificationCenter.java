package creational.factory.fm.notification;

import creational.factory.fm.notification.types.Notification;

public abstract class NotificationCenter {
  abstract Notification createNotification(String type);

  public Notification notifyUser(String type) {
    return createNotification(type);
  }
}
