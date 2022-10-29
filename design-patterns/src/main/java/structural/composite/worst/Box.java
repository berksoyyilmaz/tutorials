package structural.composite.worst;

import java.util.ArrayList;
import java.util.List;

public class Box {
  private final List<Product> productList;
  private final List<SubProduct> subProductList;
  private final List<Box> boxList;

  public Box() {
    productList = new ArrayList<>();
    subProductList = new ArrayList<>();
    boxList = new ArrayList<>();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public void removeProduct(Product product) {
    productList.remove(product);
  }

  public void addSubProduct(SubProduct subProduct) {
    subProductList.add(subProduct);
  }

  public void removeSubProduct(SubProduct subProduct) {
    subProductList.remove(subProduct);
  }

  public void addBox(Box box) {
    boxList.add(box);
  }

  public void removeBox(Box box) {
    boxList.remove(box);
  }

  public double calculatePrice() {
    double total = productList.stream().mapToDouble(Product::getPrice).sum();
    total += subProductList.stream().mapToDouble(SubProduct::getPrice).sum();
    total += boxList.stream().mapToDouble(Box::calculatePrice).sum();
    return total;
  }
}
