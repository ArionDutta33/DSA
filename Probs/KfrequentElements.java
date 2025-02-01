package Probs;

import java.util.HashMap;
import java.util.TreeMap;

public class KfrequentElements {

    static void kfrequentElements(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(i);
        }
    }

    public static void main(String[] args) {
        kfrequentElements(new int[] { 1, 2, 2, 3, 3, 3 }, 2);
    }
}