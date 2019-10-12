package me.yhb.leetcode;

import java.util.Stack;

/*
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                int val = node.val;
                if (val < L) {
                    node = node.right;
                } else {
                    stack.push(node);
                    node = node.left;
                }
            }
            node = stack.pop();
            int val = node.val;
            if (val > R) {
                return sum;
            }
            sum += node.val;
            node = node.right;
        }
        return sum;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
