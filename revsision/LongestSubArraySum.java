package revsision;

public class LongestSubArraySum {

    public static void main(String[] args) {
        int i = 0, j = 0;
        int sum = 0;
        int k = 15;
        int length = 0;
        int max = Integer.MIN_VALUE;
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        while (j < arr.length) {
            sum += arr[j];
            if (sum == k) {
                length = j - i;
            } else if (sum > k) {
                sum = 0;
                i++;
            }
            max = Math.max(length, max);
            j++;
        }
        System.out.println(max);
    }
}