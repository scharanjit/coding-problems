package equalizeArray;

public class EqualizeArraySolution {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 3, 3};
    System.out.println(equalizeArray(arr));
    int[] arr1 = {9, 5, 7, 5, 7, 7, 7, 1, 2};
    System.out.println(equalizeArray(arr1));
  }

  private static int equalizeArray(int[] arr) {
    int[] aux = new int[101];
    //count the frequency of each element in aux array

    for (int i = 0; i < arr.length; i++) {
      int index = arr[i];
      aux[index]++;
    }

    return arr.length - findMaxFreq(aux);

  }

  private static int findMaxFreq(int[] aux) {
    int maxFeq = Integer.MIN_VALUE;
    for (int l : aux) {
      if (l > maxFeq) {
        maxFeq = l;
      }
    }
    return maxFeq;
  }

}
