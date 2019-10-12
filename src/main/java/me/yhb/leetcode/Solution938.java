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
        while (!(stack.empty() && node == null)) {
            if (node != null && node.left != null) {
                stack.push(node);
                node = node.left;
                continue;
            }
            if (node == null) {
                node = stack.pop();
            }
            int val = node.val;
            if (val >= L && val <= R) {
                sum += val;
            } else if (val > R ) {
                break;
            }
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
