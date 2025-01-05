package revsision;

import java.util.Arrays;
import java.util.*;

public class PeakAltitude {
    public static void main(String[] args) {
        int[] arr = { -4, -3, -2, -1, 4, 3, 2 };
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxNum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (sum > maxNum)
                maxNum = sum;

        }

        return maxNum;

    }
}