package algorithms.sort;

import algorithms.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    Arrays.setAll(numbers, i -> random.nextInt(100));

    System.out.print("Before: ");
    ArrayUtils.printArray(numbers);

    quicksort(numbers);

    System.out.print("After: ");
    ArrayUtils.printArray(numbers);
  }

  private static void quicksort(int[] array) {
    quicksort(array, 0, array.length - 1);
  }

  private static void quicksort(int[] array, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;

    int pivot = array[pivotIndex];
    ArrayUtils.swap(array, pivotIndex, highIndex);

    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);
  }

  private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer < rightPointer) {

      // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      // Walk from the right until we find a number less than the pivot, or hit the left pointer.
      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      ArrayUtils.swap(array, leftPointer, rightPointer);
    }

    if (array[leftPointer] > array[highIndex]) {
      ArrayUtils.swap(array, leftPointer, highIndex);
    } else {
      leftPointer = highIndex;
    }

    return leftPointer;
  }
}
