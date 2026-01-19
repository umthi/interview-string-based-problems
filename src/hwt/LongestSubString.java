package hwt;

import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {
        String str = longestSubstring("abcbcab");
        System.out.println(str);
    }

    public static String longestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);

        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (last[c] >= left) {
                left = last[c] + 1;
            }

            last[c] = right;

            if ((right - left + 1) > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }

}

