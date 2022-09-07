package main.java.skeletal.abstractimpl;

class NotificationManager {
  public static void main(String[] args) {
    AbstractNotification emailNotification = new EmailNotification();
    emailNotification.process();

    System.out.println("------");

    AbstractNotification pushNotification = new PushNotification();
    pushNotification.process();
  }
}
