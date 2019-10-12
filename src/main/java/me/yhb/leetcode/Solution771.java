package me.yhb.leetcode;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        char[] cJ = J.toCharArray();
        char[] cS = S.toCharArray();
        long jewelTable = 0L;
        int jLen = J.length();
        for(int j = 0; j < jLen; j++) {
            int jInt = charToInt(cJ[j]);
            jewelTable = jewelTable | (1L << jInt);
        }
        int sLen = S.length();
        int ret = 0;
        for(int s = 0; s < sLen; s++) {
            int sInt = charToInt(cS[s]);
            if ((jewelTable & (1L << sInt)) > 0) {
                ret++;
            }
        }
        return ret;
    }
    public int charToInt(char ch) {
        int ret = ch - 'A';
        int delta = 26 + 'A' - 'a';
        if (ret > 25) {
            ret += delta;
        }
        return ret;
    }
}
