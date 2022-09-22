package datastructure.arrays;

public class DeleteElementByShifting {

  public static void main(String[] args) {
    int[] array = getArray();
    deleteElementByShifting(3, array);
  }

  private static void deleteElementByShifting(int deleteIndex, int[] intArray) {
    if (deleteIndex > intArray.length - 1) {
      System.out.println("deleteIndex value cannot be greater than intArray lenght");
      return;
    }

    intArray[deleteIndex] = 0;

    int[] newArray = new int[intArray.length - 1];
    int newArrayIndex = 0;

    for (int i : intArray) {
      if (i != 0) {
        newArray[newArrayIndex++] = i;
      }
    }

    for (int i : newArray) {
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
