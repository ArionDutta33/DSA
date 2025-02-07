package Probs;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    static int longestSubstringLength(String string) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = Integer.MIN_VALUE;

        while (right < string.length()) {
            if (!set.contains(string.charAt(right))) {
                set.add(string.charAt(right));
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(string.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}