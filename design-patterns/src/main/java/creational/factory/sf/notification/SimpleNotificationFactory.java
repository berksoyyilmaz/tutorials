package creational.factory.sf.notification;

import creational.factory.sf.notification.types.EmailNotification;
import creational.factory.sf.notification.types.Notification;
import creational.factory.sf.notification.types.PushNotification;
import creational.factory.sf.notification.types.SMSNotification;

public class SimpleNotificationFactory {

    public Notification createNotification(String type) {
        Notification notification = null;

        if (type.equalsIgnoreCase("sms")) {
            notification = new SMSNotification();
        } else if (type.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if (type.equalsIgnoreCase("push")) {
            notification = new PushNotification();
        }

        return notification;
    }
}
