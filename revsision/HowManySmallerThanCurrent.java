package revsision;

import java.util.Arrays;
import java.util.HashMap;

public class HowManySmallerThanCurrent {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = { 8, 1, 2, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        int value = arr[1];
        if (map.containsValue(arr[0])) {
            System.out.println("bigger than 8");
            return;
        }

        System.out.println("NO bigger");

    }
}