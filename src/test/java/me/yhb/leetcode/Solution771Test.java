package me.yhb.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution771Test {

    @Test
    public void numJewelsInStones() {
        Solution771 solution771 = new Solution771();
        System.out.println(solution771.numJewelsInStones("ejh"
                ,"fzi"));
    }

    @Test
    public void charToInt() {
        Solution771 solution771 = new Solution771();
        assertEquals(solution771.charToInt('z'), 51);
    }
}