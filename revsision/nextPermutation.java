package revsision;

import java.util.Arrays;

public class nextPermutation {
    static void swap(int targetElement, int[] arr) {
        // find the next largest element towards right
        int maxElementRight = Integer.MIN_VALUE;
        int max = 0;
        for (int i = targetElement; i < arr.length; i++) {
            maxElementRight = Math.max(arr[i], maxElementRight);
            max = i;
        }
        int temp = arr[max];
        arr[max] = arr[targetElement];
        arr[targetElement] = temp;

    }

    static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    static int[] nextPerm(int[] arr) {
        int targetElement = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                targetElement = i - 1;
                swap(targetElement, arr);
                reverse(arr, i, arr.length - 1);
            } else {
                reverse(arr, 0, arr.length - 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPerm(new int[] { 1, 3, 4, 5, 2 })));
    }
}