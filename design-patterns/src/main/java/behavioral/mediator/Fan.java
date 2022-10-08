package behavioral.mediator;

public class Fan implements Colleague {
  private MachineMediator mediator;
  private boolean isOn = false;

  public boolean isOn() {
    return isOn;
  }

  @Override
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void turnOn() {
    System.out.println("Fan turn on...");
    mediator.turnOn();
    isOn = true;
  }

  public void turnOff() {
    System.out.println("Fan turn off...");
    isOn = false;
    mediator.turnOff();
  }
}