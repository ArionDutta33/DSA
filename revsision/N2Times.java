package revsision;

import java.util.Arrays;
import java.util.HashMap;

public class N2Times {
    static int majorityElement(int[] arr) {
        int element = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            } else if (count == 0) {
                element = arr[i];
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
        // majorityElement(new int[] { 3, 2, 3 });
    }
}
