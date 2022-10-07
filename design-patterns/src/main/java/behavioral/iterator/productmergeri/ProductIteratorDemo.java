package behavioral.iterator.productmergeri;

import java.util.Iterator;

public class ProductIteratorDemo {
  public static void main(String[] args) {
    BundleProduct bundleProduct = new BundleProduct();
    Iterator<ProductItem> productIterator = bundleProduct.createIterator();

    SubProduct subProduct = new SubProduct();
    Iterator<ProductItem> subProductIterator = subProduct.createIterator();

    printProduct(productIterator);
    printProduct(subProductIterator);
  }

  private static void printProduct(Iterator<ProductItem> iterator) {
    while (iterator.hasNext()) {
      ProductItem productItem = iterator.next();
      System.out.print(productItem.getName() + " ");
      System.out.println(productItem.getPrice());
    }
  }
}