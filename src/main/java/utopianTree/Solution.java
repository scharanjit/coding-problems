package utopianTree;

public class Solution {

  public static void main(String[] args) {
    int numberOfCycles = 7;
    System.out.println(findTheHeightOfTree(numberOfCycles));

    int numberOfCycles1 = 8;
    System.out.println(findTheHeightOfTree(numberOfCycles1));

    int numberOfCycles2 = 0;
    System.out.println(findTheHeightOfTree(numberOfCycles2));
  }

  private static int findTheHeightOfTree(int n) {
    return (1 << ((n >> 1) + 1)) - 1 << n % 2;
  }

}
