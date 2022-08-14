package creational.factory.sf.notification;

public class NotificationCenter {
    SimpleNotificationFactory factory;

    public NotificationCenter(SimpleNotificationFactory factory) {
        this.factory = factory;
    }

    public Notification notifyUser(String type) {
        return factory.createNotification(type);
    }
}
