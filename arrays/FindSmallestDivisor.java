package arrays;

public class FindSmallestDivisor {
    // function to sum and divide
    static int sumAndDivide(int[] arr, int number) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil(arr[i] / (double) number);
        }
        return sum;
    }

    static int findMinimum(int[] arr, int threshold) {
        // find the minimum and maximum number
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // the range will be min->max
        int low = min;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int divisor = sumAndDivide(arr, mid);
            if (divisor <= threshold) {
                ans = divisor;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] res = { 1, 2, 5, 9 };
        int check = findMinimum(res, 6);
        System.out.println(check);
    }
}
