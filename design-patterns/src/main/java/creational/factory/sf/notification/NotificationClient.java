package creational.factory.sf.notification;

public class NotificationClient {
    public static void main(String[] args) {
        SimpleNotificationFactory factory = new SimpleNotificationFactory();
        NotificationCenter notificationCenter = new NotificationCenter(factory);

        Notification notification = notificationCenter.notifyUser("email");
        System.out.println(notification);

    }
}
