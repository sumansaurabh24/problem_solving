package leetcode.strings;

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    String s = "cbbd";
    System.out.println(longestPalindrome(s));
  }

  public static String longestPalindrome(String s) {

    int left = 0, right = 0, maxLength = 0;

    for (int i = 0; i < s.length(); i++) {

      int odd = expandMid(s, i, i);
      int even = expandMid(s, i, i + 1);

      int currentLength = Math.max(odd, even);
      System.out.println(currentLength);
      if (currentLength > maxLength) {
        left = (i - (currentLength - 1)) / 2;
        right = (i + currentLength) / 2;
        maxLength = currentLength;
      }
    }
    System.out.println(left + " " + right);
    return s.substring(left, right + 1);
  }

  public static int expandMid(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }

    return right - left - 1;
  }
}
