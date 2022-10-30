package structural.decorator.worst;

public class LuxurySportsCar extends BasicCar {

  protected LuxurySportsCar(String name) {
    super(name);
  }

  @Override
  void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Sports Car.");
  }
}
