package behavioral.iterator.productmergeri;

import java.util.Iterator;

public interface Product {
  Iterator<ProductItem> createIterator();
}
