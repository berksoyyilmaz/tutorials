package behavioral.strategy;

import java.math.BigDecimal;

public class DiscounterDemo {
  public static void main(String[] args) {
    Discounter birthdayDiscounter = new BirthdayDiscounter();
    final BigDecimal discountedValue = birthdayDiscounter.apply(BigDecimal.valueOf(100));
    System.out.println(discountedValue);

    Discounter innerDiscountType = anonymousInnerDiscountType(0.5);
    System.out.println(innerDiscountType.apply(BigDecimal.valueOf(100)));

    Discounter discounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
    System.out.println(discounter.apply(BigDecimal.valueOf(100)));
  }

  private static Discounter anonymousInnerDiscountType(double discountRatio) {
    return new Discounter() {
      @Override
      public BigDecimal apply(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(discountRatio));
      }
    };
  }
}
