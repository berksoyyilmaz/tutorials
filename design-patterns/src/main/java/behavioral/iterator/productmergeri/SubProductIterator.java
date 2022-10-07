package behavioral.iterator.productmergeri;

import java.util.Iterator;

public class SubProductIterator implements Iterator<ProductItem> {
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
