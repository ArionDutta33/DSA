package arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int j = 0;
        int k = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg[j] = nums[i];
                j++;
            }
        }
        int l = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = pos[l];
            arr[2 * i + 1] = neg[l];
            l++;
        }
        System.out.println(Arrays.toString(arr));
    }
}