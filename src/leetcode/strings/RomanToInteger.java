package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * <p>Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000
 *
 * <p>For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written
 * as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * <p>Roman numerals are usually written largest to smallest from left to right. However, the
 * numeral for four is not IIII. Instead, the number four is written as IV. Because the one is
 * before the five we subtract it making four. The same principle applies to the number nine, which
 * is written as IX. There are six instances where subtraction is used:
 *
 * <p>I can be placed before V (5) and X (10) to make 4 and 9. X can be placed before L (50) and C
 * (100) to make 40 and 90. C can be placed before D (500) and M (1000) to make 400 and 900. Given a
 * roman numeral, convert it to an integer.
 */
public class RomanToInteger {

  public static void main(String[] args) {
    //
    String s = "MCMXCIV";
    System.out.println(romanToInt(s));
    String s1 = "LVIII";
    System.out.println(romanToInt(s1));
  }

  public static int romanToInt(String s) {
    Map<Character, Integer> characterIntegerMap =
        new HashMap<Character, Integer>() {
          {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
          }
        };

    int sum = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i != s.length() - 1
          && characterIntegerMap.get(s.charAt(i)) < characterIntegerMap.get(s.charAt(i + 1))) {
        sum += characterIntegerMap.get(s.charAt(i + 1)) - characterIntegerMap.get(s.charAt(i));
        i++;
      } else {
        sum += characterIntegerMap.get(s.charAt(i));
      }
    }

    return sum;
  }
}
