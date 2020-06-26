package me.yhb.leetcode;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int length1 = nums1.length;
        int length2 = nums2.length;
        int total = length1 + length2;
        int middle = (total + 1) / 2;
        if (length1 == 0) {
            return length2 % 2 == 0 ? (nums2[middle] + nums2[middle -1]) * 0.5 : nums2[middle-1];
        }

        int min = 0;
        int max = length1;
        int minMax = 0;
        while (min <= max) {
            int m = (min + max) / 2;
            int n = middle - m;
            int left1 = m == 0 ? Integer.MIN_VALUE : nums1[m - 1];
            int right2 = n == length2 ? Integer.MAX_VALUE : nums2[n];
            if (left1 <= right2) {
                minMax = m;
                min = m + 1;
            } else {
                max = m - 1;
            }
        }
        int val1 = dealMinBoundary(nums1, minMax);
        int val2 = dealMinBoundary(nums2, middle - minMax);
        int minMaxVal = Math.max(val1, val2);
        int val3 = dealMaxBoundary(nums1, minMax);
        int val4 = dealMaxBoundary(nums2, middle - minMax);
        int maxMinVal = Math.min(val3, val4);
        return total % 2 == 0 ? (minMaxVal + maxMinVal) * 0.5: minMaxVal;
    }

    private int dealMinBoundary(int[] nums, int pos) {
        return pos == 0 ? Integer.MIN_VALUE : nums[pos - 1];
    }

    private int dealMaxBoundary(int[] nums, int pos) {
        return pos == nums.length ? Integer.MAX_VALUE : nums[pos];
    }
}
