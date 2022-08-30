package creational.factory.fm;

import creational.factory.fm.types.Notification;

public abstract class NotificationCenter {
  abstract Notification createNotification(String type);

  public Notification notifyUser(String type) {
    return createNotification(type);
  }
}
