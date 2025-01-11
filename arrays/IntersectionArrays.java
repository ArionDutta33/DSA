package arrays;

import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] res = new int[10001];
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                res[i] = nums2[i];
            }
        }

    }
}
