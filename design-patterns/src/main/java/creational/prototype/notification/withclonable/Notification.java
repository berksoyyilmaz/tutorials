package creational.prototype.notification.withclonable;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;

public abstract class Notification implements Cloneable {
  private String name;
  private DataFormat dataFormat;
  private Environment environment;

  public Notification(String name, DataFormat dataFormat, Environment environment) {
    this.name = name;
    this.dataFormat = dataFormat;
    this.environment = environment;
  }

  public abstract Notification cloneNotification() throws CloneNotSupportedException;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataFormat getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(DataFormat dataFormat) {
    this.dataFormat = dataFormat;
  }

  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  @Override
  public String toString() {
    return "Notification{" +
        "name='" + name + '\'' +
        ", dataFormat=" + dataFormat +
        ", environment=" + environment +
        '}';
  }

}