package arrays.Searching.BinarySearch;

public class SearchInSortedArray1 {
    static void searchFirstHalf(int[] arr, int pivotIndex, int target) {
        int low = 0;
        int high = pivotIndex - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println("check" + mid);
            }
        }
        System.out.println("no");

    }

    static void searchSecondHalf(int[] arr, int pivotIndex, int target) {
        int low = pivotIndex;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println("mid" + mid);
            }
        }
        System.out.println("no");
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int pivotIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] > arr[i - 1])) {
                pivotIndex = i;
                break;
            }

        }
        System.out.println(pivotIndex);
        searchFirstHalf(arr, pivotIndex, 0);
        // searchSecondHalf(arr, pivotIndex, 0);
        // int first = searchFirstHalf(arr, pivotIndex, 0);
        // int second = searchFirstHalf(arr, pivotIndex, 0);
        // System.out.println(first);
        // System.out.println(second);

    }
}
