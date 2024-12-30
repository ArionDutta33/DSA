package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    static int longestSequence(int[] arr) {
        if (arr.length == 0)
            return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (Integer elem : set) {
            if (!set.contains(elem - 1)) {
                int count = 1;
                int x = elem;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        // brute force

        int[] arr = { 100, 4, 200, 1, 3, 2 };
        // int longest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // int x = arr[i];
        // int count = 1;
        // while (linearSearch(arr, x + 1) == true) {
        // x++;
        // count++;
        // }
        // longest = Math.max(longest, count);
        // }
        // System.out.println(longest);

        // optimal hashset
        int sequence = longestSequence(arr);
        System.out.println(sequence);
    }
}