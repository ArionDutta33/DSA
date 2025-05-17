import java.util.Arrays;

public class longestSubArraySum {

    public static int longestSubArraySum(int[] arr, int sum) {
        int currSum = 0;
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    if (currSum == sum)
                        maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int res = longestSubArraySum(new int[] { 10, 5, 2, 7, 1, 9 }, 15);
        System.out.println(res);
    }
}