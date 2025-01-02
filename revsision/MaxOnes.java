package revsision;

public class MaxOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else
                count = 0;
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}
