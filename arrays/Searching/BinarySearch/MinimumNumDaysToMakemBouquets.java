
public class MinimumNumDaysToMakemBouquets {

    static boolean isPossible(int[] arr, int day, int m, int k) {
        int counter = 0;
        int noOfBouque = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                counter++;
            } else {
                noOfBouque += (counter / k);
                counter = 0;
            }
        }
        noOfBouque += (counter / k);
        return noOfBouque >= m;
    }

    static int minimalSDay(int[] arr, int m, int k) {
        // finding the max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int low = min;
        int high = max;
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n)
            return -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        System.out.println(minimalSDay(new int[] { 1, 10, 3, 10, 2 }, 3, 1));
    }
}