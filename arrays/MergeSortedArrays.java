package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0;
        while (arr1[i] != 0) {
            i++;
        }
        int j = 0;
        while (j < arr2.length) {
            arr1[i] = arr2[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        mergeSortedArrays(new int[] { 1 }, new int[] {});
    }
}
