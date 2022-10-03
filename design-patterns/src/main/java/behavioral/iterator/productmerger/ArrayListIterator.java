package behavioral.iterator.productmerger;

import java.util.List;

public class ArrayListIterator implements Iterator {
  List<ProductItem> items;
  int position = 0;

  public ArrayListIterator(List<ProductItem> items) {
    this.items = items;
  }

  @Override
  public ProductItem next() {
    ProductItem item = items.get(position);
    position = position + 1;
    return item;
  }

  @Override
  public boolean hasNext() {
    return position < items.size();
  }
}
