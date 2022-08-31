package creational.factory.af.notification.types.center;


import creational.factory.af.notification.types.Notification;

public abstract class NotificationCenter {
  abstract Notification createNotification(String type);

  public Notification notifyUser(String type) {
    Notification notification = createNotification(type);
    notification.prepare();
    return notification;
  }
}
