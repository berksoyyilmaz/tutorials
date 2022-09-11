package creational.prototype.notification.withoutclonable;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;

import java.util.Objects;

public class EmailNotification extends Notification {
  private String from;
  private String to;

  public EmailNotification(String name, DataFormat dataFormat, Environment environment, String from, String to) {
    super(name, dataFormat, environment);
    this.from = from;
    this.to = to;
  }

  @Override
  public Notification copy() {
    return new EmailNotification(getName(), getDataFormat(), getEnvironment(), getFrom(), getTo());
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return "EmailNotification{" +
        "from='" + from + '\'' +
        ", to='" + to + '\'' +
        "} " + super.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EmailNotification)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    EmailNotification that = (EmailNotification) o;
    return Objects.equals(from, that.from) && Objects.equals(to, that.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), from, to);
  }
}