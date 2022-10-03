package behavioral.iterator.productmerger;

public class ArrayIterator implements Iterator {
  ProductItem[] items;
  int position = 0;

  public ArrayIterator(ProductItem[] items) {
    this.items = items;
  }

  @Override
  public ProductItem next() {
    ProductItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }
}
