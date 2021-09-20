package leetcode.arrays;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that
 * single one.
 *
 * <p>You must implement a solution with a linear runtime complexity and use only constant extra
 * space.
 *
 * <p>Input: nums = [2,2,1] Output: 1
 *
 * <p>Input: nums = [4,1,2,1,2] Output: 4
 */
public class FindSingleElement {

  public static void main(String[] args) {
    //
    int[] arr = {4, 1, 2, 1, 2};
    System.out.println(find(arr));
  }

  public static int find(int[] arr) {
      int a = 0;
      for(int value : arr){
          a = a ^ value;
      }

      return a;
  }
}
