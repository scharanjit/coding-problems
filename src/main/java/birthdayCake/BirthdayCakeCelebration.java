package birthdayCake;

public class BirthdayCakeCelebration {


  public static void main(String[] args) {
    int[] candlesHeight = {1,2,3,4,5,5,3,4,2,1,4,5};
    System.out.println(findMaxCandleFreqCount(candlesHeight));
  }

  private static int findMaxCandleFreqCount(int[] candlesHeight) {
    int maxCandleHeight = Integer.MIN_VALUE;
    int maxCandleFreqCount = 0;

    for(int i =0;i< candlesHeight.length; i++){
      if(candlesHeight[i] == maxCandleHeight) {
        maxCandleFreqCount++;
      }

        if(candlesHeight[i] > maxCandleHeight) {
          maxCandleHeight = candlesHeight[i];
          maxCandleFreqCount = 1;
        }


    }
    return maxCandleFreqCount;
  }

}
