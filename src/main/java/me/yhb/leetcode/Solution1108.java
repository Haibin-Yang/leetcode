package me.yhb.leetcode;

public class Solution1108 {
    public String defangIPaddr(String address) {
        int len = address.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
