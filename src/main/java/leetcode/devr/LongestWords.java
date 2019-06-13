package leetcode.devr;

import java.util.HashMap;
import java.util.Map;

public class LongestWords {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if (n < 2) return n;

        int ans = 0;
        Integer j=0, i=0;
        final Map<Character, Integer> setMap = new HashMap<>();

        while (j < n) {
            final Character atChar = s.charAt(j++);
            final Integer slideStart = setMap.put(atChar, j);
            if (slideStart != null)  {
                i = Math.max(slideStart, i);
            }
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}
