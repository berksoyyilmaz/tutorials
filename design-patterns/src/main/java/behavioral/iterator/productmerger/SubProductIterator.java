package behavioral.iterator.productmerger;

public class SubProductIterator implements Iterator {
  ProductItem[] items;
  int position;
 
  public SubProductIterator(ProductItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return items.length > position;
  }

  @Override
  public ProductItem next() {
    return items[position++];
  }
}
