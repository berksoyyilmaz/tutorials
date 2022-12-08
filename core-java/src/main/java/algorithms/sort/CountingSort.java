package algorithms.sort;

import algorithms.ArrayUtils;

import java.util.Arrays;

public class CountingSort {

  void countSort(int[] arr) {
    // detect maxValue and minValue number in array
    int maxValue = Arrays.stream(arr).max().getAsInt();
    int minValue = Arrays.stream(arr).min().getAsInt();

    int arrayRange = maxValue - minValue + 1;

    int[] countArray = new int[arrayRange];
    int[] output = new int[arr.length];

    // store count of each character
    for (int arrItem : arr) {
      int newValGreaterThanZero = arrItem - minValue;
      countArray[newValGreaterThanZero]++;
    }

    for (int countArrayIndex = 1; countArrayIndex < countArray.length; countArrayIndex++) {
      countArray[countArrayIndex] += countArray[countArrayIndex - 1];
    }

    for (int j : arr) {
      int newPosition = countArray[j - minValue] - 1;
      output[newPosition] = j;
    }

    System.arraycopy(output, 0, arr, 0, arr.length);
  }


  public static void main(String[] args) {
    CountingSort ob = new CountingSort();
    int[] numbers = new int[]{5, 3, 7, -2, -1};

    System.out.print("Before: ");
    ArrayUtils.printArray(numbers);
    ob.countSort(numbers);
    System.out.print("After: ");
    ArrayUtils.printArray(numbers);
  }
}

