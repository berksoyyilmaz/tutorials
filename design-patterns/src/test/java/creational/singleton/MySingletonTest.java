package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class MySingletonTest {
  @Test
  void whenGettingMultipleObjectsThenAllPointToSame() {
    // when
    MySingleton instance1 = MySingleton.getInstance();
    MySingleton instance2 = MySingleton.getInstance();

    // then
    assertSame(instance1, instance2);
    assertEquals(instance1.hashCode(), instance2.hashCode());
  }
}
