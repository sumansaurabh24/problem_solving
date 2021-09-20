package leetcode.linkedlist;

import util.LinkedListUtil;

/**
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 *
 * <p>Input: l1 = [1,2,4], l2 = [1,3,4] Output: [1,1,2,3,4,4]
 *
 * <p>Input: l1 = [], l2 = [] Output: []
 *
 * <p>Input: l1 = [], l2 = [0] Output: [0]
 */
public class MergeSortedLinkedList {

  public static void main(String[] args) {
    ListNode l1 = null;
    ListNode l2 = null;
    LinkedListUtil.print(mergeTwoLists(l1, l2));
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    ListNode root = new ListNode();
    ListNode current = root;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        current.val = l1.val;
        current.next = new ListNode();
        l1 = l1.next;
      } else {
        current.val = l2.val;
        current.next = new ListNode();
        l2 = l2.next;
      }
      current = current.next;
    }

    while (l1 != null) {
      current.val = l1.val;
      if (l1.next != null) {
        current.next = new ListNode();
        current = current.next;
      }
      l1 = l1.next;
    }

    while (l2 != null) {
      current.val = l2.val;
      if (l2.next != null) {
        current.next = new ListNode();
        current = current.next;
      }
      l2 = l2.next;
    }

    return root;
  }
}
