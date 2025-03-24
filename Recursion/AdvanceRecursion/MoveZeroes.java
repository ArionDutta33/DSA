package AdvanceRecursion;

import java.util.Arrays;

public class MoveZeroes {
    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;

    }

    static void moveZeroes(int[] arr) {
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] != 0) {
                j++;
                i = j;
            } else if (arr[j] == 0 && arr[i] == 0) {
                j++;
                if (arr[j] != 0 && arr[i] == 0) {
                    swap(arr, i, j);
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
