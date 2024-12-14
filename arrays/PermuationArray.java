package arrays;

import java.util.Arrays;

public class PermuationArray {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
