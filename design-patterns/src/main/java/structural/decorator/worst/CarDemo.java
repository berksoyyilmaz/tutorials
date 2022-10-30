package structural.decorator.worst;


public class CarDemo {
  public static void main(String[] args) {
    BasicCar basicCar = new BasicCar("Basic Car");
    basicCar.assemble();

    System.out.println("\n*****");

    BasicCar luxuryCar = new LuxuryCar("Luxury Car");
    luxuryCar.assemble();

    System.out.println("\n*****");

    BasicCar sportsCar = new SportsCar("Sport Car.");
    sportsCar.assemble();

    System.out.println("\n*****");

    BasicCar luxurySportsCar = new LuxurySportsCar("Luxury Sports Car.");
    luxurySportsCar.assemble();
  }
}
