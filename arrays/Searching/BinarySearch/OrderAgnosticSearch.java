package arrays.Searching.BinarySearch;

public class OrderAgnosticSearch {
    static int orderAgnosticSearch(int[] arr, int target) {
        boolean isAsc = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        if (isAsc) {
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
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(orderAgnosticSearch(new int[] { 10, 8, 6, 4, 2 }, 14));
    }
}
