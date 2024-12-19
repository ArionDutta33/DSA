package arrays;

import java.util.Arrays;

public class NumberAppearsOnce {
    static int once(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int nums = once(arr);
        System.out.println(nums);
    }
}
