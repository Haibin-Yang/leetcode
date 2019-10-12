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
        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (val > R) {
            return rangeSumBST(root.left, L, R);
        } else if (val < L) {
            return rangeSumBST(root.right, L, R);
        } else {
            return val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
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
