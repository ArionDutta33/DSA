package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class KMostFrequentELements {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);

    }
}