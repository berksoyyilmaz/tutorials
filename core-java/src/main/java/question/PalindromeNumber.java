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

    char[] newChars = new char[chars.length];

    for (int i = 0, charsLength = chars.length; i < charsLength; i++) {
      char aChar = chars[i];
      newChars[newChars.length - 1 - i] = aChar;
    }


    String s = Arrays.toString(chars);
    String s1 = Arrays.toString(newChars);

    return s.equals(s1);
  }
}
