package separateTheNumbers;

public class Solution {

  public static void main(String[] args) {
    separateTheNumber("99100101");
    separateTheNumber("991990");
  }

  private static void separateTheNumber(String s) {

    String subString = "";
    boolean isValid = false;

    for (int i = 1; i < s.length() / 2; i++) {
      subString = s.substring(0, i);
      Long num = Long
          .parseLong(subString);  // converting string into number as we need to increment it
      String validString = subString;
      while (validString.length() < s.length()) {
        validString += Long.toString(++num); //append valid string with incremented number
      }
      if (s.equals(validString)) {
        isValid = true;
        break;
      }
    }
    System.out.println(isValid ? "Yes " + subString : "NO");


  }


}
