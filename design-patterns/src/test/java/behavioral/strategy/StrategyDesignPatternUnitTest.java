package behavioral.strategy;


import org.hamcrest.Matchers;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static behavioral.strategy.Discounter.*;
import static org.junit.Assert.assertThat;

public class StrategyDesignPatternUnitTest {
  @Test
  public void shouldDivideByTwo_WhenApplyingBirthdayDiscounter() {
    Discounter birthdayDiscounter = new BirthdayDiscounter();

    final BigDecimal discountedValue = birthdayDiscounter.apply(BigDecimal.valueOf(100));

    assertThat(BigDecimal.valueOf(50), Matchers.comparesEqualTo(discountedValue));
  }

  @Test
  public void shouldDivideByTwo_WhenApplyingBirthdayDiscounterWithAnonyousTypes() {
    Discounter discounter = new Discounter() {
      @Override
      public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
      }
    };

    final BigDecimal discountedValue = discounter.apply(BigDecimal.valueOf(100));

    assertThat(BigDecimal.valueOf(50), Matchers.comparesEqualTo(discountedValue));
  }

  @Test
  public void shouldDivideByTwo_WhenApplyingBirthdayDiscounterWithLamda() {
    Discounter discounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));

    final BigDecimal discountedValue = discounter.apply(BigDecimal.valueOf(100));

    assertThat(BigDecimal.valueOf(50), Matchers.comparesEqualTo(discountedValue));
  }

  @Test
  public void shouldDivideByTwo_WhenApplyingBirthdayDiscounterWithStaticInterfaceMethod() {
    final BigDecimal discountedValue = birthday().apply(BigDecimal.valueOf(100));

    assertThat(BigDecimal.valueOf(50), Matchers.comparesEqualTo(discountedValue));
  }

  @Test
  public void shouldApplyAllDiscounts() {
    List<Discounter> discounters = Arrays.asList(birthday(), newYear(), firstPurchased());

    BigDecimal amount = BigDecimal.valueOf(100);

    final Discounter combinedDiscounter = discounters
        .stream()
        .reduce(v -> v, Discounter::combine);

    BigDecimal resultAmount = combinedDiscounter.apply(amount);
    assertThat(BigDecimal.valueOf(10.5), Matchers.comparesEqualTo(resultAmount));
  }

  @Test
  public void shouldChainDiscounters() {
    final Function<BigDecimal, BigDecimal> combinedDiscounters = Discounter
        .birthday()
        .andThen(newYear());

    BigDecimal resultAmount = combinedDiscounters.apply(BigDecimal.valueOf(100));
    assertThat(BigDecimal.valueOf(15), Matchers.comparesEqualTo(resultAmount));
  }

}