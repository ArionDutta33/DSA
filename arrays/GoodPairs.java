import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        int goodPairs = 0;
        // brute force
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 1; j < arr.length; j++) {
        // if (arr[i] == arr[j] && i < j)
        // goodPairs++;
        // }
        // }
        // System.out.println(goodPairs);

        // hashmap approach
        int occurences = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int instance = hashMap.getOrDefault(arr[i], 0);
            occurences += instance;
            hashMap.put(arr[i], occurences + 1);
        }
        System.out.println(occurences);

    }
}