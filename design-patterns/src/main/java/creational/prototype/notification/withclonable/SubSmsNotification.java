package creational.prototype.notification.withclonable;

public class SubSmsNotification implements Cloneable {
  private String name;

  public SubSmsNotification(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
