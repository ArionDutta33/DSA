package arrays.Searching.BinarySearch;

import java.util.Arrays;

public class CeilTheFloor {
    static int[] ceilTheFloor(int[] arr, int target) {
        Arrays.sort(arr);

        int ceil = -1;
        int floor = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (target < arr[0]) {
            floor = -1;
        }
        if (target > arr[arr.length - 1]) {
            ceil = -1;
        }
        return new int[] { floor, ceil };

    }

    public static void main(String[] args) {
        int[] arr = { 17, 23 };
        Arrays.sort(arr);

        int[] res = ceilTheFloor(arr, 37);
        System.out.println(Arrays.toString(res));

    }
}
