package me.yhb.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Test {
    public static int testException(int i) throws Exception {
        try {
            return 5 / i;
        } catch (Exception e) {
            throw new Exception("exception in method");
        } finally {
            System.out.print("finally");
        }
    }
    public static void main(String [] args) {
        Solution139 solution139 = new Solution139();

        System.out.println(solution139.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }
}
