package leetcode.arrays;

import util.ArrayUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer leetcode.arrays nums1 and nums2, return an array of their intersection. Each element in
 * the result must appear as many times as it shows in both leetcode.arrays and you may return the result in
 * any order.
 *
 * <p>Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2] Input: nums1 = [4,9,5], nums2 =
 * [9,4,9,8,4] Output: [4,9] Explanation: [9,4] is also accepted.
 */
public class FindIntersection {

  public static void main(String[] args) {
    //
    int[] arr1 = {4, 9, 5};
    int[] arr2 = {9, 4, 9, 8, 4};
    ArrayUtil.print(intersect(arr1, arr2));

    int[] arr3 = {1, 2, 2, 1};
    int[] arr4 = {2, 2};
    ArrayUtil.print(intersect(arr3, arr4));

    int[] arr5 = {3, 1, 2};
    int[] arr6 = {1, 1};
    ArrayUtil.print(intersect(arr5, arr6));
  }

  public static int[] intersect(int[] num1, int[] num2) {

    Map<Integer, Integer> elementCount = new HashMap<>();
    List<Integer> returnList = new ArrayList<>();
    int[] arr1, arr2;

    if (num1.length > num2.length) {
      arr1 = num1;
      arr2 = num2;
    } else {
      arr1 = num2;
      arr2 = num1;
    }

    for (int value : arr1) {
      if(elementCount.containsKey(value)){
          elementCount.put(value, elementCount.get(value) + 1);
      }else{
          elementCount.put(value, 1);
      }
    }

    for (int value : arr2) {
      if(elementCount.containsKey(value) && elementCount.get(value) != 0){
          elementCount.put(value, elementCount.get(value) - 1);
          returnList.add(value);
      }
    }

    return returnList.stream().mapToInt(value -> value).toArray();
  }
}
