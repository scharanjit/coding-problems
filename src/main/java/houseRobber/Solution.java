package houseRobber;

public class Solution {

  public static void main(String[] args) {
    int[] moneyInEachHouse = {2, 7, 9, 3, 1};
    int[] moneyInEachHouse1 = {5, 3, 4, 11, 2};

    System.out.println(robHouse(moneyInEachHouse));
    System.out.println(robHouse(moneyInEachHouse1));
  }

  private static int robHouse(int[] moneyInEachHouse) {

    if (moneyInEachHouse == null || moneyInEachHouse.length == 0) {
      return 0;
    }
    if (moneyInEachHouse.length == 1) {
      return moneyInEachHouse[0];
    }

    int prev2 = moneyInEachHouse[0];
    int prev1 = Math.max(moneyInEachHouse[0], moneyInEachHouse[1]);

    for (int i = 2; i < moneyInEachHouse.length; i++) {
      int temp = prev1;
      prev1 = Math.max(prev2 + moneyInEachHouse[i], prev1);
      prev2 = temp;
    }

    return prev1;

  }

}
