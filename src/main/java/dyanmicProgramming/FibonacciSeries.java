package dyanmicProgramming;

public class FibonacciSeries {

  public static void main(String[] args) {
    long startTime = 0, endTime = 0;

    startTime = System.nanoTime();
    System.out.println(recursiveSolution(9));
    endTime = System.nanoTime();
    System.out.println("Execution Time : " + (endTime - startTime));

    startTime = System.nanoTime();
    System.out.println(recursiveSolutionWithCache(9));
    endTime = System.nanoTime();
    System.out.println("Execution Time : " + (endTime - startTime));

    startTime = System.nanoTime();
    System.out.println(nonRecursiveSolutionWithCache(9));
    endTime = System.nanoTime();
    System.out.println("Execution Time : " + (endTime - startTime));

    startTime = System.nanoTime();
    System.out.println(nonRecursiveSolutionWithoutCache(9));
    endTime = System.nanoTime();
    System.out.println("Execution Time : " + (endTime - startTime));
  }

  private static int nonRecursiveSolutionWithoutCache(int n) {
    int first = 0, second = 1, sum = 0;

    if (n < 2) {
      return n;
    }

    for (int i = 2; i <= n; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }
    return sum;
  }

  private static int nonRecursiveSolutionWithCache(int n) {

    int[] cache = new int[n + 1];
    cache[0] = 0;
    cache[1] = 1;

    for (int i = 2; i <= n; i++) {
      cache[i] = cache[i - 1] + cache[i - 2];
    }
    return cache[n];

  }

  private static int recursiveSolutionWithCache(int n) {
    int[] cache = new int[n + 1];

    if (n < 2) {
      return n;
    }

    if (cache[n] != 0) {
      return cache[n];
    }

    return cache[n] = recursiveSolutionWithCache(n - 1) + recursiveSolutionWithCache(n - 2);

  }

  // time complexity  ( 2 ^ n)
  private static int recursiveSolution(int n) {
    if (n < 2) {
      return n;
    }
    return recursiveSolution(n - 1) + recursiveSolution(n - 2);
  }

}
