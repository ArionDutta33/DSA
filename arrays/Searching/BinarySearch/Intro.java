//linear search
package arrays.Searching.BinarySearch;

public class Intro {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7, 45 };
        int target = 45;
        int res = binarySearch(arr, target);
        System.out.println(res);

    }
}