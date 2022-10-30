package structural.decorator.worst;

public class LuxuryCar extends BasicCar {

  protected LuxuryCar(String name) {
    super(name);
  }

  @Override
  void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Car.");
  }
}
