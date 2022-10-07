package behavioral.iterator.productmergeri;

import java.util.Arrays;
import java.util.List;

public class ProductViewer {
  public static void main(String[] args) {
    BundleProduct bundleProduct = new BundleProduct();
    List<ProductItem> productItems = bundleProduct.getProductItems();

    SubProduct subProduct = new SubProduct();
    ProductItem[] subItems = subProduct.getProductItems();
    
    usingForLoops(productItems, subItems);

    usingForEach(productItems, subItems);

    usingEnhancedFor(productItems, subItems);
  }

  private static void usingForLoops(List<ProductItem> productItems, ProductItem[] subItems) {
    System.out.println("=== forLoops ===");
    for (int i = 0; i < productItems.size(); i++) {
      ProductItem productItem = productItems.get(i);
      System.out.println(productItem.getName() + " " + productItem.getPrice());
    }

    for (int i = 0; i < subItems.length; i++) {
      ProductItem subItem = subItems[i];
      System.out.println(subItem.getName() + " " + subItem.getPrice());
    }
  }

  private static void usingForEach(List<ProductItem> productItems, ProductItem[] subItems) {
    System.out.println("=== forEach ===");
    productItems.stream().map(productItem -> productItem.getName() + " " + productItem.getPrice()).forEach(System.out::println);
    Arrays.stream(subItems).map(subItem -> subItem.getName() + " " + subItem.getPrice()).forEach(System.out::println);
  }

  private static void usingEnhancedFor(List<ProductItem> productItems, ProductItem[] subItems) {
    System.out.println("=== enhancedFor ===");
    for (ProductItem productItem : productItems) {
      String s = productItem.getName() + " " + productItem.getPrice();
      System.out.println(s);
    }

    for (ProductItem subItem : subItems) {
      String s = subItem.getName() + " " + subItem.getPrice();
      System.out.println(s);
    }
  }
}
