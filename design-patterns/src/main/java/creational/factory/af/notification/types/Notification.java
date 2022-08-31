package creational.factory.af.notification.types;

public abstract class Notification {
  String name;
  DataFormat dataFormat;
  Environment environment;

  public abstract void prepare();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
