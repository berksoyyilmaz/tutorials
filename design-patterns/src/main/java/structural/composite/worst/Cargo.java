package structural.composite.worst;

public class Cargo {
  public static void main(String[] args) {
    Box bigBox = new Box();

    Product lamb = new Product("Lamb", 10);
    bigBox.addProduct(lamb);

    Product bulb = new Product("Bulb", 2);
    bigBox.addProduct(bulb);

    Box mediumBox = new Box();

    Product screw = new Product("Screw", 1);
    mediumBox.addProduct(screw);

    SubProduct cable = new SubProduct("Cable", 0.1);
    mediumBox.addSubProduct(cable);

    bigBox.addBox(mediumBox);

    System.out.println(bigBox.calculatePrice());
  }
}
