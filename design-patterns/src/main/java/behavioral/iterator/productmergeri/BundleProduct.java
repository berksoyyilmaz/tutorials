package behavioral.iterator.productmergeri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BundleProduct implements Product {
  List<ProductItem> productItems;

  public BundleProduct() {
    productItems = new ArrayList<>();

    addProduct("Bundle A", 5);
    addProduct("Bundle B", 15);
  }

  public void addProduct(String name, double price) {
    ProductItem productItem = new ProductItem(name, price);
    productItems.add(productItem);
  }

  public List<ProductItem> getProductItems() {
    return productItems;
  }

  @Override
  public Iterator<ProductItem> createIterator() {
    return new BundleProductIterator(productItems);
  }
}
