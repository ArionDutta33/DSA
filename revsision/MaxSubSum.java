package revsision;

public class MaxSubSum {
    public static void main(String[] args) {
        int[] arr = { -1 };
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}