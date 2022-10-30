package structural.decorator.worst;


public class CarDemo {
  public static void main(String[] args) {
    BasicCar basicCar = new BasicCar();
    basicCar.assemble();

    System.out.println("\n*****");

    BasicCar luxuryCar = new LuxuryCar();
    luxuryCar.assemble();

    System.out.println("\n*****");

    BasicCar sportsCar = new SportsCar();
    sportsCar.assemble();

    System.out.println("\n*****");

    BasicCar luxurySportsCar = new LuxurySportsCar();
    luxurySportsCar.assemble();
  }
}
