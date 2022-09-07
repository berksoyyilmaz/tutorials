package skeletal.skeletalimpl;

class NotificationManager {
  public static void main(String[] args) {
    Notification emailNotification = new EmailNotification();
    emailNotification.process();

    System.out.println("------");

    Notification pushNotification = new PushNotification();
    pushNotification.process();
  }
}
