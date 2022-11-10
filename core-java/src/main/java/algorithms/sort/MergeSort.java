package algorithms.sort;

import algorithms.ArrayUtils;

import java.util.Random;

public class MergeSort {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }
    System.out.print("Before: ");
    ArrayUtils.printArray(numbers);
    System.out.print("After: ");
    mergeSort(numbers);
    ArrayUtils.printArray(numbers);
  }

  private static void mergeSort(int[] inputArray) {
    int inputLenght = inputArray.length;

    if (inputLenght < 2) {
      return;
    }

    int midIndex = inputLenght / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int[inputLenght - midIndex];

    for (int i = 0; i < midIndex; i++) {
      leftHalf[i] = inputArray[i];
    }

    for (int i = midIndex; i < inputLenght; i++) {
      rightHalf[i - midIndex] = inputArray[i];
    }

    mergeSort(leftHalf);
    mergeSort(rightHalf);

    merge(inputArray, leftHalf, rightHalf);
  }

  private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;

    int i = 0, j = 0, k = 0;

    while (i < leftSize && j < rightSize) {
      if (leftHalf[i] <= rightHalf[j]) {
        inputArray[k] = leftHalf[i];
        i++;
      } else {
        inputArray[k] = rightHalf[j];
        j++;
      }
      k++;
    }

    while (i < leftSize) {
      inputArray[k] = leftHalf[i];
      i++;
      k++;
    }

    while (j < rightSize) {
      inputArray[k] = rightHalf[j];
      j++;
      k++;
    }
  }
}
