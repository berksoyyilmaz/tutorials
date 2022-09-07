package skeletal.defaultinterfaceimpl;

class PushNotification implements Notification {
  @Override
  public void chooseChannel() {
    System.out.println("Push notification channel selected");
  }
}
