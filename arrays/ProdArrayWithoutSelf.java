package arrays;

import java.util.Arrays;

public class ProdArrayWithoutSelf {
    static int[] prod(int[] nums) {
        int prod = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //
            prod *= nums[i];

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[i] = prod / nums[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, 3 };
        int[] res = prod(arr);
        System.out.println(Arrays.toString(res));
    }
}
