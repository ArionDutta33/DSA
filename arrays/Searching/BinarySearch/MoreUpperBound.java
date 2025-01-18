package arrays.Searching.BinarySearch;

public class MoreUpperBound {
    static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };
        int res = upperBound(arr, 10);
        System.out.println(res);
    }
}
