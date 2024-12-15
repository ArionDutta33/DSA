package arrays;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                // { 7, 8, 9 }
        };
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
        // System.out.println(max);
    }

}
