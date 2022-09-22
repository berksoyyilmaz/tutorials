package datastructure.arrays;

public class DeleteElement {
  public static void main(String[] args) {
    int[] array = getArray();
    deleteElement(3, array);
  }

  private static void deleteElement(int deleteIndex, int[] intArray) {
    if (deleteIndex > intArray.length - 1) {
      System.out.println("deleteIndex value cannot be greater than intArray lenght");
      return;
    }

    intArray[deleteIndex] = 0;
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
    intArray[6] = -22;
    return intArray;
  }
}
