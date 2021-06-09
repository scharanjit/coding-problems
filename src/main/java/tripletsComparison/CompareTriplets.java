package tripletsComparison;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(5);
    a.add(6);
    a.add(7);

    b.add(3);
    b.add(6);
    b.add(10);

    System.out.println(compareTriplesAndFindResult(a, b));


  }

  private static List<Integer> compareTriplesAndFindResult(List<Integer> a, List<Integer> b) {

    int aliceTotalScore = 0;
    int bobTotalScore = 0;

    for (int i = 0; i < 3; i++) {

      int aliceScore = a.get(i);
      int bobScore = b.get(i);

      if (aliceScore != bobScore) {
        int temp = aliceScore > bobScore ? aliceTotalScore++ : bobTotalScore++;
      }
    }

    List<Integer> result = new ArrayList<>();

    result.add(aliceTotalScore);
    result.add(bobTotalScore);
    return result;


  }

}
