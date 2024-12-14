package arrays;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] arr = new int[2 * nums.length];
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length / 2) {

                arr[i] = nums[i];
            } else {
                arr[i] = nums[i % nums.length];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
