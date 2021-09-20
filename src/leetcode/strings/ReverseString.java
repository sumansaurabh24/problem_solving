package leetcode.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * <p>Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
 *
 * <p>Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {

  public static void main(String[] args) {
    //
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    reverseString(s);
    System.out.println(s);
  }

  public static void reverseString(char[] s) {
    int start = 0, end = s.length - 1;

    while (start < end) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
  }
}
