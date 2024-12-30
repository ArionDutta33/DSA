package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplcates {

    public static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1); // Increment count
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        // Map<Integer, Integer> hashMap = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1); // Increment count
        // }
        boolean check = hasDuplicate(arr);
        System.out.println(check);
    }

}
