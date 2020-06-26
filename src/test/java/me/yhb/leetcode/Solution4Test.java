package me.yhb.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution4Test {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {-1, 3};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.findMedianSortedArrays(nums1, nums2));
    }
}