package arrayManipulation;

public class ArrayManipulation {

  public static void main(String[] args) {

    int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
    System.out.println(findMax(5, queries));
  }

  private static long findMax(int sizeOfArray, int[][] queries) {

    long[] outputArray = new long[sizeOfArray + 2];

    for (int i = 0; i < queries.length; i++) {

      int a = queries[i][0];  //initial index
      int b = queries[i][1];  //To index or upto
      int k = queries[i][2];
      outputArray[a] += k;
      outputArray[b] -= k;
    }
    return getMax(outputArray);


  }

  private static long getMax(long[] outputArray) {
    long max = Integer.MIN_VALUE;
    long sum = 0;
    for (long l : outputArray) {
      sum = sum + l;
      max = Math.max(max, sum);
    }
    return max;
  }

}
