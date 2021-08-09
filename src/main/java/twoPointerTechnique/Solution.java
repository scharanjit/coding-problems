package twoPointerTechnique;

public class Solution {

  public static void main(String[] args) {
    int[] a = {-3, 2, 3, 3, 6, 8, 15};
    int target = 12;

    printIndex(findIndexOfTwoElementsWithEqualSumToTarget(a, target));

    System.out.println("------------------");
    int[] a1 = {-3, 2, 3, 3, 6, 8, 15};
    int target1 = 6;

    printIndex(findIndexOfTwoElementsWithEqualSumToTarget(a1, target1));
  }

  private static void printIndex(int[] indexOfTwoElementsWithEqualSumToTarget) {
    for (int i = 0; i < indexOfTwoElementsWithEqualSumToTarget.length; i++) {
      System.out.println(indexOfTwoElementsWithEqualSumToTarget[i]);
    }
  }

  private static int[] findIndexOfTwoElementsWithEqualSumToTarget(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;
    int[] result = new int[2];

    while (start < end) {
      int sum = a[start] + a[end];
      if (sum == target) {
        result[0] = start + 1;
        result[1] = end + 1;
        break;
      } else if (sum < target) {
        start++;
      } else {
        end--;
      }
    }
    return result;


  }

}
