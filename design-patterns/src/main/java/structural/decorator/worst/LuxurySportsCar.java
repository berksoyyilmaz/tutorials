package structural.decorator.worst;

public class LuxurySportsCar extends BasicCar {

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Sports Car.");
  }
}
