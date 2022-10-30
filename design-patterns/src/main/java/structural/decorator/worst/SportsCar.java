package structural.decorator.worst;

public class SportsCar extends BasicCar {

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Sports Car.");
  }
}