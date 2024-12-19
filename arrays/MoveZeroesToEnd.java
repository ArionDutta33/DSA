package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    static void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }

    // static int[] moveToEnd(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start < end) {
    // if (arr[start] == 0) {
    // swap(arr, start, end);
    // end--;
    // }
    // start++;
    // }
    // return arr;
    // }
    static int[] moveToEnd(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, start, i);
                start++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int[] movedarr = moveToEnd(arr);
        System.out.println(Arrays.toString(movedarr));
    }
}
