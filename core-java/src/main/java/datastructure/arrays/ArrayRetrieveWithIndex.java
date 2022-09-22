package datastructure.arrays;

public class ArrayRetrieveWithIndex {
  public static void main(String[] args) {
    int[] array = getArray();
    retrieveWithIndex(4, array);
  }

  private static void retrieveWithIndex(int index, int[] array) {
    if (index > array.length - 1) {
      System.out.println("index value cannot be greater than array length");
      return;
    }

    System.out.println(array[index]);
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
