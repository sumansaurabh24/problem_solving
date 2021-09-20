package leetcode.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does
 * not exist, return -1.
 *
 * <p>Input: s = "leetcode" Output: 0
 *
 * <p>Input: s = "loveleetcode" Output: 2
 *
 * <p>Input: s = "aabb" Output: -1
 */
public class FindFirstUniqueCharacter {

  public static void main(String[] args) {
    String s1 = "leetcode";
    System.out.println(firstUniqChar_approach2(s1));

    String s2 = "loveleetcode";
    System.out.println(firstUniqChar_approach2(s2));

    String s3 = "aabb";
    System.out.println(firstUniqChar_approach2(s3));
  }

  public static int firstUniqChar(String s) {
    Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
    for (Character character : s.toCharArray()) {
      if (!characterCountMap.containsKey(character)) {
        characterCountMap.put(character, 1);
      } else {
        characterCountMap.put(character, characterCountMap.get(character) + 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (characterCountMap.get(s.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;
  }

  public static int firstUniqChar_approach2(String s) {
    int[] alphabetsCount = new int[26];

    for (Character character : s.toCharArray()) {
      alphabetsCount[character - 'a'] = alphabetsCount[character - 'a'] + 1;
    }

    for (int i = 0; i < s.length(); i++) {
      if (alphabetsCount[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }

    return -1;
  }
}
