package structural.decorator.worst;

public class BasicCar extends Car {

  protected BasicCar(String name) {
    super(name);
  }

  @Override
  void assemble() {
    System.out.print("Basic Car.");
  }
}
