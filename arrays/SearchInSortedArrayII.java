public class SearchInSortedArrayII {

    static boolean searchSortedArray(int[] arr, int target) {
        if (arr.length == 1)
            return arr[0] == target;
        int pivotIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] > arr[i - 1])) {
                pivotIndex = i;
                break;
            }
        }
        // search left of pivot
        int start = 0;
        int end = pivotIndex - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // found the element
                return true;
            }
        }
        if (searchRight(arr, target, pivotIndex))
            return true;
        return false;
    }

    static boolean searchRight(int[] arr, int target, int pivotIndex) {
        int start = pivotIndex;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // found the element
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1 };
        boolean res = searchSortedArray(arr, 1);
        System.out.println(res);

    }
}