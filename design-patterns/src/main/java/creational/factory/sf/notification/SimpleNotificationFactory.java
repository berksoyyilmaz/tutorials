package creational.factory.sf.notification;

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
