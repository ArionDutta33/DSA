package revsision;

import java.util.HashSet;

public class LongestSubSequence {

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        int longCount = 0;
        for (Integer integer : set) {
            if (!set.contains(integer - 1)) {
                count = 1;
                int currElem = integer;
                while (set.contains(currElem + 1)) {
                    count++;
                    currElem++;
                }
                longCount = Math.max(count, longCount);
            }
        }
        System.out.println(longCount);
    }
}