package arrays;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 15) {
                // System.out.println(arr[i]);
                break;
            }
        }
    }
}
