package datastructure.arrays;

public class Arrays {
  public static void main(String[] args) {
    int[] intArray = getArray();

    System.out.println("-printElementsOfArrayWithForLoop-----");
    printElementsOfArrayWithForLoop(intArray);
    System.out.println("-printElementsOfArrayWithEnhancedFor-----");
    printElementsOfArrayWithEnhancedFor(intArray);
  }

  private static void printElementsOfArrayWithForLoop(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }

  private static void printElementsOfArrayWithEnhancedFor(int[] intArray) {
    for (int j : intArray) {
      System.out.println(j);
    }
  }

  private static int[] getArray() {
    int[] intArray = new int[7];

    intArray[0] = 20;
    intArray[1] = 35;
    intArray[2] = -15;
    intArray[3] = 7;
    intArray[4] = 55;
    intArray[5] = 1;
    intArray[6] = -22;
    return intArray;
  }
}
