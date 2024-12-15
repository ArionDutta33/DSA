package arrays;

import java.util.Arrays;

public class ReturningSumOneD {
    static int[] sum(int[] arr) {
        int[] sumarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sumarr[i] = sumarr[i] + arr[j];
            }
        }
        // sumarr[i] = sumarr[i] + arr[i];
        return sumarr;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] res = sum(arr);
        System.out.println(Arrays.toString(res));
    }

}
