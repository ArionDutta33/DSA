package revsision;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    static int longestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (!set.contains(element - 1)) {
                count = 1;
                while (set.contains(element + 1)) {
                    count++;
                    element++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestSequence(new int[] { 100, 4, 200, 1, 3, 2 }));
    }
}
