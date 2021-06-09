package catMouseProblem;


/***
 *
 * Find the distance between 2 cats and mouse
 * **/
public class CatAndMouse {

  public static void main(String[] args) {

    // Cat A Cat B Mouse C
    System.out.println(findTheResult(1, 2, 3));

    //Cat A Mouse C Cat B
    System.out.println(findTheResult(1, 3, 2));
  }

  private static String findTheResult(int x, int y, int z) {

    int a = Math.abs(x - z);
    int b = Math.abs(y - z);

    if (a > b) {
      return "Cat B";
    } else if (a < b) {
      return "Cat A";
    } else {
      return "Mouse C";
    }
  }

}
