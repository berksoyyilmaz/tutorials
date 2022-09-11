package creational.prototype.notification;

import creational.prototype.notification.commontype.DataFormat;
import creational.prototype.notification.commontype.Environment;
import creational.prototype.notification.withclonable.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NotificationCloneTest {

  @Test
  void givenEmailNotificationPrototypeWhenClonedThenCreateAClone() throws CloneNotSupportedException {
    EmailNotification emailNotification = new EmailNotification("Email Notification", DataFormat.HTML, Environment.DESKTOP, "a@b.com", "c@d.com");
    EmailNotification copyEmailNotification = (EmailNotification) emailNotification.cloneNotification();
    copyEmailNotification.setName("Copy Email Notification");
    copyEmailNotification.setTo("e@f.com");

    assertEquals("Email Notification", emailNotification.getName());
    assertEquals("Copy Email Notification", copyEmailNotification.getName());
    assertEquals("c@d.com", emailNotification.getTo());
    assertEquals("e@f.com", copyEmailNotification.getTo());
  }

  @Test
  void givenPushNotificationPrototypeWhenClonedThenCreateAClone() throws CloneNotSupportedException {
    PushNotification pushNotification = new PushNotification("Push", DataFormat.XML, Environment.MOBILE, new SubPushNotification("Sub Push"));

    PushNotification copyPushNotification = (PushNotification) pushNotification.cloneNotification();
    copyPushNotification.setName("Copy Push");
    copyPushNotification.getSubPushNotification().setName("Copy Sub Push");

    assertEquals("Push", pushNotification.getName());
    assertEquals("Copy Push", copyPushNotification.getName());
    assertNotEquals("Sub Push", pushNotification.getSubPushNotification().getName());
    assertEquals("Copy Sub Push", pushNotification.getSubPushNotification().getName());
    assertEquals("Copy Sub Push", copyPushNotification.getSubPushNotification().getName());
  }

  @Test
  void givenSmsNotificationPrototypeWhenClonedThenCreateAClone() throws CloneNotSupportedException {
    SmsNotification smsNotification = new SmsNotification("Sms", DataFormat.JSON, Environment.MOBILE, new SubSmsNotification("Sub Sms"));

    SmsNotification copySmsNotification = (SmsNotification) smsNotification.cloneNotification();
    copySmsNotification.setName("Copy Sms");
    copySmsNotification.getSubSmsNotification().setName("Copy Sub Sms");

    assertEquals("Sms", smsNotification.getName());
    assertEquals("Sub Sms", smsNotification.getSubSmsNotification().getName());
    assertEquals("Copy Sms", copySmsNotification.getName());
    assertEquals("Copy Sub Sms", copySmsNotification.getSubSmsNotification().getName());
  }
}
