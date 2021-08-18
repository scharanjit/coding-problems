package maxConsecutiveOneS;

public class Solution {

  public static void main(String[] args) {
    Long number = 110011100011110000L;

    countNumberOfConsecutive1s(number);
  }

  private static void countNumberOfConsecutive1s(Long number) {
    int count = 0;

    while (number > 0) {
      number = number & (number << 1);
      count = count + 1;
    }
    System.out.println(count);
  }

}
