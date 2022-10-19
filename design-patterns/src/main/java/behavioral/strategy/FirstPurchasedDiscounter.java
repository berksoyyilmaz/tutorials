package behavioral.strategy;

import java.math.BigDecimal;

public class FirstPurchasedDiscounter implements Discounter {
  @Override
  public BigDecimal apply(BigDecimal amount) {
    return amount.multiply(BigDecimal.valueOf(0.7));
  }
}
