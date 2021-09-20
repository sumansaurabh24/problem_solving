package leetcode.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 *
 * <p>An input string is valid if:
 *
 * <p>Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
 * correct order.
 *
 * <p>Input: s = "()" Output: true
 *
 * <p>Input: s = "()[]{}" Output: true
 *
 * <p>Input: s = "(]" Output: false
 *
 * <p>Input: s = "([)]" Output: false
 */
public class ValidParentheses {

  public static void main(String[] args) {
    String s = "([)]";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    Map<Character, Character> parenthesesMap =
        new HashMap<Character, Character>() {
          {
            put(']', '[');
            put('}', '{');
            put(')', '(');
          }
        };
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      Character correspondingClosingParenthesesChar = parenthesesMap.get(s.charAt(i));
      if (!stack.empty() && correspondingClosingParenthesesChar == stack.peek()) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }

    return stack.empty();
  }
}
