package leetcode.arrays;

import util.ArrayUtil;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 *
 * <p>Note that you must do this in-place without making a copy of the array.
 *
 * <p>Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 *
 * <p>Input: nums = [0] Output: [0]
 */
public class MoveZeros {

  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 3, 12};
    moveZeroes(arr);
    ArrayUtil.print(arr);
  }

  public static void moveZeroes(int[] nums) {

      int totalZeros = 0;
      for(int value : nums){
          if(value == 0){
              totalZeros++;
          }
      }

      int replaceAbleIndex = 0;
      for(int value : nums){
          if(value != 0){
              nums[replaceAbleIndex] = value;
              replaceAbleIndex++;
          }
      }
      int index = nums.length - totalZeros;

      for(; index < nums.length; index++){
          nums[index] = 0;
      }
  }
}
