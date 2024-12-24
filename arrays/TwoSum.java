package arrays;

import java.util.Arrays;

public class TwoSum {
    // brute force
    static int[] getIndices(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] check = getIndices(arr, 9);
        System.out.println(Arrays.toString(check));
    }
}
