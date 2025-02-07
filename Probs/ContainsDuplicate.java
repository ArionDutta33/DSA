package Probs;

import java.util.HashMap;

public class ContainsDuplicate {
    static void containsDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        System.out.println(map);
        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // int check = Math.abs(map.get(arr[i]) - i);
        // System.out.println(check);
        // if (check <= k) {
        // return true;
        // }
        // }
        // }
        // return false;
    }

    public static void main(String[] args) {
        containsDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2);
    }
}
