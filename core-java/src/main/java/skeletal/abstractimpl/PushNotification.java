package skeletal.abstractimpl;

class PushNotification extends AbstractNotification {
  @Override
  void chooseChannel() {
    System.out.println("Push notification channel selected");
  }
}
