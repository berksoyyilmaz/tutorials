package algorithms.sort;

import java.util.Arrays;

public class Radix {

  public static void sort(int[] numbers) {
    int maximumNumber = findMaximumNumberIn(numbers);

    int numberOfDigits = calculateNumberOfDigitsIn(maximumNumber);

    int placeValue = 1;

    while (numberOfDigits-- > 0) {
      applyCountingSortOn(numbers, placeValue);
      placeValue *= 10;
    }
  }
  
  private static int findMaximumNumberIn(int[] arr) {
    return Arrays.stream(arr).max().getAsInt();
  }

  private static void applyCountingSortOn(int[] numbers, int placeValue) {
    int range = 10; // radix or the base

    int length = numbers.length;
    int[] frequency = new int[range];
    int[] sortedValues = new int[length];

    for (int i = 0; i < length; i++) {
      int digit = (numbers[i] / placeValue) % range;
      frequency[digit]++;
    }

    for (int i = 1; i < range; i++) {
      frequency[i] += frequency[i - 1];
    }

    for (int i = length - 1; i >= 0; i--) {
      int digit = (numbers[i] / placeValue) % range;
      sortedValues[frequency[digit] - 1] = numbers[i];
      frequency[digit]--;
    }

    System.arraycopy(sortedValues, 0, numbers, 0, length);
  }

  private static int calculateNumberOfDigitsIn(int number) {
    return (int) Math.log10(number) + 1; // valid only if number > 0
  }


  public static void main(String[] args) {
    int[] intArray = {20, 35, 15, 7, 55, 1, 22};
    sort(intArray);
    Arrays.stream(intArray).forEachOrdered(System.out::println);
  }
}
