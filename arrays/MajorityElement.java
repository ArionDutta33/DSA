// !todo hashing
package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > arr.length / 2) {
                System.out.println(key);
                break;
            }
        }

    }

}