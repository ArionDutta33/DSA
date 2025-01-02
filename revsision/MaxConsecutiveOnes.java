package revsision;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hashMap.get(1));
    }
}
