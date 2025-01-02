package revsision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturningSum {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        int[] arr = new int[nums.length];
        Map<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            hashMap.put(i, sum);

        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = hashMap.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
