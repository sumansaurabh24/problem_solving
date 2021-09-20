package leetcode.arrays;

/**
 * Implement strStr().
 *
 * <p>Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 *
 * <p>Clarification:
 *
 * <p>What should we return when needle is an empty string? This is a great question to ask during
 * an interview.
 *
 * <p>For the purpose of this problem, we will return 0 when needle is an empty string. This is
 * consistent to C's strstr() and Java's indexOf().
 *
 * <p>Input: haystack = "hello", needle = "ll" Output: 2
 *
 * <p>Input: haystack = "aaaaa", needle = "bba" Output: -1
 *
 * <p>Input: haystack = "", needle = "" Output: 0
 */
public class ImplementStrStr {

  public static void main(String[] args) {
    String haystack = "a";
    String needle = "a";
    System.out.println(strStr(haystack, needle));
  }

  public static int strStr(String haystack, String needle) {

    int needleLength = needle.length();

    if (needleLength == 0) {
      return 0;
    }

    for (int i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(0)
          && haystack.length() - i >= needleLength
          && haystack.substring(i, i + needleLength).equals(needle)) {
        return i;
      }
    }

    return -1;
  }
}

// h e l l o
// 0 1 2 3 4

// 5 - 2   = 3
// 2
