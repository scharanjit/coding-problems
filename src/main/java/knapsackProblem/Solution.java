package knapsackProblem;

public class Solution {

  static int[] val;
  static int[] wt;


  public static void main(String[] args) {
    val = new int[]{150, 300, 200};
    wt = new int[]{1, 4, 3};
    int capacityOfKnapsack = 4;
    int numberOfItems = 3;

    System.out.println(solveKnapSack(numberOfItems, capacityOfKnapsack));
  }

  private static int solveKnapSack(int n, int C) {

    int[][] table = new int[n + 1][C + 1];

    //build table in bottom up manner

    for (int i = 0; i <=n; i++) {
      for (int j = 0; j <=C; j++) {
        if (i == 0 || j == 0) {
          table[i][j] = 0;
        } else if (wt[i - 1] > j) {
          table[i][j] = table[i - 1][j];
        } else {
          table[i][j] = Math.max(val[i - 1] + table[i - 1][j - wt[i - 1]], table[i - 1][j]);
        }

      }
    }
    printCache(table);

    return table[n][C];

  }

  private static void printCache(int[][] matrix) {
    int rowSize = matrix.length;
    int colSize = matrix[0].length;
    System.out.println("cache Table :-\n");
    for (int row = 0; row < rowSize; row++) {
      for (int col = 0; col < colSize; col++) {
        System.out.print(String.format("%03d ", matrix[row][col]));
      }
      System.out.println();
    }
    System.out.println();
  }

}
