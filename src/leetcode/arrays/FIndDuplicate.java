package leetcode.arrays;

import util.ArrayUtil;

import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct. Input: nums = [1,2,3,1] Output: true Input: nums =
 * [1,2,3,4] Output: false
 */
public class FIndDuplicate {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1};
    System.out.println("Approach 1: " + containsDuplicate_approach1(arr));
    containsDuplicate_approach2(arr);
  }

  public static boolean containsDuplicate_approach1(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (set.contains(num)) {
        return false;
      }
      set.add(num);
    }

    return false;
  }

  public static void containsDuplicate_approach2(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
    }

    ArrayUtil.print(arr);
  }
}
