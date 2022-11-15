package algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayUtils {

  private ArrayUtils() {
  }

  public static void printArray(int[] numbers) {
    String collect = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(","));
    System.out.println(collect);
  }

  public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
