package countTriplets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTripletsSolution {


  public static void main(String[] args) {

    List<Long> arr = new ArrayList<>();
    arr.add(1L);
    arr.add(3L);
    arr.add(3L);
    arr.add(9L);
    arr.add(9L);
    arr.add(9L);
    arr.add(27L);
    arr.add(81L);
    System.out.println(countTriplets(arr, 3));
  }

  private static long countTriplets(List<Long> arr, int r) {

    long count = 0;

    Map<Long, Long> leftMap = new HashMap<>();
    Map<Long, Long> rightMap = new HashMap<>();

    for (long item : arr) {
      rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
    }

    for (int i = 0; i < arr.size(); i++) {
      long midTerm = arr.get(i);   // value a
      long c1 = 0, c3 = 0;         // value a/r  and ar

      //reduce the frequency from the right map, whenever we find the element
      rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

      if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
        c1 = leftMap.get(midTerm / r);
      }

      if (rightMap.containsKey(midTerm * r)) {
        c3 = rightMap.get(midTerm * r);
      }

      count += c1 * c3;

      leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

    }

    return count;

  }

}
