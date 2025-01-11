package arrays;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = { -1, -2, -3 };
        Arrays.sort(nums);
        int product = 1;
        for (int i = nums.length - 3; i < nums.length; i++) {
            if (nums[i] < 0)
                nums[i] = nums[i] * -1;
            product *= nums[i];
        }

        System.out.println(product);
    }
}
