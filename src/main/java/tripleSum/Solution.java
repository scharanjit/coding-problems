package tripleSum;

import java.util.Set;
import java.util.TreeSet;

public class Solution {

  public static void main(String[] args) {
    int[] a = {3, 5, 7, 7, 1, 1};
    int[] b = {7, 5, 9};
    int[] c = {7, 9, 11, 11, 13};

    System.out.println(countTriplets(a, b, c));
  }

  private static int countTriplets(int[] a, int[] b, int[] c) {

    int distinctCount = 0;
    int[] distinctA = removeDuplicates(a);
    int[] distinctB = removeDuplicates(b);
    int[] distinctC = removeDuplicates(c);

    for (int q : distinctB) {

      long c1 = getValidIndex(distinctA, q) + 1;
      long c3 = getValidIndex(distinctC, q) + 1;
      distinctCount += c1 * c3;

    }

    return distinctCount;


  }

  private static long getValidIndex(int[] distinctA, int key) {

    int low = 0;
    int high = distinctA.length - 1;

    int count = -1;

    while (low <= high) {

      int mid = low + (high - low) / 2;
      if (distinctA[mid] <= key) {
        count = mid;
        low = mid + 1;

      } else {
        high = mid - 1;
      }
    }

    return count;

  }

  private static int[] removeDuplicates(int[] array) {

    Set<Integer> set = new TreeSet<>();

    for (int item : array) {
      set.add(item);
    }

    int len = set.size();

    int[] newArray = new int[len];

    int i = 0;
    for (int item : set) {
      newArray[i++] = item;
    }

    return newArray;
  }

}
