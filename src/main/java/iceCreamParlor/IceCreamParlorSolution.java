package iceCreamParlor;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlorSolution {


  public static void main(String[] args) {
    int[] arr = {1, 4, 5, 3, 2};
    int money = 8;

    printResultArray(approach1WithHashMap(arr, money));
  }

  private static void printResultArray(int[] result) {
    System.out.println("Indexes are : ");
    for (int j : result) {
      System.out.print(j + " ");
    }
  }

  private static int[] approach1WithHashMap(int[] arr, int money) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int x = arr[i];
      int y = money - x;
      Integer j = map.get(y);
      if (j != null) {
        result[0] = j + 1;
        result[1] = i + 1;
        break;
      }
      map.put(x, i);
    }
    return result;
  }
}
