package minimumDistances;

import java.util.HashMap;

public class MinimumDistances {


  public static void main(String[] args) {
    int[] a = {1, 2, 3, 1, 7, 8, 9, 1, 20, 1};
    System.out.println(findMinimumDistance(a));

    int[] a1 = {1, 2, 3, 1, 5, 6, 7, 8, 5, 1};
    System.out.println(findMinimumDistance(a1));
  }

  private static int findMinimumDistance(int[] a) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int minimumDistance = Integer.MAX_VALUE, currentIndex = 0, prevIndex = 0;

    for (int i = 0; i < a.length; i++) {
      if (hashMap.containsKey(a[i])) {
        currentIndex = i;
        prevIndex = hashMap.get(a[i]);
        minimumDistance = Math.min(currentIndex - prevIndex, minimumDistance);
      }
      hashMap.put(a[i], i);
    }

    return (minimumDistance == Integer.MAX_VALUE) ? -1 : minimumDistance;


  }

}
