package arrays;

public class KokoEatingBananas {
    // function to calculate the total hours to eat bananas
    static int totalHours(int[] arr, int mid) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil(arr[i] / mid);
        }
        return total;
    }

    static int minRateofEating(int[] arr, int h) {
        // first find the max element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int start = 1;
        int ans = 0;
        int end = max;
        // the range will be from 1 -> max
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int totalHours = totalHours(arr, mid);
            if (totalHours <= h) {
                ans = mid;// probable ans
                // now search for lower
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}