package climbingTheLeaderboard;

//import static java.util.Arrays.binarySearch;

public class ClimbingLeaderBoard {

  public static void main(String[] args) {

    int[] teamScores = {100, 100, 50, 40, 40, 20, 10};
    int[] aliceScores = {5, 25, 50, 120};
    System.out.println(findTheRankArray(teamScores, aliceScores));
    System.out.println();
  }

  private static int[] findTheRankArray(int[] teamScores, int[] aliceScores) {

    int[] resultArray = new int[aliceScores.length];
    int[] rankArray = new int[teamScores.length];

    rankArray[0] = 1; //first Element always have rank 1

    for (int i = 1; i < rankArray.length; i++) {
      if (teamScores[i] == teamScores[i - 1]) {
        rankArray[i] = rankArray[i - 1];  // if matching, assign the same rank
      } else {
        rankArray[i] = rankArray[i - 1] + 1;  //if not equal , assign the next rank
      }
    }

    for (int i = 0; i < aliceScores.length; i++) {

      if (aliceScores[i] > teamScores[0]) {
        resultArray[i] = 1;
      } else if (aliceScores[i] < teamScores[teamScores.length - 1]) {
        resultArray[i] = rankArray[teamScores.length - 1] + 1;
      } else {
        int index = binarySearch(teamScores, aliceScores[i]);
        resultArray[i] = index;
      }
    }

    return resultArray;
  }

  /**
   * Binary search
   *
   * @param teamScores
   * @param aliceScore
   * @return
   */
  private static int binarySearch(int[] teamScores, int aliceScore) {
    int lo = 0;
    int hi = teamScores.length - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (teamScores[mid] == aliceScore) {
        return mid;
      } else if (teamScores[mid] < aliceScore && aliceScore < teamScores[mid - 1] ) {
        //alice lies to right side of mid
        return mid;
      } else if (teamScores[mid] > aliceScore && aliceScore >= teamScores[mid + 1]) {
        //alice lies tto left side of mid
        return mid + 1;
      } else if (teamScores[mid] < aliceScore) {
        hi = mid - 1;
      } else if (teamScores[mid] > aliceScore) {
        lo = mid + 1;
      }

    }
    return -1;
  }

}
