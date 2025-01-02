package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        // O(m+n)log(m+n)
        // int[] a = { 2, 2, 3, 4, 5 };
        // int[] b = { 1, 1, 2, 3, 4 };
        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < a.length; i++) {
        // set.add(a[i]);
        // }
        // for (int i = 0; i < b.length; i++) {
        // if (!set.contains(b[i])) {
        // set.add(b[i]);
        // }

        // }
        // ArrayList<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // System.out.println(list);

        int[] a = { 2, 2, 3, 4, 5 };
        int[] b = { 1, 1, 2, 3, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (list.size() == 0 || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
        }
    }
}