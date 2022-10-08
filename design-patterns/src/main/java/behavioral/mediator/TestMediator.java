package behavioral.mediator;

public class TestMediator {
  public static void main(String[] args) {
    MachineMediator mediator;
    Button button = new Button();
    Fan fan = new Fan();
    PowerSupplier powerSupplier = new PowerSupplier();

    mediator = new CoolerMediator(fan, powerSupplier);
    button.setMediator(mediator);
    fan.setMediator(mediator);
    System.out.println("---Button press---");
    button.press();
    System.out.println("---Button press again---");
    button.press();
  }
}
