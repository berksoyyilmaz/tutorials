package creational.factory.af.notification;

import creational.factory.af.notification.types.DataFormat;
import creational.factory.af.notification.types.Environment;

public interface NotificationComponentFactory {
  DataFormat prepareDataFormat();

  Environment prepareEnvironment();
}
