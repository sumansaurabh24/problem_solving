package leetcode.arrays;

import util.ArrayUtil;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 *
 * <p>Since it is impossible to change the length of the array in some languages, you must instead
 * have the result be placed in the first part of the array nums. More formally, if there are k
 * elements after removing the duplicates, then the first k elements of nums should hold the final
 * result. It does not matter what you leave beyond the first k elements.
 *
 * <p>Return k after placing the final result in the first k slots of nums.
 *
 * <p>Do not allocate extra space for another array. You must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * <p>Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_] Explanation: Your function should
 * return k = 2, with the first two elements of nums being 2. It does not matter what you leave
 * beyond the returned k (hence they are underscores).
 *
 * <p>Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_] Explanation: Your
 * function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order. It does not matter what you leave
 * beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    System.out.println(removeElement(nums, val));
    ArrayUtil.print(nums);
  }

  public static int removeElement(int[] nums, int val) {
    int i = 0;
    for(int j = 0; j < nums.length; j++){
        if(nums[j] != val){
            nums[i] = nums[j];
            i++;
        }
    }

    return i;
  }
}
/**
 *               2, 2, 3, 3
 * case -1 : start = 3 and end = !3 => swap ==> 4, 2, 2, 3, start++, end--
 * case -2 : start = !3 and end = 3 => no swap => start++, end--
 * case -3 : start = 3 and end = 3 => no swap ==> end --
 * case -4 : start = !3 and end = !3 ==> no swap ==> start++
 */
