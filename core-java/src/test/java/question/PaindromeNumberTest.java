package question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PaindromeNumberTest {

  @ParameterizedTest
  @CsvSource({
      "121, true",
      "-121, false",
      "10, false",
      "1001, true"
  })
  void giveValidNumber_whenIsPalindrome_thenReturnTrue(int number, boolean expectedResult) {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    boolean isPalindrome = palindromeNumber.isPalindrome(number);

    Assertions.assertEquals(expectedResult, isPalindrome);
  }
}
