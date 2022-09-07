package skeletal.abstractimpl;

class EmailNotification extends AbstractNotification {
  @Override
  void chooseChannel() {
    System.out.println("Email notification channel selected");
  }
}
