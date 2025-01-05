package revsision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class twosum {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int k = 9;
        ArrayList<Integer> list = new ArrayList<>();
        // hash all the elements as elements as key index as value
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], i);
        }

        // look up the hashtable
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(k - arr[i])) {
                list.add(hashMap.get(k - arr[i]));
            }

        }
        System.out.println(list);
    }
}