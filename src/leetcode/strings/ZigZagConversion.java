package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

  public static String convert(String s, int numRows) {
    List<StringBuffer> list = new ArrayList<>();

    int cursor = -1;
    int row = 0;
    int currentIdx = 0;
    while (currentIdx < s.length()) {

      if (list.size() == row || list.get(row) == null) {
        StringBuffer sb = new StringBuffer();
        list.add(sb);
      }

      list.get(row).append(s.charAt(currentIdx));

      if (row == 0 || row == numRows - 1) {
        cursor *= -1;
      }

      row += cursor;
      currentIdx++;
    }

    StringBuffer returnStr = new StringBuffer();

    for (StringBuffer sb : list) {
      returnStr.append(sb.toString());
    }

    return returnStr.toString();
  }
}
