import java.util.HashMap;

public class LongestSumPosNeg {
    public static int getSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int currSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int rem = currSum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLength = Math.max((maxLength), len);
            }
            if (!preSumMap.containsKey(currSum)) {
                preSumMap.put(currSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(getSubarray(new int[] { 1, 2, 3, -2, 5 }, 5));
    }

}