package arrays.Sorting.BubbleSort;

import java.util.Arrays;

public class MoreBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[i]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
