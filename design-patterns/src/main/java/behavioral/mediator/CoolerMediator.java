package behavioral.mediator;

public class CoolerMediator implements MachineMediator {
  private final Fan fan;
  private final PowerSupplier powerSupplier;

  public CoolerMediator(Fan fan, PowerSupplier powerSupplier) {
    this.fan = fan;
    this.powerSupplier = powerSupplier;
  }

  @Override
  public void press() {
    if (fan.isOn()) {
      fan.turnOff();
    } else {
      fan.turnOn();
    }
  }

  @Override
  public void turnOn() {
    powerSupplier.turnOn();
  }

  @Override
  public void turnOff() {
    powerSupplier.turnOff();
  }
}
