package creational.prototype.notification.withclonable;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;

public class PushNotification extends Notification {
  private SubPushNotification subPushNotification;

  public PushNotification(String name, DataFormat dataFormat, Environment environment, SubPushNotification subPushNotification) {
    super(name, dataFormat, environment);
    this.subPushNotification = subPushNotification;
  }

  @Override
  public Notification cloneNotification() throws CloneNotSupportedException {
    return (PushNotification) super.clone();
  }

  public SubPushNotification getSubPushNotification() {
    return subPushNotification;
  }

  public void setSubPushNotification(SubPushNotification subPushNotification) {
    this.subPushNotification = subPushNotification;
  }
}

