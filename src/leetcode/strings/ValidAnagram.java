package leetcode.strings;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * <p>Input: s = "anagram", t = "nagaram" Output: true
 *
 * <p>Input: s = "rat", t = "car" Output: false
 */
public class ValidAnagram {

  public static void main(String[] args) {
    String s = "aa", t = "bb";
    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
      if(s.length() != s.length()){
          return false;
      }
      int[] alphabetsCount_1 = new int[26];
      int[] alphabetsCount_2 = new int[26];

      for (Character character : s.toCharArray()) {
          alphabetsCount_1[character - 'a'] = alphabetsCount_1[character - 'a'] + 1;
      }

      for (Character character : t.toCharArray()) {
          alphabetsCount_2[character - 'a'] = alphabetsCount_2[character - 'a'] + 1;
      }

      for (int i = 0; i < 26; i++) {
          if (alphabetsCount_1[i] != alphabetsCount_2[i]) {
              return false;
          }
      }

      return true;
  }
}
