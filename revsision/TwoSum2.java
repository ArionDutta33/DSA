package revsision;

import java.util.HashMap;

public class TwoSum2 {
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(arr[i])) {
                return new int[] { map.get(arr[i]), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
}
