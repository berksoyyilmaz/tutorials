package datastructure.arrays;

public class AddElementToEndOfAnArray {
  public static void main(String[] args) {
    int[] array = getArray();
    addElementToEndOfAnArray(45, array);
  }

  private static void addElementToEndOfAnArray(int newValue, int[] intArray) {
    intArray[intArray.length - 1] = newValue;

    for (int i : intArray) {
      System.out.println(i);
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
    return intArray;
  }
}
