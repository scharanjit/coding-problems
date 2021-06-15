package findDigits;

public class FindDigitsSolution {

  public static void main(String[] args) {
    System.out.println(findDigits(1024));
    System.out.println(findDigits(7));
    System.out.println(findDigits(4));
    System.out.println(findDigits(11));
  }

  private static int findDigits(int n) {

    int count =0 ;
    int num = n;
    while(n > 0) {

      int r = n%10;
      if(r != 0 && num % r ==0){
        count ++;
      }
      n= n / 10;

    }
    return count;
  }

}
