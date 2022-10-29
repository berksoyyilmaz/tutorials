package structural.composite.uniformity;

public class Cargo {
  public static void main(String[] args) {
    Box bigBox = new Box();

    ProductItem lamb = new ProductItem("Lamb", 10);
    bigBox.addProduct(lamb);

    ProductItem bulb = new ProductItem("Bulb", 2);
    bigBox.addProduct(bulb);

    Box mediumBox = new Box();

    ProductItem screw = new ProductItem("Screw", 1);
    mediumBox.addProduct(screw);

    Box smallBox = new Box();
    SubProductItem cable = new SubProductItem("Cable", 0.5);
    smallBox.addProduct(cable);

    mediumBox.addProduct(smallBox);
    bigBox.addProduct(mediumBox);
    System.out.println(bigBox.calculatePrice());

  }
}
