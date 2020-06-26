package me.yhb.leetcode;

public class Solution237 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


