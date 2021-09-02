package repeatedString;

public class Solution {

  public static void main(String[] args) {
    findRepeatedString("aba", 10);
    findRepeatedString("aab", 10);
    findRepeatedString("aab", 11);
  }

  private static void findRepeatedString(String s, long n) {

    int strLength = s.length();
    long q = 0, r = 0;
    q = n / strLength;
    r = n % strLength;
    long partialStrLen = (r == 0) ? 0 : r;
    long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
    System.out.println(aCount);
  }

  private static long getLetterCount(String s, long length) {
    long count = 0;
    for (int i = 0; i < length; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }

    return count;
  }
}
