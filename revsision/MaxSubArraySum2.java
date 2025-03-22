package revsision;

public class MaxSubArraySum2 {
    static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[] { -1, -1 }));
    }
}
