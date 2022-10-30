package structural.decorator.worst;

public class SportsCar extends BasicCar {

  public SportsCar(String name) {
    super(name);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Sports Car.");
  }
}