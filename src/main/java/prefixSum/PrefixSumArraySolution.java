package prefixSum;


public class PrefixSumArraySolution {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    prefixSumArray(arr);
  }

  private static void prefixSumArray(int[] arr) {
    int[] newArray = new int[arr.length];
    newArray[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      newArray[i] = arr[i] + arr[i - 1];
    }

    printArray(newArray);

  }

  private static void printArray(int[] arr) {
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }

}
