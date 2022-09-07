package main.java.skeletal.defaultinterfaceimpl;

class EmailNotification implements Notification {
  @Override
  public void chooseChannel() {
    System.out.println("Email notification channel selected");
  }
}
