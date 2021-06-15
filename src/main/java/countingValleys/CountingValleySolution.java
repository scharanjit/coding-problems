package countingValleys;


/**
 * Valley is considered when we are going down and touching sea level
 * <p>
 * img_2.png has 2 valleys and 1 mountain
 */
public class CountingValleySolution {

  public static void main(String[] args) {
    System.out.println(countValleys(10, "UDUDUUUDDU"));
    System.out.println(countValleys(8, "UDDDUDUU"));
  }

  private static int countValleys(int n, String steps) {

    int valleyCount = 0;
    int altitute = 0;

    for (int i = 0; i < n; i++) {
      if (steps.charAt(i) == 'U') {
        altitute++;
        if (altitute == 0) {
          valleyCount++;
        }
      } else {
        altitute--;
      }
    }
    return valleyCount;
  }

}
