package slidingWindow;

public class Solution {

  public static void main(String[] args) {
    int[] a = {1, 9, -1, -2, 7, 3, -1, 2};
    int windowSize = 4;
    System.out.println(findMaxSumSubArrayOfSizeWindow(a, windowSize));
  }

  private static int findMaxSumSubArrayOfSizeWindow(int[] a, int windowSize) {

    int windowSum = 0, maxSum = 0;
    for (int i = 0; i < windowSize; i++) {
      windowSum += a[i];
    }

    for (int end = windowSize; end < a.length; end++) {
      windowSum += a[end] - a[end - windowSize];

      maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
  }

}
