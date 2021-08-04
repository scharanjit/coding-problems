package minDeletionsInsertionsTransformString;

import static longestCommonSubstring.Solution.findTheLengthOfLongestSubsequence;

public class Solution {

  public static void main(String[] args) {
    String s1 = "TAUGHT";
    String s2= "FIGHT";
    findMinimumNumberOfDeletionAndInsertion(s1,s2);
  }

  private static void findMinimumNumberOfDeletionAndInsertion(String s1, String s2) {

    int lcsLength = findLcsLength(s1,s2);
    System.out.println("Minimum number of deletion : " + (s1.length()-lcsLength));
    System.out.println("Minimum number of insertion :  " +(s2.length()-lcsLength));
  }

  private static int findLcsLength(String s1, String s2) {
    char[] X = s1.toCharArray();
    char[] Y = s2.toCharArray();
    int m = s1.length();
    int n = s2.length();
    return findTheLengthOfLongestSubsequence(X,Y,m,n);
  }

}
