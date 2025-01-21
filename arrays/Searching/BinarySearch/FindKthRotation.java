package Searching.BinarySearch;

import java.util.ArrayList;

public class FindKthRotation {
    static int findRotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] > arr[end])
                start++;
            else
                end--;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(findRotation(arr));
    }

}
