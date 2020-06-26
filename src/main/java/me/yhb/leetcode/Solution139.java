package me.yhb.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] validCache = new boolean[length + 1];
        validCache[0] = true;
        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (validCache[j] && wordSet.contains(s.substring(j, i))) {
                    validCache[i] = true;
                    break;
                }
            }
        }
        return validCache[length];
    }
}
