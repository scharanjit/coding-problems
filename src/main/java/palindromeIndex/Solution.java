package palindromeIndex;

public class Solution {

  public static void main(String[] args) {
    String value = "abbca";
    System.out.println(palindromeIndex(value));

    String value1 = "abbad";
    System.out.println(palindromeIndex(value1));

    String value2 = "aaccbbdsbbccaa";
    System.out.println(palindromeIndex(value2));
  }

  private static int palindromeIndex(String s) {
    int palindromeIndex = -1;

    int len = s.length();

    for (int i = 0; i < len / 2; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1)) {
        if (i + 1 < len) {
          boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
          if (isRightStringValidPalindrome) {
            return i;
          }
          return len - i - 1;

        }
      }
    }

    return palindromeIndex;

  }

  private static boolean isValidPalindrome(String substring) {
    int len = substring.length();
    for (int i = 0; i < len / 2; i++) {
      if (substring.charAt(i) != substring.charAt(len - i - 1)) {
        return false;
      }
    }
    return true;
  }

}
