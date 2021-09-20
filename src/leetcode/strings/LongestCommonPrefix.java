package leetcode.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * <p>If there is no common prefix, return an empty string "".
 *
 * <p>Input: strs = ["flower","flow","flight"] Output: "fl"
 *
 * <p>Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no common prefix among
 * the input strings.
 */
public class LongestCommonPrefix {
  public static void main(String[] args) {
    String[] strings = {"flower", "flow", "flight"};
    System.out.println(longestCommonPrefix(strings));
  }

  public static String longestCommonPrefix(String[] strs) {
    if(strs.length == 0) return "";

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0){
        prefix = prefix.substring(0, prefix.length()-1);
      }
    }

    return prefix;
  }
}
