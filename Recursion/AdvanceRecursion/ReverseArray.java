package AdvanceRecursion;

import java.util.Arrays;

import Strings.reverseString;

public class ReverseArray {
    static void reverseArray(int[] arr) {
        reverse(0, arr.length - 1, arr);
    }

    static void reverse(int startIndex, int endIndex, int[] arr) {
        if (startIndex >= endIndex)
            return;
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
        reverse(startIndex + 1, endIndex - 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
