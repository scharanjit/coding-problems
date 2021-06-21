package maxConsecutiveBinaryOne;

public class ConsecutiveBinaryOnes {

  public static void main(String[] args) {
    long number = 1100111000;
    System.out.println(countConsecutive1sInBinary(number));
  }

  private static int countConsecutive1sInBinary(long number) {
    int count = 0;
    while (number > 0) {
      number = number & (number << 1);
      count++;

    }
    return count;
  }


}
