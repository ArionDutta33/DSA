package arrays;

import java.util.ArrayList;

public class UnionOfArrays {
    public static void main(String[] args) {
        // 1 2 3 4 5
        // 1 2 3
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] nums = { 1, 2, 3 };
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
            if (ans != 0) {
                list.add(nums[i]);
            }
        }
        ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            if (ans != 0 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
