package creational.prototype.notification.withclonable;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;

public class SmsNotification extends Notification {
  private SubSmsNotification subSmsNotification;

  public SmsNotification(String name, DataFormat dataFormat, Environment environment, SubSmsNotification subSmsNotification) {
    super(name, dataFormat, environment);
    this.subSmsNotification = subSmsNotification;
  }

  @Override
  public Notification cloneNotification() throws CloneNotSupportedException {
    SmsNotification smsNotification;
    smsNotification = (SmsNotification) super.clone();
    smsNotification.setSubSmsNotification((SubSmsNotification) smsNotification.getSubSmsNotification().clone());
    return smsNotification;
  }

  public SubSmsNotification getSubSmsNotification() {
    return subSmsNotification;
  }

  public void setSubSmsNotification(SubSmsNotification subSmsNotification) {
    this.subSmsNotification = subSmsNotification;
  }
}
