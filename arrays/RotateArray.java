package arrays;

import java.util.Arrays;

public class RotateArray {
    static int[] rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int d = k % nums.length;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        start = 0;
        end = d - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
        start = d;
        end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -100, 3, 99 };
        int[] check = rotate(arr, 3);
        System.out.println(Arrays.toString(check));
    }
}
