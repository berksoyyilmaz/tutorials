package creational.prototype.notification.withoutclonable;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;

import java.util.Objects;

public abstract class Notification {
  private String name;
  private DataFormat dataFormat;
  private Environment environment;

  public Notification(String name, DataFormat dataFormat, Environment environment) {
    this.name = name;
    this.dataFormat = dataFormat;
    this.environment = environment;
  }

  public abstract Notification copy();

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification that = (Notification) o;
    return Objects.equals(name, that.name) && dataFormat == that.dataFormat && environment == that.environment;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataFormat, environment);
  }
}
