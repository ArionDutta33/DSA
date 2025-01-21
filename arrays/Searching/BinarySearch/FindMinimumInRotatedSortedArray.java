package Searching.BinarySearch;

public class FindMinimumInRotatedSortedArray {
    static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] > arr[end]) {
                start++;
            } else if (arr[end] > arr[start]) {
                end--;
            } else {
                return arr[start];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(minimum(arr));
    }
}
