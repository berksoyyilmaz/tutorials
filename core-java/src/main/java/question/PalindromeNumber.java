package question;

import java.util.Arrays;

public class PalindromeNumber {
  /*
   Given an integer x, return true if x is a palindrome, and false otherwise.
   
   Input: x = 121
   Output: true
   Explanation: 121 reads as 121 from left to right and from right to left.

   Input: x = -121
   Output: false
   Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

   Input: x = 10
   Output: false
   Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

   constraints:
   -2^31 <= x <= 2^31 - 1
   */

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    char[] chars = String.valueOf(x).toCharArray();
    int halfCharLenght = chars.length / 2;
    char[] firstChars = new char[halfCharLenght];
    char[] secondChars = new char[halfCharLenght];

    for (int i = 0; i < halfCharLenght; i++) {
      firstChars[i] = chars[i];
      secondChars[i] = chars[chars.length - i - 1];
    }

    String firstStr = Arrays.toString(firstChars);
    String secondStr = Arrays.toString(secondChars);

    return firstStr.equals(secondStr);
  }
}
