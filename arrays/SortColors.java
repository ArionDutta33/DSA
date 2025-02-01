package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int[] res = new int[arr.length];
        int low = 0;
        int high = res.length - 1;
        int i = 0;
        while (i < res.length) {
            if (arr[i] == 0) {
                res[low] = 0;
                low++;
            } else if (arr[i] == 2) {
                res[high] = 2;
                high--;
            }
            i++;
        }
        for (int j = low; j <= high; j++) {
            res[j] = 1;
        }
        for (int j = 0; j < res.length; j++) {
            arr[]
        }

        System.out.println(Arrays.toString(res));
    }
}
