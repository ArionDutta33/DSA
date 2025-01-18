package arrays.Searching.BinarySearch;

import java.util.Arrays;

public class FirstLastIndex {
    static int searchFirstIndex(int[] arr, int target, int probableElement) {
        int low = 0;
        int high = arr.length - 1;
        int ans=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-;1
            }else{}
        }
    }

    static int searchLastIndex(int[] arr, int target, int probableElement) {
        int startInedx = probableElement + 1;
        int endIndex = arr.length - 1;
        while (startInedx <= endIndex) {
            int mid = startInedx + (endIndex - startInedx) / 2;
            if (target > arr[mid]) {
                startInedx = mid + 1;
            } else if (target < arr[mid]) {
                endIndex = endIndex - 1;
            } else {
                return mid;
            }
        }
        return probableElement;
    }

    static int[] binarySearch(int[] arr, int target) {
        int firstIndex = -1;
        int lastIndex = -1;
        int startInedx = 0;
        int endIndex = arr.length - 1;
        while (startInedx <= endIndex) {
            int mid = startInedx + (endIndex - startInedx) / 2;
            if (target > arr[mid]) {
                startInedx = mid + 1;
            } else if (target < arr[mid]) {
                endIndex = mid - 1;
            } else {
                // if it is guranteed that the target element exists we found it here how find
                // the first index
                firstIndex = searchFirstIndex(arr, target, mid);
                lastIndex = searchLastIndex(arr, target, mid);
                return new int[] { firstIndex, lastIndex };
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int[] res = binarySearch(arr, 8);
        System.out.println(Arrays.toString(res));

    }
}