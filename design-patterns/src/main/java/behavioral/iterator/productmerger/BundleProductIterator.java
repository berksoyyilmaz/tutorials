package behavioral.iterator.productmerger;

import java.util.List;
 
public class BundleProductIterator implements Iterator {
  List<ProductItem> items;
  int position = 0;

  public BundleProductIterator(List<ProductItem> items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return items.size() > position;
  }

  @Override
  public ProductItem next() {
    return items.get(position++);
  }
}
