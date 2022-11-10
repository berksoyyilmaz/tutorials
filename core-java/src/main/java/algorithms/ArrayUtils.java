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
}
