package arrays;

import java.util.HashMap;

public class MaxJump {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 0 };
        boolean flag = false;// no jump possible
        int target = nums.length - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 1) {
            System.out.println("true");
            return;
        }
        if (nums[0] == 0) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int check = i + map.get(i);
            if (check >= target) {
                flag = true;
            } else {
                flag = false;
            }
        }

        System.out.println(flag);
    }
}
