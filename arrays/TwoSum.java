package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        for (int i = 0; i < arr.length; i++) {
            complement = target - arr[i];
            if (map.containsKey(complement))
                return new int[] { map.get(complement), i };
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));

    }
}