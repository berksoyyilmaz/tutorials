package question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToIntegerTest {

  @ParameterizedTest
  @CsvSource({
      "III, 3",
      "LVIII, 58",
      "MCMXCIV, 1994"
  })
  void givenNumber_whenRomanNumber_thenReturnInteger(String romanNumber, int expectedResult) {
    RomanToInteger romanToInteger = new RomanToInteger();
    int convertedNumber = romanToInteger.romanToInt(romanNumber);

    Assertions.assertEquals(expectedResult, convertedNumber);
  }

}
