package revsision;

import java.util.Arrays;

public class HowManySmallerThanCurrent {

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            k = 0;
            for (int j = 0; j < res.length; j++) {
                if (arr[j] < arr[i] && i != j) {
                    k++;
                }
            }
            res[i] = k;
        }
        System.out.println(Arrays.toString(res));

    }
}