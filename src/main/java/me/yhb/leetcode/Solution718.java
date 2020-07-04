package me.yhb.leetcode;

public class Solution718 {
    public int findLength(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        int[][] dp = new int[lengthA + 1][lengthB + 1];
        int ans = 0;
        for (int i = lengthA -1; i >= 0; i--) {
            for (int j = lengthB -1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i+1][j+1] + 1 : 0;
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }
}
