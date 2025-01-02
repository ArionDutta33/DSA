package revsision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    static int unique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        // int j = 1;
        int[] arr = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4 };
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] != arr[i - 1]) {
        // arr[j] = arr[i];
        // j++;
        // }
        // }
        // System.out.println(Arrays.toString(arr));
        int res = unique(arr);
        System.out.println(res);
    }
}