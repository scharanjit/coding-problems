package biggerIsGreater;


import java.util.Arrays;

/**
 * Traverse the character array from right Find the character from right side which is smaller than
 * previous one Now swap this nextSmallChar den swap from character index...and sort them
 */
public class BiggerIsGreater {

  public static void main(String[] args) {
    String value = "ecdigf";
    System.out.println(findNextGreaterSequence(value));

    String value1 = "abcd";
    System.out.println(findNextGreaterSequence(value1));
  }

  private static String findNextGreaterSequence(String value) {
    char[] charArray = value.toCharArray();
    int n = charArray.length;

    int endIndex = 0;
    //traverse right to left finding
    for (endIndex = n - 1; endIndex > 0; endIndex--) {
      if (charArray[endIndex] > charArray[endIndex - 1]) {
        break;
      }
    }

    if (endIndex == 0) {
      return "no answer";
    } else {
      int firstSmallChar = charArray[endIndex - 1];
      int nextSmallChar = endIndex;

      // Now we need to swap first Small Char with Next Small char

      for (int startIndex = endIndex + 1; startIndex < n; startIndex++) {

        if (charArray[startIndex] > firstSmallChar && charArray[startIndex] < charArray[nextSmallChar]) {
          nextSmallChar = startIndex;
        }
      }

      swap(charArray, endIndex - 1, nextSmallChar);

      // sort in ascending order
      Arrays.sort(charArray, endIndex, n);

    }

    return new String(charArray);
  }

  private static void swap(char[] charArray, int i, int nextSmallChar) {

    char temp = charArray[i];
    charArray[i] = charArray[nextSmallChar];
    charArray[nextSmallChar] = temp;
  }

}
