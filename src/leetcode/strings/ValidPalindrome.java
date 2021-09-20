package leetcode.strings;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 *
 * <p>Input: s = "A man, a plan, a canal: Panama" Output: true Explanation: "amanaplanacanalpanama"
 * is a palindrome.
 *
 * <p>Input: s = "race a car" Output: false Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {

  public static void main(String[] args) {
    String s = ".,";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    int start = 0, end = s.length() - 1;
    while (start < end) {
      if (Character.isLetterOrDigit(s.charAt(start))
          && !Character.isLetterOrDigit(s.charAt(end))) {
          end--;
          continue;
      }else if(!Character.isLetterOrDigit(s.charAt(start))
              && Character.isLetterOrDigit(s.charAt(end))){
          start++;
          continue;
      }else if(!Character.isLetterOrDigit(s.charAt(start))
              && !Character.isLetterOrDigit(s.charAt(end))){
          start++;
          end--;
          continue;
      }

      if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
          return false;
      }

      start++;
      end--;
    }
    return true;
  }
}
