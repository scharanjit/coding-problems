package kangarooLineJumps;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class KangarooJump {

  public static void main(String[] args) {
    System.out.println(willKangrooMeet(0,3,4,2));
    System.out.println(willKangrooMeet(0,4,4,2));
    System.out.println(willKangrooMeet(0,19,4,2));
  }


  /**
   *
   * @param x1 Starting Position of kangaroo 1
   * @param v1 Velocity of kangaroo 1
   * @param x2 Starting Position of Kangaroo 2
   * @param v2 Velocity of Kangaroo 2
   * @return
   */
  private static boolean willKangrooMeet(int x1, int v1, int x2, int v2) {
    if(v1 > v2) {

      int remainder = (x2 -x1) % (v1-v2);
      if(remainder == 0) {
        return Boolean.TRUE;
      }


    }
    return Boolean.FALSE;
  }
}
