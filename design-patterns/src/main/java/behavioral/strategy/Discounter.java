package behavioral.strategy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Discounter extends UnaryOperator<BigDecimal> {

  static Discounter birthday() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.5));
  }

  static Discounter newYear() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.3));
  }

  static Discounter firstPurchased() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.7));
  }

  @Override
  BigDecimal apply(BigDecimal amount);

  default Discounter combine(Discounter after) {
    return value -> after.apply(apply(value));
  }
}