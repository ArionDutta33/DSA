package revsision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RotateArray {
    static void reverseArray(int[] arr, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }

    public static void main(String[] args) {
        // o(n) & o(n)
        // int[] arr = new int[nums.length];
        // Map<Integer, Integer> hashMap = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // hashMap.put(i, nums[i]);
        // }
        // for (int i = 0; i < nums.length; i++) {
        // arr[(i + 3) % arr.length] = hashMap.get(i);
        // }
        // System.out.println(hashMap);
        // System.out.println(Arrays.toString(arr));
        int k = 3;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);

        System.out.println("hcek");
        System.out.println(Arrays.toString(nums));

    }
}