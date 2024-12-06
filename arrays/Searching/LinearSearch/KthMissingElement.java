import java.util.Arrays;

public class KthMissingElement {

    static boolean isMissing(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] holdMissing = new int[1000];
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int missingCount = 0;
        int resultNum = -1;
        int counter = 1;
        while (missingCount < k) {
            if (isMissing(counter, arr)) {

                missingCount++;
                if (missingCount == k) {
                    resultNum = counter;
                }
            }
            counter++;
        }
        System.out.println(resultNum);
    }
}
