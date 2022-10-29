package structural.composite.typesafety;

public class Cargo {
  public static void main(String[] args) {
    Product lamb = new Product("Lamb", 10);

    Product bulb = new Product("Bulb", 2);
    lamb.addProduct(bulb);

    Product screw = new Product("Screw", 1);
    lamb.addProduct(screw);

    Product cable = new Product("Cable", 0.5);
    screw.addProduct(cable);

    System.out.println(lamb.calculatePrice());

  }
}
