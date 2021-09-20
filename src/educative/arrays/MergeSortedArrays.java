package educative.arrays;

import util.ArrayUtil;

/**
 * In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1,
 * int[] arr2) method, which returns an array consisting of all elements of both arrays in a sorted
 * way.
 *
 * <p>Input: arr1 = {1, 3, 4, 5} arr2 = {2, 6, 7, 8}
 *
 * <p>Output: arr = {1, 2, 3, 4, 5, 6, 7, 8}
 */
public class MergeSortedArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 4, 5}, arr2 = {2, 6, 7, 8};
    ArrayUtil.print(mergeArrays(arr1, arr2));
    int[] arr3 = {1, 12, 14, 17, 23};
    int[] arr4 = {11, 19, 27};
    ArrayUtil.print(mergeArrays(arr3, arr4));
  }

  public static int[] mergeArrays(int[] arr1, int[] arr2) {
    int totalResultArrayLength = arr1.length + arr2.length;
    int[] returnList = new int[totalResultArrayLength];

    if (totalResultArrayLength == 0) {
      return returnList;
    }

    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        returnList[k++] = arr1[i++];
      } else {
        returnList[k++] = arr2[j++];
      }
    }

    while (i < arr1.length) {
      returnList[k++] = arr1[i++];
    }

    while (j < arr2.length) {
      returnList[k++] = arr2[j++];
    }

    return returnList;
  }
}
