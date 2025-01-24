package arrays.Searching.BinarySearch;

public class FindInMountainArray {
    static int findPeak(int[] arr) {
        int peak = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            peak = Math.max(peak, arr[i]);

        }
        return peak;
    }

    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[0] < arr[arr.length - 1];

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

    static int searchFirstHalf(int[] arr, int target, int start, int end) {
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

    static int findMountainArray(int[] arr) {
        // 1,2,3,4,5,3,1
        int target = 3;
        int peak = findPeak(new int[] { 1, 2, 3, 4, 5, 3, 1 });
        int firstHalf = searchFirstHalf(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);
    }
}
