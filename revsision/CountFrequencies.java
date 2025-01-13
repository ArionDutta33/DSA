package revsision;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequencies {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int k = 0;
        int idx = 1;
        int[] res = new int[arr.length];
        while (idx <= arr.length) {
            if (!map.containsKey(idx)) {
                res[k] = 0;
            } else {
                res[k] = map.get(idx);
            }
            k++;
            idx++;
        }
        System.out.println(Arrays.toString(res));
    }
}