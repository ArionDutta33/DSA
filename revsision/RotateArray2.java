package revsision;

import java.util.Arrays;

public class RotateArray2 {
    static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // 1,2,3,4,5,6,7]
        int[] arr = { 1, 2 };
        int k = 3;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
