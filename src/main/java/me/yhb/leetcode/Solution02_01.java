package me.yhb.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */



public class Solution02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        Set<Integer> intSet = new HashSet<>();
        intSet.add(head.val);
        ListNode pointer = head;
        ListNode next = pointer.next;
        while(next != null) {
            int value = next.val;
            if (intSet.contains(value)) {
                pointer.next = next.next;
            } else {
                intSet.add(value);
                pointer = pointer.next;
            }
            next = pointer.next;
        }
        return  head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
