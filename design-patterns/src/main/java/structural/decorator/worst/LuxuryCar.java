package structural.decorator.worst;

public class LuxuryCar extends BasicCar {

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Car.");
  }
}
