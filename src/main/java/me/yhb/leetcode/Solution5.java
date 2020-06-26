package me.yhb.leetcode;

public class Solution5 {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) return s;
        int left = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int max1 = maxFromCenter(s, i, i);
            if (max1 > max) {
                int expand = (max1 - 1) / 2;
                left = i - expand;
                right = i + expand;
                max = max1;
            }
            int max2 = maxFromCenter(s, i, i + 1);
            if (max2 > max) {
                int expand = max2 / 2;
                left = i - expand + 1;
                right = i + expand;
                max = max2;
            }
        }
        return s.substring(left, right);
    }

    private int maxFromCenter(String s, int left, int right) {

        int length = s.length();
        while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
        }
        return right - left - 1;
    }
}
