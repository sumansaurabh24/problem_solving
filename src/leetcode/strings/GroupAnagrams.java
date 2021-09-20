package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static void main(String[] args) {
    String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
    groupAnagrams(strings);
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> returnList = new ArrayList<>();

    for (String str : strs) {

      char[] array = str.toCharArray();
      Arrays.sort(array);
      String toCheck = new String(array);

      boolean exists = map.containsKey(toCheck);

      if (exists) {
        map.get(toCheck).add(str);
      } else {
        map.put(
            toCheck,
            new ArrayList<String>() {
              {
                add(str);
              }
            });
      }
    }

    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      returnList.add(entry.getValue());
    }

    return returnList;
  }
}
