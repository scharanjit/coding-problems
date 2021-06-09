package loneyInteger;

/**
 * XOR Operation
 * <p>
 * 1 1 ==> 0 0 0 ==> 0 1 0 ==> 1 0 1 ==> 1
 **/


public class LonelyInteger {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 3, 2, 1};
    int result = 0;
    for (int j : a) {
      System.out.println(result + " " + j);
      result ^= j;
      System.out.println(result + " " + j);

      System.out.println("------");
    }
    System.out.println(result);
  }


}
