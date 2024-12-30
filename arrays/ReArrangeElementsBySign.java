package arrays;

import java.util.Arrays;

public class ReArrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        int[] pa = new int[arr.length / 2];
        int[] na = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pa[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                na[i] = arr[i];
        }

        System.out.println(Arrays.toString(pa) + Arrays.toString(na));
    }
}
