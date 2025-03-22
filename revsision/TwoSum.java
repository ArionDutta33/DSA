package revsision;

import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int element = target - arr[i];
            if (map.containsKey(element)) {
                return new int[] { map.get(element), arr[i] };
            }
            map.put(element, arr[i]);
        }
        return new int[] { -1, -1 };
    }
}
