package revsision;

public class LongestSubarray {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, -10 };
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == 5) {
                    count++;
                }
                max = Math.max(max, j - i + 1);
            }
        }
        System.out.println(max);
    }
}