package arraysLeftRotation;

public class LeftRotation {

  public static void main(String[] args) {

    int[] a = {1, 2, 3, 4, 5};
    int leftRotationValue = 4;

    printArray(leftRotation(a, leftRotationValue));

    int leftRotationValue1 = 2;

    printArray(leftRotation(a, leftRotationValue1));


  }

  private static void printArray(int[] leftRotation) {
    for (int j : leftRotation) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  private static int[] leftRotation(int[] a, int leftRotationValue) {

    int[] rotateArray = new int[a.length];

    for (int oldIndex = 0; oldIndex < a.length; oldIndex++) {
      int newIndex = (oldIndex + a.length - leftRotationValue) % a.length;
      rotateArray[newIndex] = a[oldIndex];

    }

    return rotateArray;
  }


}
