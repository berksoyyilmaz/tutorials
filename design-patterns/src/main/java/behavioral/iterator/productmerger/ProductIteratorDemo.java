package behavioral.iterator.productmerger;

public class ProductIteratorDemo {
  public static void main(String[] args) {
    BundleProduct bundleProduct = new BundleProduct();
    Iterator productIterator = bundleProduct.createIterator();

    SubProduct subProduct = new SubProduct();
    Iterator subProductIterator = subProduct.createIterator();

    printProduct(productIterator);
    printProduct(subProductIterator);

  }

  private static void printProduct(Iterator iterator) {
    while (iterator.hasNext()) {
      ProductItem productItem = iterator.next();
      System.out.print(productItem.getName() + " ");
      System.out.println(productItem.getPrice());
    }
  }
}
