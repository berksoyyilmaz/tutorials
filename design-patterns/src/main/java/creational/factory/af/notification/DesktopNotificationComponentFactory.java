package creational.factory.af.notification;

import creational.factory.af.notification.types.DataFormat;
import creational.factory.af.notification.types.Environment;

public class DesktopNotificationComponentFactory implements NotificationComponentFactory {

  @Override
  public DataFormat prepareDataFormat() {
    return DataFormat.HTML;
  }

  @Override
  public Environment prepareEnvironment() {
    return Environment.DESKTOP;
  }

}
