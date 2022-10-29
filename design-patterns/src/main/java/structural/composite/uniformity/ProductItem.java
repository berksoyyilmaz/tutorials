package structural.composite.uniformity;

public class ProductItem implements Product {
  private String name;
  private double price;

  public ProductItem(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public double calculatePrice() {
    return getPrice();
  }
}
