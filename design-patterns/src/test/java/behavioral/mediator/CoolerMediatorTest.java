package behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoolerMediatorTest {
  private Button button;
  private Fan fan;

  @BeforeEach
  public void setUp() {
    button = new Button();
    fan = new Fan();
    PowerSupplier powerSupplier = new PowerSupplier();
    MachineMediator mediator = new CoolerMediator(fan, powerSupplier);
    button.setMediator(mediator);
    fan.setMediator(mediator);
  }

  @Test
  void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
    assertFalse(fan.isOn());

    button.press();
    assertTrue(fan.isOn());

    button.press();
    assertFalse(fan.isOn());
  }
}
