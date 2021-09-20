package educative.arrays;

import util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * In this problem, you have to implement the int [] removeEven(int[] arr) method, which removes all
 * the even elements from the array and returns back updated array.
 *
 * <p>Input: arr = {1, 2, 4, 5, 10, 6, 3} Output: arr = {1, 5, 3}
 */
public class RemoveEven {

  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 10, 6, 3};
    ArrayUtil.print(removeEven(arr));
  }

  public static int[] removeEven(int[] arr) {
    List<Integer> returnList = new ArrayList<>();
    for (int value : arr) {
      if (value % 2 != 0) {
        returnList.add(value);
      }
    }
    return returnList.stream().mapToInt(value -> value).toArray();
  }
}
