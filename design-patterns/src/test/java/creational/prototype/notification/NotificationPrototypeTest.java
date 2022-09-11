package creational.prototype.notification;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;
import creational.prototype.notification.withoutclonable.EmailNotification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationPrototypeTest {

  @Test
  void givenEmailNotificationPrototypeWhenClonedThenCreateAClone() {
    EmailNotification emailNotification = new EmailNotification("Email Notification", DataFormat.HTML, Environment.DESKTOP, "a@b.com", "c@d.com");
    EmailNotification copyEmailNotification = (EmailNotification) emailNotification.copy();
    copyEmailNotification.setName("Copy Email Notification");
    copyEmailNotification.setTo("e@f.com");

    assertEquals("Email Notification", emailNotification.getName());
    assertEquals("Copy Email Notification", copyEmailNotification.getName());
    assertEquals("c@d.com", emailNotification.getTo());
    assertEquals("e@f.com", copyEmailNotification.getTo());
  }
}
