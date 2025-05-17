public class Longest2Subarray {
    public static int getSubarray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;
        sum += arr[0];
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(getSubarray(new int[] { 2, 3, 5, 1, 9 }, 10));
    }
}
