package revsision;

import java.util.Arrays;

public class ShuffleArray {
    static void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int j = n;
        for (int i = 1; i < n; i++) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
