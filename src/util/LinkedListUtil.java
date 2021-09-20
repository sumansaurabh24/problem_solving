package util;

import leetcode.linkedlist.ListNode;

public class LinkedListUtil {

  public static void print(ListNode l) {
    while (l != null) {
      System.out.print(l.getVal() + " ");
      l = l.getNext();
    }
    System.out.println("");
  }
}
