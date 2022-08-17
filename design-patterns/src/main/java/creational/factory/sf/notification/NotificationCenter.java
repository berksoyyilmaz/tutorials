package creational.factory.sf.notification;

import creational.factory.sf.notification.types.Notification;

public class NotificationCenter {
    SimpleNotificationFactory factory;

    public NotificationCenter(SimpleNotificationFactory factory) {
        this.factory = factory;
    }

    public Notification notifyUser(String type) {
        return factory.createNotification(type);
    }
}
