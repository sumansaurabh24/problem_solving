package leetcode.arrays;

public class SearchWhereTonInsertInSorted {

  public static void main(String[] args) {
    int[] nums = {1};
    int target = 0;
    System.out.println(searchInsert(nums, target));
  }

  public static int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid ;
      }
    }

    if(target > nums[left]){
      return left + 1 ;
    }else{
      return left;
    }
  }
}
