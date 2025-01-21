package Searching.BinarySearch;

public class FindPeak {
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start - (end + start) / 2;
            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {

                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(peakElement(arr));
    }
}
