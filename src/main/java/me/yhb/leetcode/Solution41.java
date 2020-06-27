package me.yhb.leetcode;

public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != (i + 1)) {
                int dest = nums[i];
                int temp = nums[dest - 1];
                if (dest == temp) {
                    break;
                }
                nums[dest - 1] = dest;
                nums[i] = temp;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
