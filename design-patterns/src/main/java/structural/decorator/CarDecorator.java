package structural.decorator;

public abstract class CarDecorator implements Car {

  private final Car car;

  protected CarDecorator(Car c) {
    car = c;
  }

  @Override
  public void assemble() {
    car.assemble();
  }
}