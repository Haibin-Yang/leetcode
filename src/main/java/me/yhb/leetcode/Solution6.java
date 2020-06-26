package me.yhb.leetcode;

public class Solution6 {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows || numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int count = 0;
            int j = i;
            int step1 = (numRows - i - 1) << 1;
            int step2 = i << 1;
            while (j < length) {
                count ++;
                if (count % 2 == 1) {
                    if (step1 > 0) {
                        sb.append(s.charAt(j));
                        j += step1;
                    }
                } else {
                    if (step2 > 0) {
                        sb.append(s.charAt(j));
                        j += step2;
                    }
                }
            }
        }
        return sb.toString();
    }
}
