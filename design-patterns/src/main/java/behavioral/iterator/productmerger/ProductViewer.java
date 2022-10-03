package behavioral.iterator.productmerger;

import java.util.List;

public class ProductViewer {
  public static void main(String[] args) {
    BundleProduct bundleProduct = new BundleProduct();
    List<ProductItem> productItems = bundleProduct.getProductItems();

    for (int i = 0; i < productItems.size(); i++) {
      ProductItem productItem = productItems.get(i);
      System.out.println(productItem.getName() + " " + productItem.getPrice());
    }

    SubProduct subProduct = new SubProduct();
    ProductItem[] subItems = subProduct.getProductItems();
    for (int i = 0; i < subItems.length; i++) {
      ProductItem subItem = subItems[i];
      System.out.println(subItem.getName() + " " + subItem.getPrice());
    }
  }
}
