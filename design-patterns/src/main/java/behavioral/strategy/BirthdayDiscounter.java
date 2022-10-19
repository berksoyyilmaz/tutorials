package behavioral.strategy;

import java.math.BigDecimal;

public class BirthdayDiscounter implements Discounter {
  @Override
  public BigDecimal apply(BigDecimal amount) {
    return amount.multiply(BigDecimal.valueOf(0.5));
  }
}
