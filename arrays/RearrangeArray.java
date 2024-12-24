package arrays;

import java.util.Arrays;

public class RearrangeArray {
    // static int[] rearrangeArraay(int[] arr) {
    // // int[] nums = { 5, -1, -3, -4, 7, 8 };
    // // [5, -1, 7, -3, 8, -4]
    // int leftPtr = 0;
    // int rightPtr = 1;
    // while (rightPtr < arr.length) {
    // if (arr[leftPtr] >= 0) {
    // leftPtr++;
    // } else if (leftPtr < 0) {
    // if (rightPtr > 0) {
    // int temp = arr[leftPtr];
    // arr[leftPtr] = arr[rightPtr];
    // arr[rightPtr] = temp;
    // }
    // }
    // rightPtr++;
    // }

    // }

    public static void main(String[] args) {
        int[] arr = { 5, -1, -3, -4, 7, 8 };
        int leftPtr = 0;
        int rightPtr = 1;
        while (rightPtr < arr.length) {
            if (arr[leftPtr] >= 0) {
                leftPtr++;
            } else if (leftPtr < 0) {
                if (rightPtr > 0) {
                    int temp = arr[leftPtr];
                    arr[leftPtr] = arr[rightPtr];
                    arr[rightPtr] = temp;
                }
            }
            rightPtr++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
