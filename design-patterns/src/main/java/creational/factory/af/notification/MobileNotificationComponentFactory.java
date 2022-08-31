package creational.factory.af.notification;

import creational.factory.af.notification.types.DataFormat;
import creational.factory.af.notification.types.Environment;

public class MobileNotificationComponentFactory implements NotificationComponentFactory {

  @Override
  public DataFormat prepareDataFormat() {
    return DataFormat.JSON;
  }

  @Override
  public Environment prepareEnvironment() {
    return Environment.MOBILE;
  }

}
