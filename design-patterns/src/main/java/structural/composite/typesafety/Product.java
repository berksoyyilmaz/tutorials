package structural.composite.typesafety;

import java.util.ArrayList;
import java.util.List;

public class Product {
  private final List<Product> subProducts;
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    subProducts = new ArrayList<>();
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

  public List<Product> getSubProducts() {
    return subProducts;
  }

  public void addProduct(Product product) {
    subProducts.add(product);
  }

  public void removeProduct(Product product) {
    subProducts.remove(product);
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", subProducts=" + subProducts +
        '}';
  }

  public double calculatePrice() {
    double total = getPrice();
    total += subProducts.stream().mapToDouble(Product::calculatePrice).sum();
    return total;
  }
}
