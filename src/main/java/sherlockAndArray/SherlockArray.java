package sherlockAndArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 2x + y = sum
 */
public class SherlockArray {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(3);
    System.out.println(neutralElementExist(l));

    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    System.out.println(neutralElementExist(l1));
  }

  private static String neutralElementExist(List<Integer> l) {
    int sumOfArray = 0;
    int x = 0;
    for (Integer integer : l) {
      sumOfArray = sumOfArray + integer;
    }

    for (Integer y : l) {
      if (2 * x == sumOfArray - y) {
        return "YES";
      }
      x = x + y;

    }
    return "NO";
  }

}
