package arrays.Searching.BinarySearch;

import java.util.*;

public class LowerBound {

    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int n = 5, x = 7;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
