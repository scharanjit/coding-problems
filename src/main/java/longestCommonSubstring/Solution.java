package longestCommonSubstring;

public class Solution {

  public static void main(String[] args) {
    char[] string1 = {'J', 'A', 'V', 'A', 'I', 'D'};
    char[] string2 = {'J', 'A', 'V', 'A'};
    findTheLengthOfLongestSubsequence(string1, string2, 6, 4);
  }

  private static void findTheLengthOfLongestSubsequence(char[] string1, char[] string2, int m,
      int n) {

    int[][] memo = new int[m + 1][n + 1];
    int result = 0;
    for (int i = 0; i <=m; i++) {
      for (int j = 0; j <=n; j++) {
        if (i == 0 || j == 0) {
          memo[i][j] = 0;
        } else if (string1[i - 1] == string2[j - 1]) {
          memo[i][j] = memo[i - 1][j - 1] + 1;
          result = Math.max(result, memo[i][j]);
        } else {
          memo[i][j] = 0;
        }

      }
    }
    System.out.println(result);
  }

}
