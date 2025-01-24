package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfArrays {
    // static int[] intersectionArray(int[] nums1, int[] num2) {

    // }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        boolean test = false;
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                test = true;
            }
        }
        String check = "name";
        check.toLowerCase();
        System.out.println(check);

    }
}
