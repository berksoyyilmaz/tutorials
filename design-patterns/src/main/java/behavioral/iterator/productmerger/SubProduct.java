package behavioral.iterator.productmerger;

public class SubProduct implements Product {
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  ProductItem[] productItems;

  public SubProduct() {
    productItems = new ProductItem[MAX_ITEMS];

    addProduct("Sub Product A", 1);
    addProduct("Sub Product B", 2);
    addProduct("Sub Product C", 3);
  }

  public void addProduct(String name, double price) {
    ProductItem productItem = new ProductItem(name, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, sub products is full!");
    } else {
      productItems[numberOfItems] = productItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  public ProductItem[] getProductItems() {
    return productItems;
  }

  @Override
  public Iterator createIterator() {
    return new SubProductIterator(productItems);
  }
}

