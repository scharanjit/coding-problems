package pickingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(4);
    list.add(5);
    list.add(5);
    list.add(5);

    System.out.println(pickingNumbers(list));
  }

  private static int pickingNumbers(List<Integer> list) {
    int[] frequency = new int[101];
    int result = Integer.MIN_VALUE;

    for (int i = 0; i < list.size(); i++) {
      int index = list.get(i);
      frequency[index]++;
    }

    for (int i = 1; i <= 100; i++) {
      result = Math.max(result, frequency[i] + frequency[i - 1]);
    }
    return result;

  }

}
