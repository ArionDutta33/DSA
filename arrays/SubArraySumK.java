package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {

    public static void main(String[] args) {
        int[] arr = { 1000000, 1000000, 1000000 };
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int sum = 0;
        int count = 0;
        int k = 2000000;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            }
        }
        int subarrayCount = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() == k) {

                subarrayCount = entry.getValue();
            }
        }
        System.out.println(subarrayCount);
    }
}