package Probs;

import java.util.HashSet;

public class LongestSubstring {
    static int lengthLongestSubstring(String s) {
        int mover1 = 0;
        int maxLength = 0;
        int length = 0;
        int mover2 = 0;
        HashSet<Character> set = new HashSet<>();
        while (mover2 < s.length()) {
            if (!set.contains(s.charAt(mover2))) {
                set.add(s.charAt(mover2));
                mover2++;
                maxLength = Math.max(length, set.size());
            } else {
                set.remove(s.charAt(mover1));
                mover1++;
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthLongestSubstring("pwwkew"));
    }
}
