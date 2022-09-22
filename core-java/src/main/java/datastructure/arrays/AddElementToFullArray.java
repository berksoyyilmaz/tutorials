package datastructure.arrays;

public class AddElementToFullArray {

  public static void main(String[] args) {
    int[] array = getArray();
    addElementToFullArray(56, array);
  }


  private static void addElementToFullArray(int newValue, int[] intArray) {
    int length = intArray.length;
    int newArrayLength = length + 1;
    int[] newArray = new int[newArrayLength];

    for (int i = 0; i < intArray.length; i++) {
      newArray[i] = intArray[i];
//    Does same instead of for loop
//    System.arraycopy(intArray, 0, newArray, 0, intArray.length);
    }

    int newArrayLastIndex = newArrayLength - 1;
    newArray[newArrayLastIndex] = newValue;

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
