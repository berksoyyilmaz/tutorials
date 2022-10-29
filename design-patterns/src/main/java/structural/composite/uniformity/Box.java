package structural.composite.uniformity;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
  private final List<Product> productList;

  public Box() {
    productList = new ArrayList<>();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public void removeProduct(Product product) {
    productList.remove(product);
  }

  @Override
  public double calculatePrice() {
    return productList.stream().mapToDouble(Product::calculatePrice).sum();
  }
}
