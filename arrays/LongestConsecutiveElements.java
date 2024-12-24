import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveElements {
    static int getLength(int[] arr) {
        int count = 0;
        int maxSubarray = Integer.MIN_VALUE;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = arr[i] * -1;
        }
        if (arr.length < 1)
            return 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1)
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        int length = getLength(arr);
        System.out.println(length);
    }

}