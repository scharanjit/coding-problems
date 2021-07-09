package sparseArrays;

import java.util.HashMap;

public class SparseArray {

  public static void main(String[] args) {

    String[] strings = {"aba", "baba", "aba", "xzxb"};
    String[] queries = {"aba", "xzxb", "xz"};

    printArray(findTheOccurances(strings, queries));

    String[] strings1 = {"aa", "bb", "aa", "cc"};
    String[] queries1 = {"aa", "cc", "bb"};

    printArray(findTheOccurances(strings1, queries1));

  }

  private static void printArray(int[] theOccurances) {
    for (int j : theOccurances) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  private static int[] findTheOccurances(String[] strings, String[] queries) {

    HashMap<String, Integer> hashMap = new HashMap<>();
    int[] result = new int[queries.length];
    for (int i = 0; i < strings.length; i++) {
      String inputString = strings[i];
      if (hashMap.containsKey(inputString)) {
        hashMap.put(inputString, hashMap.get(inputString) + 1);
      } else {
        hashMap.put(inputString, 1);
      }

    }

    for (int i = 0; i < queries.length; i++) {
      String queryString = queries[i];
      if (hashMap.containsKey(queryString)) {
        result[i] = hashMap.get(queryString);
      }
    }
    return result;
  }

}
