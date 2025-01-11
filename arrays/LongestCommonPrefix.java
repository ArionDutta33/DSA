package arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
    static String longestPrefix(String[] arr) {
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length - 1];
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < str1.length() && idx < str2.length()) {
            if (str1.charAt(idx) == str2.charAt(idx)) {
                ans.append(str2.charAt(idx));
            } else {
                break;
            }
            idx++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };
        // String ans = longestPrefix(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}